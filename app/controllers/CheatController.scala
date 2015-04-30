package controllers

import play.api.mvc.{Action, Controller}

/**
 * User: le
 * Date: 07.10.13
 */
object CheatController extends Controller{

  def cheats() = Action{
     Ok(views.html.cheats.render())
  }
}
