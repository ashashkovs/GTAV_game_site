package models.enums

/**
 * User: le
 * Date: 30.09.13
 * Time: 18:33
 */
class ErrorType extends Enumeration {
  type ErrorType = Value
  val NOT_FOUND  = Value(1, "ErrorType.NOT_FOUND")
  val INTERNAL_SERVER_ERROR = Value(2, "ErrorType.INTERNAL_SERVER_ERROR")
  val BAD_REQUEST = Value(3, "ErrorType.BAD_REQUEST")
  val FORBIDDEN = Value(4, "ErrorType.FORBIDDEN")
  val UNAUTHORIZED = Value(5, "ErrorType.UNAUTHORIZED")
}

object ErrorType extends ErrorType {
  def forName(s: String) = values.find(_.id.toString == s) match {
    case Some(x) => x.asInstanceOf[ErrorType]
    case None => throw new java.util.NoSuchElementException(s)
  }
}
