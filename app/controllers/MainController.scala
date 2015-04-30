package controllers

import play.api.mvc.{Action, Controller}
import models.data.{News, Video}

/**
 * User: le
 * Date: 11.09.13
 * Time: 22:11
 */
object MainController extends Controller {


  def index{
    Redirect(controllers.routes.MainController.main())
  }

  def main() = Action{
    val videoList = Video.findTop()
    val newsList = News.findAll()
    Ok(views.html.index.render(videoList, newsList));
  }

}
