package models.data

import org.squeryl.annotations.Column
import org.squeryl.PrimitiveTypeMode._
import scala.Some
import models.web.Page

/**
 * User: le
 * Date: 21.09.13
 */
case class News(@Column("name") var name: String,
                @Column("shortName") var shortName: String,
                @Column("description") var description: String,
                @Column("link") var link: String,
                @Column("tags") var tags: String,
                @Column("likeNews") var like: Int,
                @Column("introduced") var introduced: String,
                @Column("preview") var preview: String) extends Model

object News extends CRUDTrait {

  def findAll(): Seq[News] = {
    inTransaction(from(AppDb.news)(
      v => where(v.deleted === false) select (v) orderBy(v.introduced desc)).toList
    )
  }

  def findOne(id: Int): Option[News] = {
    inTransaction(from(AppDb.news)(
      v => where(v.id === id) select v).headOption
    )
  }

  def create(obj: Some[Model]): Int = {
    if (!obj.isEmpty)
      inTransaction(AppDb.news.insert(obj.get.asInstanceOf[News])).id
    else
      -1
  }

  def update(obj: Some[Model]) {
    if (!obj.isEmpty)
      inTransaction(AppDb.news.update(obj.get.asInstanceOf[News]))
  }

  def delete(id: Int) {
    inTransaction {
      val news = findOne(id)
      if (!news.isEmpty) {
        news.get.deleted = true
        AppDb.news.update(news)
      }
    }
  }

  def findTop(): Seq[News] = {
    Seq.empty
  }

  def list(page: Int = 0, pageSize: Int = 10, orderBy: Int = 1, filter: String = "%"): Page[News] = {
    val offset = pageSize * page
    val news = News.findAll()
    val totalRows = news.size
    Page(news, page, offset, totalRows)
  }
}
