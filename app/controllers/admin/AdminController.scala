package controllers.admin

import play.api.mvc.{Call, Controller, Action}
import models.data.Admin
import play.api.cache.Cache
import play.api.libs.Crypto
import play.api.Play.current
import org.mindrot.jbcrypt.BCrypt

/**

 * User: le
 * Date: 12.10.13
 * Time: 1:47
 */
object AdminController extends Controller with AdminForm with AdminSecured {

  def admin = Action {
    implicit request =>
      if (request.session.get(sessionAttributeName) != None
        && request.session.get(sessionAttributeName).get(0).toString != None) {
        Redirect(controllers.admin.routes.NewsController.list())
      } else {
        Ok(views.html.admin.login(loginForm))
      }
  }

  def login = Action {
    implicit request =>
      Ok(views.html.admin.login(loginForm))
  }

  def logout = Action {
    implicit request =>
      Redirect(controllers.admin.routes.AdminController.login()).withNewSession
  }

  def auth = Action {
    implicit request =>
      loginForm.bindFromRequest.fold(
        formWithErrors => BadRequest(views.html.admin.login(formWithErrors)),
        user => {
          var errors = loginForm.fill(user)
          val admin = Admin.findByName(user._2)
          if (!admin.isEmpty) {
            if (!admin.get.blocked) {
              val hash: String = admin.get.password.trim
              if (BCrypt.checkpw(user._3, hash)) {
                Cache.remove(internalPathName)
                Redirect(if (user._1.nonEmpty) {
                  new Call("GET", Crypto.decryptAES(user._1))
                } else {
                  controllers.admin.routes.AdminController.admin()
                }).withSession(sessionAttributeName -> admin.get.id.toString)
              } else {
                errors = errors.withGlobalError("Неверный логин или пароль")
                BadRequest(views.html.admin.login(errors))
              }
            } else {
              errors = errors.withGlobalError("Ваша учетная запись заблокирована")
              BadRequest(views.html.admin.login(errors))
            }
          } else {
            errors = errors.withGlobalError("Неверный логин или пароль")
            BadRequest(views.html.admin.login(errors))
          }
        })
  }
}
