package models.data

import org.squeryl.PrimitiveTypeMode._
import org.squeryl.annotations.Column
import scala.Some
import models.web.Page

/**
 * User: le
 * Date: 11.09.13
 * Time: 22:39
 */
case class Video(@Column("categoryid") var categoryId: Int,
                 @Column("name") var name: String,
                 @Column("shortName") var shortName: String,
                 @Column("description") var description: String,
                 @Column("link") var link: String,
                 @Column("link_img") var linkImg: String,
                 @Column("tags") var tags: String,
                 @Column("rating") var rating: String,
                 @Column("introduced") var introduced: String) extends Model

object Video extends CRUDTrait {

  def findAll(): Seq[Video] = {
    inTransaction(from(AppDb.videos)(
      v => where(v.deleted === false) select v).toList
    )
  }

  def findAllWithCategory(): Seq[(Video, VideoCategory)] = {
    inTransaction(from(AppDb.videos, AppDb.videoCategories)((v, vc) =>
      where(v.deleted === false
        and v.categoryId === vc.id) select(v, vc)).toList
    )
  }

  def list(page: Int = 0, pageSize: Int = 10, orderBy: Int = 1, filter: String = "%"): Page[(Video, VideoCategory)] = {
    val offset = pageSize * page
    val videos = findAllWithCategory()
    val totalRows = videos.size
    Page(videos, page, offset, totalRows)
  }

  def findOne(id: Int): Option[Video] = {
    inTransaction(from(AppDb.videos)(
      v => where(v.id === id) select v).headOption
    )
  }

  def create(obj: Some[Model]): Int = {
    if (!obj.isEmpty)
      inTransaction(AppDb.videos.insert(obj.get.asInstanceOf[Video])).id
    else
      -1
  }

  def update(obj: Some[Model]) {
    if (!obj.isEmpty)
      inTransaction(AppDb.videos.update(obj.get.asInstanceOf[Video]))
  }

  def delete(id: Int) {
    inTransaction {
      val video = findOne(id)
      if (!video.isEmpty) {
        video.get.deleted = true
        AppDb.videos.update(video)
      }
    }
  }

  def findByCategory(categoryId: Int): Seq[Video] = {
    inTransaction(from(AppDb.videos)(v =>
      where(v.categoryId === categoryId
      ) select (v) orderBy(v.introduced desc)

    ).toList
    )
  }

  def findTop(): Seq[Video] = {
    inTransaction(from(AppDb.videos) (v => where(v.linkImg isNotNull) select v).toList)
  }

}