
package views.html

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
object news extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Seq[models.data.News],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(newsList: Seq[models.data.News], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.103*/("""

    """),_display_(Seq[Any](/*3.6*/views/*3.11*/.html.template.main("Новости", "news")/*3.49*/ {_display_(Seq[Any](format.raw/*3.51*/("""
        <div class="container" id="center-container">
            <article id="center-container">
                <section class="content-list">
                    <ul>
                    """),_display_(Seq[Any](/*8.22*/for(news <- models.data.News.findAll()) yield /*8.61*/ {_display_(Seq[Any](format.raw/*8.63*/("""
                        <li>
                            <a href=""""),_display_(Seq[Any](/*10.39*/controllers/*10.50*/.routes.NewsController.view(news.id))),format.raw/*10.86*/("""">
                                <img class="imgNewsWH img-max-width" src=""""),_display_(Seq[Any](/*11.76*/news/*11.80*/.link)),format.raw/*11.85*/("""" alt=""""),_display_(Seq[Any](/*11.93*/news/*11.97*/.name)),format.raw/*11.102*/("""" title=""""),_display_(Seq[Any](/*11.112*/news/*11.116*/.name)),format.raw/*11.121*/("""">
                            </a>
                            <div class="news-date">"""),_display_(Seq[Any](/*13.53*/news/*13.57*/.introduced)),format.raw/*13.68*/("""</div>
                            <article class="preview-details">
                                <h3 class="post-title"><a href=""""),_display_(Seq[Any](/*15.66*/controllers/*15.77*/.routes.NewsController.view(news.id))),format.raw/*15.113*/("""">"""),_display_(Seq[Any](/*15.116*/news/*15.120*/.name)),format.raw/*15.125*/("""</a></h3>
                                <div class="excerpt">"""),_display_(Seq[Any](/*16.55*/Html(news.preview))),format.raw/*16.73*/("""</div>
                            </article>
                            <a href=""""),_display_(Seq[Any](/*18.39*/controllers/*18.50*/.routes.NewsController.view(news.id))),format.raw/*18.86*/("""" class="content-list-btn">Подробнее</a>
                        </li>
                    """)))})),format.raw/*20.22*/("""
                    </ul>
                </section>
            </article>

            <script type="text/javascript">
            $ ( function ( ) """),format.raw/*26.30*/("""{"""),format.raw/*26.31*/("""
            // Button
            $ ( "#button" ).button ( ) ;
            $ ( "#button-disabled" ).button ( ).addClass ( "ui-state-disabled" ).attr ( "disabled", true ) ;
            $ ( "#radioset" ).buttonset ( ) ;
            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/(""" ) ;
            </script>


        </div>
    """)))})))}
    }
    
    def render(newsList:Seq[models.data.News],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(newsList,currentSortBy,currentOrder,currentFilter)
    
    def f:((Seq[models.data.News],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (newsList,currentSortBy,currentOrder,currentFilter) => apply(newsList,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:40 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/news.scala.html
                    HASH: af694ea6f4b245552301c2cc31cb1416165fd98b
                    MATRIX: 591->1|787->102|828->109|841->114|887->152|926->154|1153->346|1207->385|1246->387|1350->455|1370->466|1428->502|1542->580|1555->584|1582->589|1626->597|1639->601|1667->606|1714->616|1728->620|1756->625|1880->713|1893->717|1926->728|2096->862|2116->873|2175->909|2215->912|2229->916|2257->921|2357->985|2397->1003|2517->1087|2537->1098|2595->1134|2719->1226|2898->1377|2927->1378|3186->1609|3215->1610
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3|29->8|29->8|29->8|31->10|31->10|31->10|32->11|32->11|32->11|32->11|32->11|32->11|32->11|32->11|32->11|34->13|34->13|34->13|36->15|36->15|36->15|36->15|36->15|36->15|37->16|37->16|39->18|39->18|39->18|41->20|47->26|47->26|52->31|52->31
                    -- GENERATED --
                */
            