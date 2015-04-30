package controllers.admin

import play.api.mvc.Controller
import models.data.{News, Video}
import models.web.NewsWeb

/**
 * User: le
 * Date: 13.10.13
 * Time: 15:11
 */
object NewsController extends Controller with AdminForm with AdminSecured {

  def list(page: Int, orderBy: Int, filter: String) = IsAuthenticated {
    username => implicit request =>
      val news = News.list(page = page, orderBy = orderBy, filter = ("%" + filter + "%"))
      Ok(views.html.admin.news.list(news, orderBy, currentFilter = filter))
  }

  def edit(id: Int) = IsAuthenticated {
    username => implicit request =>
      val news = News.findOne(id)
      News.update(Some(news.get))
      val newsWeb = NewsWeb.convertObjectToWeb(news.get)
      Ok(views.html.admin.news.edit(id, newsForm.fill(newsWeb)))
  }

  def editPost(id: Int) = IsAuthenticated {
    username => implicit request =>
      newsForm.bindFromRequest().fold(
        errors => {
          BadRequest(views.html.admin.news.edit(id, errors))
        },
        form => {
          val errors = newsForm.fill(form)
          if (errors.hasErrors) {
            BadRequest(views.html.admin.news.edit(id, errors))
          } else {
            val news = News.findOne(id)
            news.get.name = form.name
            news.get.link = form.link
            news.get.description = form.description
            news.get.shortName = form.shortName
            news.get.like = form.like
            news.get.tags = form.tags
            News.update(Some(news.get))
            Redirect(routes.NewsController.list())
          }
        }
      )
  }
}
