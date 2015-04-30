
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
object photoDetails extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Seq[models.data.Photo],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(photoList: Seq[models.data.Photo]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""



        <div id="container">
            <div id="gallery" class="content">
                <div id="controls" class="controls"></div>
                <div class="slideshow-container">
                    <div id="loading" class="loader"></div>
                    <div id="slideshow" class="slideshow"></div>
                </div>
                <div id="caption" class="caption-container"></div>
            </div>
            <div id="thumbs" class="navigation">
                <ul class="thumbs noscript">
                    """),_display_(Seq[Any](/*16.22*/for(photo <- photoList) yield /*16.45*/ {_display_(Seq[Any](format.raw/*16.47*/("""
                        <li>
                            <a class="thumb" name="leaf" href=""""),_display_(Seq[Any](/*18.65*/photo/*18.70*/.linkA)),format.raw/*18.76*/("""" >
                                <img class="img-max-width" src=""""),_display_(Seq[Any](/*19.66*/photo/*19.71*/.linkA)),format.raw/*19.77*/("""" />
                            </a>
                            <div class="caption">
                                <div class="download">
                                    <a href=""""),_display_(Seq[Any](/*23.47*/photo/*23.52*/.linkB)),format.raw/*23.58*/("""">Скачать оригинал</a>
                                </div>
                            </div>
                        </li>
                    """)))})),format.raw/*27.22*/("""
                </ul>
            </div>
            <div style="clear : both ;"></div>
        </div>



<script type="text/javascript">
    jQuery ( document ).ready ( function ( $ ) """),format.raw/*36.48*/("""{"""),format.raw/*36.49*/("""
    $ ( 'div.navigation' ).css ( """),format.raw/*37.34*/("""{"""),format.raw/*37.35*/(""" 'width' : '450px', 'float' : 'left' """),format.raw/*37.72*/("""}"""),format.raw/*37.73*/(""" ) ;
    $ ( 'div.content' ).css ( 'display', 'block' ) ;

    var onMouseOutOpacity = 0.67 ;
    $ ( '#thumbs ul.thumbs li' ).opacityrollover ( """),format.raw/*41.52*/("""{"""),format.raw/*41.53*/("""
    mouseOutOpacity : onMouseOutOpacity,
    mouseOverOpacity : 1.0,
    fadeSpeed : 'fast',
    exemptionSelector : '.selected'
    """),format.raw/*46.5*/("""}"""),format.raw/*46.6*/(""" ) ;

    var gallery = $ ( '#thumbs' ).galleriffic ( """),format.raw/*48.49*/("""{"""),format.raw/*48.50*/("""
    delay : 2500,
    numThumbs : 15,
    preloadAhead : 10,
    enableTopPager : true,
    enableBottomPager : true,
    maxPagesToShow : 7,
    imageContainerSel : '#slideshow',
    controlsContainerSel : '#controls',
    captionContainerSel : '#caption',
    loadingContainerSel : '#loading',
    renderSSControls : true,
    renderNavControls : true,
    playLinkText : 'Показ слайдов',
    pauseLinkText : 'Пауза',
    prevLinkText : '&lsaquo; Предыдущее фото',
    nextLinkText : 'Следующее фото &rsaquo;',
    nextPageLinkText : '&rsaquo;',
    prevPageLinkText : '&lsaquo;',
    enableHistory : false,
    autoStart : false,
    syncTransitions : true,
    defaultTransitionDuration : 900,
    onSlideChange : function ( prevIndex, nextIndex ) """),format.raw/*71.55*/("""{"""),format.raw/*71.56*/("""
    this.find ( 'ul.thumbs' ).children ( )
    .eq ( prevIndex ).fadeTo ( 'fast', onMouseOutOpacity ).end ( )
    .eq ( nextIndex ).fadeTo ( 'fast', 1.0 ) ;
    """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/(""",
    onPageTransitionOut : function ( callback ) """),format.raw/*76.49*/("""{"""),format.raw/*76.50*/("""
    this.fadeTo ( 'fast', 0.0, callback ) ;
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/(""",
    onPageTransitionIn : function ( ) """),format.raw/*79.39*/("""{"""),format.raw/*79.40*/("""
    this.fadeTo ( 'fast', 1.0 ) ;
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/(""" ) ;
    """),format.raw/*83.5*/("""}"""),format.raw/*83.6*/(""" ) ;
</script>
"""))}
    }
    
    def render(photoList:Seq[models.data.Photo]): play.api.templates.HtmlFormat.Appendable = apply(photoList)
    
    def f:((Seq[models.data.Photo]) => play.api.templates.HtmlFormat.Appendable) = (photoList) => apply(photoList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/photoDetails.scala.html
                    HASH: dbb68e7a72659a6edfd4c7ec99611ca160ac595c
                    MATRIX: 579->1|708->36|1282->574|1321->597|1361->599|1491->693|1505->698|1533->704|1638->773|1652->778|1680->784|1905->973|1919->978|1947->984|2127->1132|2341->1318|2370->1319|2432->1353|2461->1354|2526->1391|2555->1392|2728->1537|2757->1538|2918->1672|2946->1673|3028->1727|3057->1728|3838->2481|3867->2482|4056->2644|4084->2645|4162->2695|4191->2696|4267->2745|4295->2746|4363->2786|4392->2787|4458->2826|4486->2827|4518->2832|4546->2833|4582->2842|4610->2843
                    LINES: 19->1|22->1|37->16|37->16|37->16|39->18|39->18|39->18|40->19|40->19|40->19|44->23|44->23|44->23|48->27|57->36|57->36|58->37|58->37|58->37|58->37|62->41|62->41|67->46|67->46|69->48|69->48|92->71|92->71|96->75|96->75|97->76|97->76|99->78|99->78|100->79|100->79|102->81|102->81|103->82|103->82|104->83|104->83
                    -- GENERATED --
                */
            