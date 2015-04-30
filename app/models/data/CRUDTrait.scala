package models.data

import java.util.Calendar
import org.squeryl.annotations.Column
import org.squeryl.KeyedEntity
import java.sql.Timestamp

/**
 * User: le
 * Date: 12.09.13
 * Time: 21:48
 */
trait CRUDTrait {

  def findAll(): Seq[_]

  def findOne(id: Int): Option[_]

  def create(obj: Some[Model]): Int

  def update(obj: Some[Model]): Unit

  def delete(id: Int): Unit

}

trait Model extends KeyedEntity[Int] {
  @Column("id")
  var id = 0
  @Column("created")
  var created: Timestamp = {
    val cal = Calendar.getInstance()
    new Timestamp(cal.getTimeInMillis)
  }
  @Column("deleted")
  var deleted: Boolean = false
}

