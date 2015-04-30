package controllers.admin


import play.api.data.Form
import play.api.data.Forms._
import models.web.{NewsWeb, VideoWeb}


/**
 * User: le
 * Date: 14.09.13
 * Time: 20:54
 */
trait AdminForm {

  val loginForm = Form(
    tuple(
      "internalPath" -> text,
      "login" -> text,
      "password" -> text
    )
  )

  val videoForm = Form(
    mapping(
      "categoryId" -> number,
      "name" -> text,
      "shortName" -> text,
      "link" -> text,
      "linkImg" -> text,
      "tags" -> text,
      "description" -> text
    )(VideoWeb.apply)(VideoWeb.unapply)
  )

  val newsForm = Form(
    mapping(
      "name" -> text,
      "shortName" -> text,
      "description" -> text,
      "link" -> text,
      "tags" -> text,
      "like" -> number,
      "preview" -> text
    )(NewsWeb.apply)(NewsWeb.unapply)
  )

}
