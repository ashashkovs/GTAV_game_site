package controllers.admin

import models.data.Video
import play.api.mvc.Controller

/**
 * User: le
 * Date: 11.09.13
 * Time: 22:09
 */
object VideoController extends Controller with AdminForm with AdminSecured {

  def index = IsAuthenticated {
    username => implicit request =>
    Ok("index")
  }

  def list(page: Int, orderBy: Int, filter: String) =IsAuthenticated {
    username => implicit request =>
      val videos = Video.list(page = page, orderBy = orderBy, filter = ("%" + filter + "%"))
      Ok(views.html.admin.video.list(videos, orderBy, currentFilter = filter))
  }

  def create() = IsAuthenticated {
    username => implicit request =>
    Ok(views.html.admin.video.createVideo(videoForm))
  }

  def edit(id: Int) =IsAuthenticated {
    username => implicit request =>
    Ok(views.html.admin.video.editVideo(id, videoForm))
  }

  def createPost() = IsAuthenticated {
    username => implicit request =>
    Ok(views.html.admin.video.createVideo(videoForm))
  }

  def editPost(id: Int) = IsAuthenticated {
    username => implicit request =>
    Ok(views.html.admin.video.editVideo(id, videoForm))
  }

  //  def createPost() = Action {
  //    username => implicit request =>
  //      videoForm.bindFromRequest().fold(
  //        errors => {
  //          BadRequest(views.html.video.createVideo(errors, scala.collection.mutable.Map()))
  //        },
  //        form => {
  //          val errors = measureForm.fill(form)
  //          val errorsMeasure = MeasureWeb.checkFormValid(form)
  //          if (errors.hasErrors || !errorsMeasure.isEmpty) {
  //            BadRequest(views.html.billing.settings.createMeasure(errors, errorsMeasure))
  //          } else {
  //            val measure = MeasureWeb.convertWebToMeasure(form)
  //            Measure.create(Some(measure))
  //            BillingLogBean.createOperatorActivityRecord(BillingActivityType.MEASURE_CREATED, Some(username.toInt),
  //              objectType = Some("measure"), objectId = Some(measure.id))
  //            Redirect(routes.SettingsController.units())
  //              .flashing("success" -> "Billing.settings.measure.createNew.ok")
  //          }
  //        }
  //      )
  //  }

  def delete(id: Int) = IsAuthenticated {
    username => implicit request =>
    Ok("delete")
  }

}
