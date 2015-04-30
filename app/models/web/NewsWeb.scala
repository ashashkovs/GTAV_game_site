package models.web

import models.data.News

/**
 * User: le
 * Date: 21.09.13
 */
case class NewsWeb (name: String,
                    shortName: String,
                    description: String,
                    link: String,
                    tags: String,
                    like: Int,
                    preview:String)

object NewsWeb {


  def convertWebToObject(newsWeb: NewsWeb): News = {
    News(newsWeb.name,newsWeb.shortName, newsWeb.description,newsWeb.link,newsWeb.tags,newsWeb.like,"",newsWeb.preview)
  }

  def convertObjectToWeb(news: News): NewsWeb = {
    NewsWeb(news.name, news.shortName, news.description,news.link,news.tags,news.like,news.preview)
  }



}
