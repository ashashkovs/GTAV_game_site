package models.data

import org.squeryl.Schema

/**
 * User: le
 * Date: 12.09.13
 * Time: 21:54
 */
object AppDb extends Schema {

  val photos = table[Photo]("Photo")
  val videos = table[Video]("Video")
  val videoCategories = table[VideoCategory]("VideoCategory")
  val news = table[News]("News")
  val admins = table[Admin]("Admin")


}
