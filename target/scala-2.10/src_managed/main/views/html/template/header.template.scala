
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
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tab: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.15*/("""

<header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav" role="banner">
<div class="container">
    <div class="navbar-header">
        <button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".bs-navbar-collapse">
            <span class="sr-only"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a href=""""),_display_(Seq[Any](/*12.19*/controllers/*12.30*/.routes.MainController.main())),format.raw/*12.59*/("""" class="navbar-brand" style="padding: 4px 15px">
            <img class="img-max-width" src=""""),_display_(Seq[Any](/*13.46*/routes/*13.52*/.Assets.at("images/gta5LogoHed2.png"))),format.raw/*13.89*/("""" alt="Header GTA 5 TV">
        </a>
    </div>

    <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
        <ul class="nav navbar-nav" style="text-transform: uppercase;font-size: 15px">
            <li class=""""),_display_(Seq[Any](/*19.25*/if(tab == "main")/*19.42*/ {_display_(Seq[Any](format.raw/*19.44*/("""active""")))})),format.raw/*19.51*/("""">
                <a href=""""),_display_(Seq[Any](/*20.27*/controllers/*20.38*/.routes.MainController.main())),format.raw/*20.67*/(""""> Главная </a>
            </li>
            <li class=""""),_display_(Seq[Any](/*22.25*/if(tab == "news")/*22.42*/ {_display_(Seq[Any](format.raw/*22.44*/("""active""")))})),format.raw/*22.51*/("""">
                <a href=""""),_display_(Seq[Any](/*23.27*/controllers/*23.38*/.routes.NewsController.newsList(1, "", "", ""))),format.raw/*23.84*/(""""> Новости </a>
            </li>
            <li class=""""),_display_(Seq[Any](/*25.25*/if(tab == "video")/*25.43*/ {_display_(Seq[Any](format.raw/*25.45*/("""active""")))})),format.raw/*25.52*/("""">
                <a href=""""),_display_(Seq[Any](/*26.27*/controllers/*26.38*/.routes.VideoController.videoList(1, "", "", ""))),format.raw/*26.86*/(""""> Видео </a>
            </li>
            <li class=""""),_display_(Seq[Any](/*28.25*/if(tab == "photo")/*28.43*/ {_display_(Seq[Any](format.raw/*28.45*/("""active""")))})),format.raw/*28.52*/("""">
                <a href=""""),_display_(Seq[Any](/*29.27*/controllers/*29.38*/.routes.PhotoController.photoList())),format.raw/*29.73*/(""""> Фото </a>
            </li>
            <li class="dropdown """),_display_(Seq[Any](/*31.34*/if(tab == "hints" || tab == "maps")/*31.69*/ {_display_(Seq[Any](format.raw/*31.71*/("""active""")))})),format.raw/*31.78*/("""" id="fat-menu"><a class="dropdown-toggle" id="dropInfo" role="button" href="#" data-toggle="dropdown">Инфо<b class="caret"></b></a>
                <ul class="dropdown-menu" role="menu">
                        <li><a tabindex="-1" href=""""),_display_(Seq[Any](/*33.53*/controllers/*33.64*/.routes.InfoController.hints())),format.raw/*33.94*/("""">Cоветы и подсказки</a></li>
                        <li><a tabindex="-1" href=""""),_display_(Seq[Any](/*34.53*/controllers/*34.64*/.routes.InfoController.maps())),format.raw/*34.93*/("""">Карты</a></li>
                </ul>
            </li>
            <li class=""""),_display_(Seq[Any](/*37.25*/if(tab == "cheats")/*37.44*/ {_display_(Seq[Any](format.raw/*37.46*/("""active""")))})),format.raw/*37.53*/("""">
                <a href=""""),_display_(Seq[Any](/*38.27*/controllers/*38.38*/.routes.CheatController.cheats())),format.raw/*38.70*/(""""> Коды </a>
            </li>
            <li class=""""),_display_(Seq[Any](/*40.25*/if(tab == "radio")/*40.43*/ {_display_(Seq[Any](format.raw/*40.45*/("""active""")))})),format.raw/*40.52*/("""">
                <a href=""""),_display_(Seq[Any](/*41.27*/controllers/*41.38*/.routes.RadioController.radio())),format.raw/*41.69*/(""""> Радио </a>
            </li>
        </ul>
    </nav>
</div>
</header>"""))}
    }
    
    def render(tab:String): play.api.templates.HtmlFormat.Appendable = apply(tab)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (tab) => apply(tab)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 28 23:00:47 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/template/header.scala.html
                    HASH: 23e1e7cbe885e7c5add92169d0e4d177a73486c0
                    MATRIX: 566->1|673->14|1166->471|1186->482|1237->511|1368->606|1383->612|1442->649|1718->889|1744->906|1784->908|1823->915|1888->944|1908->955|1959->984|2053->1042|2079->1059|2119->1061|2158->1068|2223->1097|2243->1108|2311->1154|2405->1212|2432->1230|2472->1232|2511->1239|2576->1268|2596->1279|2666->1327|2758->1383|2785->1401|2825->1403|2864->1410|2929->1439|2949->1450|3006->1485|3106->1549|3150->1584|3190->1586|3229->1593|3505->1833|3525->1844|3577->1874|3695->1956|3715->1967|3766->1996|3883->2077|3911->2096|3951->2098|3990->2105|4055->2134|4075->2145|4129->2177|4220->2232|4247->2250|4287->2252|4326->2259|4391->2288|4411->2299|4464->2330
                    LINES: 19->1|22->1|33->12|33->12|33->12|34->13|34->13|34->13|40->19|40->19|40->19|40->19|41->20|41->20|41->20|43->22|43->22|43->22|43->22|44->23|44->23|44->23|46->25|46->25|46->25|46->25|47->26|47->26|47->26|49->28|49->28|49->28|49->28|50->29|50->29|50->29|52->31|52->31|52->31|52->31|54->33|54->33|54->33|55->34|55->34|55->34|58->37|58->37|58->37|58->37|59->38|59->38|59->38|61->40|61->40|61->40|61->40|62->41|62->41|62->41
                    -- GENERATED --
                */
            