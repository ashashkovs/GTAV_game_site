package controllers

import play.api.mvc.{Action, Controller}

/**
 * User: le
 * Date: 13.10.13
 */
object RadioController extends Controller{

  def radio() = Action{
     Ok(views.html.radio.render())
  }
}
