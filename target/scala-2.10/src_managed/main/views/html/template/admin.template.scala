
package views.html.template

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
object admin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,Boolean,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, tab: String, isLogin: Boolean = false)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""

<!DOCTYPE html>
<html lang="en">
<head>
    <title>"""),_display_(Seq[Any](/*6.13*/Messages(title))),format.raw/*6.28*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        """),_display_(Seq[Any](/*8.10*/libs/*8.14*/.admin_libs())),format.raw/*8.27*/("""
</head>
<body>
    <header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav" role="banner">
        <div class="container">
            <div class="navbar-header">
                <button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".bs-navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                </button>
                <a href="../" class="navbar-brand">GTA5 TV</a>
            </div>
            """),_display_(Seq[Any](/*19.14*/if(!isLogin)/*19.26*/{_display_(Seq[Any](format.raw/*19.27*/("""
                <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
                    <p class="navbar-text pull-right">
                        <a href="/admin/logout" class="navbar-link">Выйти</a>
                    </p>
                    <ul class="nav navbar-nav">
                        <li class=""""),_display_(Seq[Any](/*25.37*/if(tab == "news")/*25.54*/{_display_(Seq[Any](format.raw/*25.55*/("""active""")))})),format.raw/*25.62*/("""">
                            <a href=""""),_display_(Seq[Any](/*26.39*/controllers/*26.50*/.admin.routes.NewsController.list())),format.raw/*26.85*/("""">Новости</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*28.37*/if(tab == "video")/*28.55*/{_display_(Seq[Any](format.raw/*28.56*/("""active""")))})),format.raw/*28.63*/("""">
                            <a href=""""),_display_(Seq[Any](/*29.39*/controllers/*29.50*/.admin.routes.VideoController.list())),format.raw/*29.86*/("""">Видео</a>
                        </li>
                    </ul>
                </nav>
            """)))})),format.raw/*33.14*/("""
        </div>
    </header>
    <section id="main" class="container-main">
        <div class="container"  id="center-container">
            """),_display_(Seq[Any](/*38.14*/content)),format.raw/*38.21*/("""
        </div>
    </section>
</body>
</html>"""))}
    }
    
    def render(title:String,tab:String,isLogin:Boolean,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,tab,isLogin)(content)
    
    def f:((String,String,Boolean) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,tab,isLogin) => (content) => apply(title,tab,isLogin)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/template/admin.scala.html
                    HASH: 0424d7a79a7f27b773871bd1273bf0849a92ce98
                    MATRIX: 585->1|748->70|837->124|873->139|1001->232|1013->236|1047->249|1563->729|1584->741|1623->742|1994->1077|2020->1094|2059->1095|2098->1102|2175->1143|2195->1154|2252->1189|2368->1269|2395->1287|2434->1288|2473->1295|2550->1336|2570->1347|2628->1383|2764->1487|2945->1632|2974->1639
                    LINES: 19->1|22->1|27->6|27->6|29->8|29->8|29->8|40->19|40->19|40->19|46->25|46->25|46->25|46->25|47->26|47->26|47->26|49->28|49->28|49->28|49->28|50->29|50->29|50->29|54->33|59->38|59->38
                    -- GENERATED --
                */
            