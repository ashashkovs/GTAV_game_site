package models.web

import models.data.Video

/**
 * User: le
 * Date: 11.09.13
 * Time: 22:43
 */
case class VideoWeb(categoryId: Int,
                    name: String,
                    shortName: String,
                    link: String,
                    linkImg: String,
                    tags: String,
                    description: String)

object VideoWeb {

  def convertWebToObject(videoWeb: VideoWeb): Video = {
    Video(videoWeb.categoryId, videoWeb.name, videoWeb.shortName, videoWeb.description, videoWeb.link, videoWeb.linkImg, videoWeb.tags, "", "")
  }

  def convertObjectToWeb(video: Video): VideoWeb = {
    VideoWeb(video.categoryId, video.name, video.shortName, video.link, video.linkImg, video.tags, video.description)
  }


}