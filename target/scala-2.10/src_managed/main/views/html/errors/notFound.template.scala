
package views.html.errors

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object notFound extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(requestPath: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""

"""),_display_(Seq[Any](/*3.2*/template/*3.10*/.main("Ошибка 404", "")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    <div class="container" id="center-container">
        <div id="errors">
            <h1> 404: Страница не найдена </h1>
            <fieldset>
                <p> К сожалению, мы не смогли найти страницу ["""),_display_(Seq[Any](/*8.64*/requestPath)),format.raw/*8.75*/("""] </p>
                <p> Вернуться на <a href=""""),_display_(Seq[Any](/*9.44*/routes/*9.50*/.Application.index())),format.raw/*9.70*/(""""> главную </a>.</p>
            </fieldset>
        </div>
    </div>
""")))})),format.raw/*13.2*/("""
"""))}
    }
    
    def render(requestPath:String): play.api.templates.HtmlFormat.Appendable = apply(requestPath)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (requestPath) => apply(requestPath)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/errors/notFound.scala.html
                    HASH: 77c4e011ace8795a0ee1e37aff76929efe1995e7
                    MATRIX: 566->1|681->22|718->25|734->33|765->56|804->58|1050->269|1082->280|1167->330|1181->336|1222->356|1325->428
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3|29->8|29->8|30->9|30->9|30->9|34->13
                    -- GENERATED --
                */
            