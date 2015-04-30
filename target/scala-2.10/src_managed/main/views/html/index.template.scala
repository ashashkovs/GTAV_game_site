
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Seq[models.data.Video],Seq[models.data.News],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(topVideoList: Seq[models.data.Video], topNewsList: Seq[models.data.News]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.76*/("""

"""),_display_(Seq[Any](/*3.2*/views/*3.7*/.html.template.main("Grand Theft Auto V | Видео, новости, коды, прохождение, скриншоты, карты, радио - GTA5TV.ru", "main")/*3.129*/ {_display_(Seq[Any](format.raw/*3.131*/("""
    <div class="container" id="center-container">
        <div id="carousel-gta-captions" class="carousel slide bs-docs-carousel-gta">
            <ol class="carousel-indicators" style="visibility : hidden ;">
                <li data-target="#carousel-gta-captions" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-gta-captions" data-slide-to="1" class=""></li>
                <li data-target="#carousel-gta-captions" data-slide-to="2" class=""></li>
                <li data-target="#carousel-gta-captions" data-slide-to="3" class=""></li>
            </ol>
            <div class="carousel-inner" style="-webkit-box-shadow: 0 0 8px 0 #000000; box-shadow: 0 0 8px 0 #000000;">
                <div class="item active">
                    <a href=""""),_display_(Seq[Any](/*14.31*/controllers/*14.42*/.routes.VideoController.videoList(1, "", "", ""))),format.raw/*14.90*/("""">
                        <img class="img-max-width" class="img-max-width" src=""""),_display_(Seq[Any](/*15.80*/routes/*15.86*/.Assets.at("images/banner-01.jpg"))),format.raw/*15.120*/("""" alt="">
                    </a>
                    <span class="image-caption-banner current" style="opacity : 0.7 ; width : 100% ; bottom : 0px ; margin-top : 35% ;">
                        <div class="caption-banner">
                            <div class="image-desc">Исследуйте огромный мир!</div>
                        </div>
                    </span>
                    <div class="carousel-caption">
                        <h3></h3>
                        <p></p>
                    </div>
                </div>
                <div class="item">
                    <a href=""""),_display_(Seq[Any](/*28.31*/controllers/*28.42*/.routes.VideoController.videoList(1, "", "", ""))),format.raw/*28.90*/("""">
                        <img class="img-max-width" src=""""),_display_(Seq[Any](/*29.58*/routes/*29.64*/.Assets.at("images/banner-02.jpg"))),format.raw/*29.98*/("""" alt="">
                    </a>
                    <span class="image-caption-banner current" style="opacity : 0.7 ; width : 100% ; bottom : 0px ; margin-top : 35% ;">
                        <div class="caption-banner">
                            <div class="image-desc">Выполняйте захватывающие задания!</div>
                        </div>
                    </span>
                    <div class="carousel-caption">
                        <h3></h3>
                        <p></p>
                    </div>
                </div>
                <div class="item">
                    <a href=""""),_display_(Seq[Any](/*42.31*/controllers/*42.42*/.routes.VideoController.videoList(1, "", "", ""))),format.raw/*42.90*/("""">
                        <img class="img-max-width" src=""""),_display_(Seq[Any](/*43.58*/routes/*43.64*/.Assets.at("images/banner-03.jpg"))),format.raw/*43.98*/("""" alt="">
                    </a>
                    <span class="image-caption-banner current" style="opacity : 0.7 ; width : 100% ; bottom : 0px ; margin-top : 35% ;">
                        <div class="caption-banner">
                            <div class="image-desc">Ощутите незабываемую атмосферу! </div>
                        </div>
                    </span>
                    <div class="carousel-caption">
                        <h3></h3>
                        <p></p>
                    </div>
                </div>
                <div class="item">
                    <a href=""""),_display_(Seq[Any](/*56.31*/controllers/*56.42*/.routes.VideoController.videoList(1, "", "", ""))),format.raw/*56.90*/("""">
                        <img class="img-max-width" src=""""),_display_(Seq[Any](/*57.58*/routes/*57.64*/.Assets.at("images/banner-04.jpg"))),format.raw/*57.98*/("""" alt="">
                    </a>
                    <span class="image-caption-banner current" style="opacity : 0.7 ; width : 100% ; bottom : 0px ; margin-top : 35% ;">
                        <div class="caption-banner">
                            <div class="image-desc">Играйте в GTA 5 !</div>
                        </div>
                    </span>
                    <div class="carousel-caption">
                        <h3></h3>
                        <p></p>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#carousel-gta-captions" data-slide="prev">
                <span class="icon-prev"></span>
            </a>
            <a class="right carousel-control" href="#carousel-gta-captions" data-slide="next">
                <span class="icon-next"></span>
            </a>
        </div>
        <div class="container-video">
            <section id="topVideo" class="video-section">
                <div class="top-level-header">
                    <h2>"""),_display_(Seq[Any](/*80.26*/Messages("ТОП видео"))),format.raw/*80.47*/("""</h2>
                    <div class="video-level-header-hr"></div>
                </div>
                <ul class="featured-classes">
                    """),_display_(Seq[Any](/*84.22*/for(video <- topVideoList) yield /*84.48*/{_display_(Seq[Any](format.raw/*84.49*/("""
                        <li class="featured-class">
                            <a href=""""),_display_(Seq[Any](/*86.39*/controllers/*86.50*/.routes.VideoController.view(video.id))),format.raw/*86.88*/("""" style="color: #FDFEFF">
                                <img class="img-max-width" src="http://img.youtube.com/vi/"""),_display_(Seq[Any](/*87.92*/video/*87.97*/.link)),format.raw/*87.102*/("""/0.jpg" alt=""""),_display_(Seq[Any](/*87.116*/video/*87.121*/.name)),format.raw/*87.126*/("""">
                                <span class="course-title">"""),_display_(Seq[Any](/*88.61*/video/*88.66*/.shortName)),format.raw/*88.76*/("""</span>
                            </a>
                        </li>
                    """)))})),format.raw/*91.22*/("""
                </ul>
            </section>
            <section id="newVideo" class="video-section">
                <div class="top-level-header">
                    <h2>"""),_display_(Seq[Any](/*96.26*/Messages("ТОП новости"))),format.raw/*96.49*/("""</h2>
                    <div class="top-level-header-hr"></div>
                </div>
                <ul class="featured-classes">
                    """),_display_(Seq[Any](/*100.22*/for(news <- topNewsList) yield /*100.46*/{_display_(Seq[Any](format.raw/*100.47*/("""
                        <li class="featured-class">
                            <a href=""""),_display_(Seq[Any](/*102.39*/controllers/*102.50*/.routes.NewsController.view(news.id))),format.raw/*102.86*/("""" style="color: #FDFEFF">
                                <img class="img-max-width" src=""""),_display_(Seq[Any](/*103.66*/news/*103.70*/.link)),format.raw/*103.75*/("""" alt=""""),_display_(Seq[Any](/*103.83*/news/*103.87*/.name)),format.raw/*103.92*/("""">
                                <span class="course-title">"""),_display_(Seq[Any](/*104.61*/news/*104.65*/.shortName)),format.raw/*104.75*/("""</span>
                            </a>
                        </li>
                    """)))})),format.raw/*107.22*/("""
                </ul>
            </section>
        </div>
    </div>
    <script type="text/javascript">

            $ ( document ).ready (
            $ ( '.carousel' ).carousel ( )
            )

    </script>

""")))})),format.raw/*120.2*/("""
"""))}
    }
    
    def render(topVideoList:Seq[models.data.Video],topNewsList:Seq[models.data.News]): play.api.templates.HtmlFormat.Appendable = apply(topVideoList,topNewsList)
    
    def f:((Seq[models.data.Video],Seq[models.data.News]) => play.api.templates.HtmlFormat.Appendable) = (topVideoList,topNewsList) => apply(topVideoList,topNewsList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 28 23:09:30 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/index.scala.html
                    HASH: 7ac45ce6febc1bd67fe3e307b9e198619ecfb6d6
                    MATRIX: 594->1|762->75|799->78|811->83|942->205|982->207|1804->993|1824->1004|1894->1052|2012->1134|2027->1140|2084->1174|2719->1773|2739->1784|2809->1832|2905->1892|2920->1898|2976->1932|3620->2540|3640->2551|3710->2599|3806->2659|3821->2665|3877->2699|4520->3306|4540->3317|4610->3365|4706->3425|4721->3431|4777->3465|5861->4513|5904->4534|6098->4692|6140->4718|6179->4719|6306->4810|6326->4821|6386->4859|6539->4976|6553->4981|6581->4986|6632->5000|6647->5005|6675->5010|6774->5073|6788->5078|6820->5088|6944->5180|7156->5356|7201->5379|7394->5535|7435->5559|7475->5560|7603->5651|7624->5662|7683->5698|7811->5789|7825->5793|7853->5798|7898->5806|7912->5810|7940->5815|8040->5878|8054->5882|8087->5892|8212->5984|8462->6202
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3|35->14|35->14|35->14|36->15|36->15|36->15|49->28|49->28|49->28|50->29|50->29|50->29|63->42|63->42|63->42|64->43|64->43|64->43|77->56|77->56|77->56|78->57|78->57|78->57|101->80|101->80|105->84|105->84|105->84|107->86|107->86|107->86|108->87|108->87|108->87|108->87|108->87|108->87|109->88|109->88|109->88|112->91|117->96|117->96|121->100|121->100|121->100|123->102|123->102|123->102|124->103|124->103|124->103|124->103|124->103|124->103|125->104|125->104|125->104|128->107|141->120
                    -- GENERATED --
                */
            