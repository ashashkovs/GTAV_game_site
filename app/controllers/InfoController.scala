package controllers

import play.api.mvc.{Action, Controller}

/**
 * User: le
 * Date: 07.10.13
 */
object InfoController extends Controller{

  def hints() = Action{
     Ok(views.html.hints.render())
  }

  def maps() = Action{
    Ok(views.html.maps.render())
  }
}
