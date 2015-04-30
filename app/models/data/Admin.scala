package models.data

import org.squeryl.annotations.Column
import org.squeryl.{Query, KeyedEntity, Schema}
import org.squeryl.PrimitiveTypeMode._
import models.web.Page

/**
 * User: le
 * Date: 12.10.13
 * Time: 1:37
 */
case class Admin(@Column("login") var login: String,
                 @Column("password") var password: String,
                 @Column("fio") var fio: String,
                 @Column("email") var email: String,
                 @Column("blocked") var blocked: Boolean) extends Model

object Admin {

  def findByName(name: String): Option[Admin] = {
    inTransaction {
      from(AppDb.admins)(
        a => where(a.login === name and a.deleted === false) select a
      ).headOption
    }
  }

  def checkDeleted(i: Int): Boolean = {
    true
  }



}
