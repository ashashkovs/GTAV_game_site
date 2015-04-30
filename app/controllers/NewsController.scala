package controllers

import play.api.mvc.{Action, Controller}
import models.data.News

/**
 * User: le
 * Date: 21.09.13
 */
object NewsController extends Controller{

  def newsList(page: Int, sortBy: String, order: String, filter: String) = Action {
    Ok(views.html.news.render(models.data.News.findAll(), sortBy, order, filter))
  }

  def view(id: Int)=Action{
    val news_page = News.findOne(id).get
    Ok(views.html.viewNewsPage.render(news_page))
  }
}
