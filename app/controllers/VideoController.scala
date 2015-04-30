package controllers

import play.api.mvc.{Action, Controller}
import models.data.Video
import play.api.data.Form


/**
 * User: le
 * Date: 11.09.13
 * Time: 22:35
 */
object VideoController extends Controller {


  def videoList(page: Int, sortBy: String, order: String, filter: String) = Action {
    Ok(views.html.video.render(models.data.Video.findByCategory(1), sortBy, order, filter))
  }


  def loadsVideoDetails(id:Int) = Action {

      Ok(views.html.videoDetails(Video.findByCategory(id)))
  }

  def view(id: Int) = Action {
    val video = Video.findOne(id).get
    Ok(views.html.viewVideoPage.render(video))
  }


}
