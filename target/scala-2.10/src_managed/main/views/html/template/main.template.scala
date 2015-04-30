
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, tab: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.45*/("""

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>GTA 5 | """),_display_(Seq[Any](/*6.25*/Messages(title))),format.raw/*6.40*/(""" </title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Исследуйте огромный мир! Выполняйте захватывающие задания! Ощутите незабываемую атмосферу! Играйте в GTA 5 !">
        <meta name="keywords" content="gta,gta 5,gta5,gta v,grand theft auto v,gta 5 xbox,grant theft auto 5,гта 5,гта v,гта пять,игра gta 5,gta 5 коды,GTAV,GTA5TV,gta 5 скачать,новости gta 5,gta 5 видео">
        """),_display_(Seq[Any](/*10.10*/libs/*10.14*/._libs())),format.raw/*10.22*/("""
    </head>
    <body>
        """),_display_(Seq[Any](/*13.10*/views/*13.15*/.html.template.header(tab))),format.raw/*13.41*/("""
        <div id="bgImage"  class="bg-image"></div>
        <section id="main" class="container-main">
            """),_display_(Seq[Any](/*16.14*/content)),format.raw/*16.21*/("""
        </section>
        """),_display_(Seq[Any](/*18.10*/views/*18.15*/.html.template.footer())),format.raw/*18.38*/("""
    </body>
</html>"""))}
    }
    
    def render(title:String,tab:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,tab)(content)
    
    def f:((String,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,tab) => (content) => apply(title,tab)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 23:36:50 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/template/main.scala.html
                    HASH: 8db7d9718ed817ed30ccc757563fefc9cb132bec
                    MATRIX: 576->1|713->44|818->114|854->129|1347->586|1360->590|1390->598|1459->631|1473->636|1521->662|1673->778|1702->785|1767->814|1781->819|1826->842
                    LINES: 19->1|22->1|27->6|27->6|31->10|31->10|31->10|34->13|34->13|34->13|37->16|37->16|39->18|39->18|39->18
                    -- GENERATED --
                */
            