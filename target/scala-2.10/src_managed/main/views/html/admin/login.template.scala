
package views.html.admin

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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[scala.Tuple3[String, String, String]],play.api.mvc.Flash,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[(String, String, String)])(implicit flash: play.api.mvc.Flash):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.api.cache.Cache

import play.api.Play.current

import helper._

implicit def /*7.2*/implicitFieldConstructor/*7.26*/ = {{
    FieldConstructor(views.html.template.fields.bootstrapInput.render)
}};
Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*9.2*/("""

"""),_display_(Seq[Any](/*11.2*/views/*11.7*/.html.template.admin("Админка", "", true)/*11.48*/ {_display_(Seq[Any](format.raw/*11.50*/("""
    """),_display_(Seq[Any](/*12.6*/loginForm/*12.15*/.globalError.map/*12.31*/ { error =>_display_(Seq[Any](format.raw/*12.42*/("""
        <div class="alert alert-danger">
            <button type="button" class="close" data-dismiss="alert"> &times; </button>
            """),_display_(Seq[Any](/*15.14*/Messages(error.message))),format.raw/*15.37*/("""
        </div>   """)))})),format.raw/*16.19*/("""
    """),_display_(Seq[Any](/*17.6*/flash/*17.11*/.get("success").map/*17.30*/ { message =>_display_(Seq[Any](format.raw/*17.43*/("""
        <div class="alert alert-success">
            <button type="button" class="close" data-dismiss="alert"> &times; </button>
            """),_display_(Seq[Any](/*20.14*/Messages(message))),format.raw/*20.31*/("""
        </div>
    """)))})),format.raw/*22.6*/("""

    <div class="well">
        """),_display_(Seq[Any](/*25.10*/helper/*25.16*/.form(controllers.admin.routes.AdminController.auth())/*25.70*/ {_display_(Seq[Any](format.raw/*25.72*/("""
            <input id="internalPath" type="hidden" value=""""),_display_(Seq[Any](/*26.60*/{
                Cache.get("internalLegalPath")
            })),format.raw/*28.14*/("""" name="internalPath" />
            """),_display_(Seq[Any](/*29.14*/inputText( loginForm("login"), '_label -> "Логин", 'class -> "form-control"))),format.raw/*29.90*/("""
            """),_display_(Seq[Any](/*30.14*/inputText( loginForm("password"), '_label -> "Пароль", 'class -> "form-control"))),format.raw/*30.94*/("""
            <div class="actions">
                <input type="submit" class="btn btn-primary" value="Войти" >
            </div>
        """)))})),format.raw/*34.10*/("""
    </div>

""")))})))}
    }
    
    def render(loginForm:Form[scala.Tuple3[String, String, String]],flash:play.api.mvc.Flash): play.api.templates.HtmlFormat.Appendable = apply(loginForm)(flash)
    
    def f:((Form[scala.Tuple3[String, String, String]]) => (play.api.mvc.Flash) => play.api.templates.HtmlFormat.Appendable) = (loginForm) => (flash) => apply(loginForm)(flash)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/admin/login.scala.html
                    HASH: 7526a3bd9097669cbf0322c45e96e1e1e5b67806
                    MATRIX: 617->1|857->160|889->184|997->80|1025->158|1052->262|1090->265|1103->270|1153->311|1193->313|1234->319|1252->328|1277->344|1326->355|1505->498|1550->521|1601->540|1642->546|1656->551|1684->570|1735->583|1915->727|1954->744|2006->765|2076->799|2091->805|2154->859|2194->861|2290->921|2374->983|2448->1021|2546->1097|2596->1111|2698->1191|2870->1331
                    LINES: 19->1|26->7|26->7|29->1|31->6|32->9|34->11|34->11|34->11|34->11|35->12|35->12|35->12|35->12|38->15|38->15|39->16|40->17|40->17|40->17|40->17|43->20|43->20|45->22|48->25|48->25|48->25|48->25|49->26|51->28|52->29|52->29|53->30|53->30|57->34
                    -- GENERATED --
                */
            