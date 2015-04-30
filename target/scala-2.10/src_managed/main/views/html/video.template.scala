
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
object video extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Seq[models.data.Video],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(videoList: Seq[models.data.Video], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.105*/("""

"""),_display_(Seq[Any](/*3.2*/views/*3.7*/.html.template.main("Видео, трейлеры, прохождение", "video")/*3.67*/ {_display_(Seq[Any](format.raw/*3.69*/("""
    <div class="container" id="center-container">
        <div class="radioset-container">
            <div class="tabs">
                <input type="radio" name="tab" id="tab1" checked="checked" onclick="loadVideo ( 1 ) ;"/>
                <label class="button-category" for="tab1" alt="GTA 5 Трейлеры">Трейлеры</label>
                <input type="radio" name="tab" id="tab2" onclick="loadVideo ( 2 ) ;"/>
                <label class="button-category" for="tab2" alt="GTA 5 Клипы">Клипы</label>
                <input type="radio" name="tab" id="tab3" onclick="loadVideo ( 4 ) ;"/>
                <label class="button-category" for="tab3" alt="GTA 5 Геймплей">Геймплей</label>
                <input type="radio" name="tab" id="tab4" onclick="loadVideo ( 3 ) ;" />
                <label class="button-category" for="tab4" alt="GTA 5 Видео-гид">Видео-гид</label>
            </div>
        </div>
        <div id="videoDetails">
            <article id="center-container">
                <section class="content-list">
                    <ul>
                    """),_display_(Seq[Any](/*21.22*/for(video <- videoList) yield /*21.45*/ {_display_(Seq[Any](format.raw/*21.47*/("""
                        <li>
                            <a href=""""),_display_(Seq[Any](/*23.39*/controllers/*23.50*/.routes.VideoController.view(video.id))),format.raw/*23.88*/("""">
                            <img class="img-max-width" width="300,465" height="178.2" src="http://img.youtube.com/vi/"""),_display_(Seq[Any](/*24.119*/video/*24.124*/.link)),format.raw/*24.129*/("""/0.jpg" alt=""""),_display_(Seq[Any](/*24.143*/video/*24.148*/.name)),format.raw/*24.153*/("""">
                            </a>
                            <article class="preview-details">
                                <h3 class="post-title"><a href=""""),_display_(Seq[Any](/*27.66*/controllers/*27.77*/.routes.VideoController.view(video.id))),format.raw/*27.115*/("""">"""),_display_(Seq[Any](/*27.118*/video/*27.123*/.name)),format.raw/*27.128*/("""</a></h3>
                                <p class="excerpt">"""),_display_(Seq[Any](/*28.53*/Html(video.description))),format.raw/*28.76*/("""</p>
                            </article>
                            <a href=""""),_display_(Seq[Any](/*30.39*/controllers/*30.50*/.routes.VideoController.view(video.id))),format.raw/*30.88*/("""" class="content-list-btn">Подробнее</a>
                        </li>
                    """)))})),format.raw/*32.22*/("""
                    </ul>
                </section>
            </article>
        </div>


        <script type="text/javascript">
            function loadVideo ( categoryId ) """),format.raw/*40.47*/("""{"""),format.raw/*40.48*/("""
                jsRoutes.controllers.VideoController.loadsVideoDetails ( categoryId ).ajax ( """),format.raw/*41.94*/("""{"""),format.raw/*41.95*/("""
                    success : function ( data ) """),format.raw/*42.49*/("""{"""),format.raw/*42.50*/("""
                    $ ( "#videoDetails" ).replaceWith ( data ) ;
                    """),format.raw/*44.21*/("""}"""),format.raw/*44.22*/("""
                """),format.raw/*45.17*/("""}"""),format.raw/*45.18*/(""" )
            """),format.raw/*46.13*/("""}"""),format.raw/*46.14*/("""
        </script>
    </div>
""")))})))}
    }
    
    def render(videoList:Seq[models.data.Video],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(videoList,currentSortBy,currentOrder,currentFilter)
    
    def f:((Seq[models.data.Video],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (videoList,currentSortBy,currentOrder,currentFilter) => apply(videoList,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 28 23:05:18 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/video.scala.html
                    HASH: 6452ee735d04030a71c3747b3b23741b195713c1
                    MATRIX: 593->1|791->104|828->107|840->112|908->172|947->174|2056->1247|2095->1270|2135->1272|2239->1340|2259->1351|2319->1389|2477->1510|2492->1515|2520->1520|2571->1534|2586->1539|2614->1544|2813->1707|2833->1718|2894->1756|2934->1759|2949->1764|2977->1769|3075->1831|3120->1854|3238->1936|3258->1947|3318->1985|3442->2077|3650->2257|3679->2258|3801->2352|3830->2353|3907->2402|3936->2403|4050->2489|4079->2490|4124->2507|4153->2508|4196->2523|4225->2524
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3|42->21|42->21|42->21|44->23|44->23|44->23|45->24|45->24|45->24|45->24|45->24|45->24|48->27|48->27|48->27|48->27|48->27|48->27|49->28|49->28|51->30|51->30|51->30|53->32|61->40|61->40|62->41|62->41|63->42|63->42|65->44|65->44|66->45|66->45|67->46|67->46
                    -- GENERATED --
                */
            