package models.data

import org.squeryl.PrimitiveTypeMode._
import org.squeryl.annotations.Column
import scala.Some

/**
 * User: le
 * Date: 11.09.13
 * Time: 22:44
 */
case class VideoCategory(@Column("name") var name: String) extends Model

object VideoCategory extends CRUDTrait {

  def options: Map[String, String] = {
    val videoCategories = findAll()
    val options = scala.collection.mutable.Map.empty[String, String]
    videoCategories.foreach(vc => options.put(vc.id.toString,vc.name))
    options.toMap
  }

  def findAll(): Seq[VideoCategory] = {
    inTransaction(from(AppDb.videoCategories)(
      vc => where(vc.deleted === false) select vc).toList
    )
  }

  def findOne(id: Int): Option[VideoCategory] = {
    inTransaction(from(AppDb.videoCategories)(
      v => where(v.id === id) select v).headOption
    )
  }

  def create(obj: Some[Model]): Int = {
    if (!obj.isEmpty)
      inTransaction(AppDb.videoCategories.insert(obj.get.asInstanceOf[VideoCategory])).id
    else
      -1
  }

  def update(obj: Some[Model]) {
    if (!obj.isEmpty)
      inTransaction(AppDb.videoCategories.update(obj.asInstanceOf[VideoCategory]))
  }

  def delete(id: Int) {
    inTransaction {
      val videoCategory = findOne(id)
      if (!videoCategory.isEmpty) {
        videoCategory.get.deleted = true
        AppDb.videoCategories.update(videoCategory)
      }
    }
  }
}