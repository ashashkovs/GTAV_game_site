package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Redirect(controllers.routes.MainController.main())
  }

  def javascriptRoutes = Action {
    implicit request =>
      import routes.javascript._
      Ok(
        Routes.javascriptRouter("jsRoutes")(
          controllers.routes.javascript.VideoController.loadsVideoDetails,
          controllers.routes.javascript.PhotoController.loadsPhotoDetails
        )
        ).as("text/javascript")
  }
}