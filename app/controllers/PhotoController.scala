package controllers

import play.api.mvc.{Action, Controller}
import models.data.Photo

/**
 * User: le
 * Date: 11.09.13
 * Time: 22:45
 */
object PhotoController extends Controller{

  def photoList() = Action{
     Ok(views.html.photo.render(models.data.Photo.findByCategory(1)))
  }

  def loadsPhotoDetails(id:Int) = Action {
    Ok(views.html.photoDetails(Photo.findByCategory(id))).as(TEXT)
  }
}
