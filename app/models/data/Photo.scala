package models.data

import org.squeryl.annotations._
import org.squeryl.PrimitiveTypeMode._
import scala.Some
import models.web.Page

/**
 * User: le
 * Date: 14.09.13
 * Time: 21:37
 */
case class Photo(@Column("linkA") var linkA: String,
                 @Column("linkB") var linkB: String,
                 @Column("categoryid") var categoryId: Int) extends Model

object Photo extends CRUDTrait {

  def findAll(): Seq[Photo] = {
    inTransaction(from(AppDb.photos)(
      v => where(v.deleted === false) select v).toList
    )
  }

  def findByCategory(categoryId: Int): Seq[Photo] = {
    inTransaction(from(AppDb.photos)(p =>
      where(p.deleted === false and p.categoryId === categoryId
      ) select p
    ).toList
    )
  }

//  def findAllWithCategory(): Seq[(Video, VideoCategory)] = {
//    inTransaction(from(AppDb.videos, AppDb.videoCategories)((v, vc) =>
//      where(v.deleted === false
//        and v.categoryId === vc.id) select(v, vc)).toList
//    )
//  }
//
//  def list(page: Int = 0, pageSize: Int = 10, orderBy: Int = 1, filter: String = "%"): Page[(Video, VideoCategory)] = {
//    val offset = pageSize * page
//    val videos = findAllWithCategory()
//    val totalRows = videos.size
//    Page(videos, page, offset, totalRows)
//  }

  def findOne(id: Int): Option[Photo] = {
    inTransaction(from(AppDb.photos)(
      v => where(v.id === id) select v).headOption
    )
  }

  def create(obj: Some[Model]): Int = {
    if (!obj.isEmpty)
      inTransaction(AppDb.photos.insert(obj.get.asInstanceOf[Photo])).id
    else
      -1
  }

  def update(obj: Some[Model]) {
    if (!obj.isEmpty)
      inTransaction(AppDb.photos.update(obj.asInstanceOf[Photo]))
  }

  def delete(id: Int) {
    inTransaction {
      val photo = findOne(id)
      if (!photo.isEmpty) {
        photo.get.deleted = true
        AppDb.photos.update(photo)
      }
    }
  }

}