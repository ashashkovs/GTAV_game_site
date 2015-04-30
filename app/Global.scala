import models.enums.ErrorType
import concurrent.Future
import org.squeryl.adapters.MySQLInnoDBAdapter
import org.squeryl.internals.DatabaseAdapter
import org.squeryl.{Session, SessionFactory}
import play.api.db.DB
import play.api.http.ContentTypes._
import play.api.libs.json.{Json, JsValue}
import play.api.mvc.Results._
import play.api.{Logger, GlobalSettings, Application}
import scala.concurrent.ExecutionContext.Implicits.global
import play.api.mvc._
/**
 * User: le
 * Date: 12.09.13
 * Time: 22:57
 */
object Global extends GlobalSettings {

  override def onStart(app: Application) {
    SessionFactory.concreteFactory = app.configuration.getString("db.default.driver") match {
      case Some("com.mysql.jdbc.Driver") => Some(() => getSession(new MySQLInnoDBAdapter, app))
      case _ => sys.error("Database driver must be org.h2.Driver or net.sourceforge.jtds.jdbc.Driver")
    }
  }

  def getSession(adapter: DatabaseAdapter, app: Application) = Session.create(DB.getConnection()(app), adapter)

  override def onHandlerNotFound(request: RequestHeader) = Future ({
    val i = request.path.split("/")
    if (i.length > 0 && i(1) == "api") {
      val message = "No method found"
      val json = renderErrorJson(ErrorType.NOT_FOUND, message)
      NotFound(json).as(JSON).withHeaders(renderErrorHeaders(ErrorType.NOT_FOUND, message): _*)
    } else {
      NotFound(views.html.errors.notFound(request.path))
    }
  })

  override def onError(request: RequestHeader, ex: Throwable) = Future({
    val i = request.path.split("/")
    if(i.length > 0 && i(1) == "api") {
      InternalServerError(renderInternalServerErrorJson(ex)).as(JSON).withHeaders(renderErrorHeaders(ErrorType.INTERNAL_SERVER_ERROR, ex.toString): _*)
    } else {
      Redirect(controllers.routes.MainController.main())
    }
  })

  def renderErrorJson(error: ErrorType.Value, message: String): JsValue = Json.toJson(Map("error" -> error.toString, "message" -> message))

  def renderErrorHeaders(error: ErrorType.Value, message: String): Seq[(String, String)] = {
    val firstHeader = ("X-Api-Error-Guid", error.toString)
    val secondHeader = ("X-Api-Error-Message", message)
    Seq(firstHeader, secondHeader)
  }

  def renderInternalServerErrorJson(e : Throwable) : JsValue = {
    Logger.error("error" + e)
    renderErrorJson(ErrorType.INTERNAL_SERVER_ERROR, e.toString)
  }

}

