package controllers.admin

import play.api.mvc._
import play.api.cache.Cache
import play.api.libs.Crypto
import play.api.Play.current
import play.api.mvc.Call
import models.data.Admin

/**
 * User: le
 * Date: 12.10.13
 * Time: 1:33
 */
trait AdminSecured {
  val internalCallName: String = "internalAdminCall"
  val internalPathName: String = "internalAdminPath"
  val sessionAttributeName: String = "adminId"

  private def username(request: RequestHeader) = {
    val user = request.session.get(sessionAttributeName)
    if (user.nonEmpty && Admin.checkDeleted(user.get.toInt))
      user
    else None
  }

  private def onUnauthorized(request: RequestHeader) = {
    Cache.remove(internalCallName)
    Cache.set(internalPathName, new Call("GET", Crypto.encryptAES(request.uri)))
    Results.Redirect(controllers.admin.routes.AdminController.login()).withNewSession
  }

  def IsAuthenticated(f: => String => Request[AnyContent] => Result) =
    Security.Authenticated(username, onUnauthorized) {
      Cache.remove(internalCallName)
      user =>
        Action(request => f(user)(request))
    }

  def IsAuthenticated[A](p: BodyParser[A])(f: => String => Request[A] => Result) = {
    Security.Authenticated(username, onUnauthorized) {
      user =>
        Action(p)(request => f(user)(request))
    }
  }
}