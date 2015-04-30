
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
object photo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Seq[models.data.Photo],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(photoList: Seq[models.data.Photo]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""
"""),_display_(Seq[Any](/*2.2*/views/*2.7*/.html.template.main("Фото, скриншоты, арт, обои", "photo")/*2.65*/ {_display_(Seq[Any](format.raw/*2.67*/("""
    <div class="container">
        <div class="radioset-container-photo">
            <div class="tabs">
                <input type="radio" name="tab" id="tab1" checked="checked" onclick="loadPhotos ( 1 ) ;"/>
                <label class="button-photo-category" for="tab1" alt="GTA 5 Обои">Обои</label>
                <input type="radio" name="tab" id="tab2" onclick="loadPhotos ( 2 ) ;"/>
                <label class="button-photo-category" for="tab2" alt="GTA 5 Скриншоты">Скриншоты</label>
                <input type="radio" name="tab" id="tab3" onclick="loadPhotos ( 3 ) ;"/>
                <label class="button-photo-category" for="tab3" alt="GTA 5 Арт">Арт</label>
            </div>
        </div>
    </div>
    <div id="photos_page">
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
                """),_display_(Seq[Any](/*27.18*/for(photo <- photoList) yield /*27.41*/ {_display_(Seq[Any](format.raw/*27.43*/("""
                    <li>
                        <a class="thumb" name="leaf" href=""""),_display_(Seq[Any](/*29.61*/photo/*29.66*/.linkA)),format.raw/*29.72*/("""" title="GTA 5 Image">
                            <img class="img-max-width" src=""""),_display_(Seq[Any](/*30.62*/photo/*30.67*/.linkA)),format.raw/*30.73*/(""""/>
                        </a>
                        <div class="caption">
                            <div class="download">
                                <a href=""""),_display_(Seq[Any](/*34.43*/photo/*34.48*/.linkB)),format.raw/*34.54*/("""">Скачать оригинал</a>
                            </div>
                        </div>
                    </li>
                """)))})),format.raw/*38.18*/("""
                </ul>
            </div>
            <div style="clear : both ;"></div>
        </div>
    </div>



    <script type="text/javascript">
        jQuery ( document ).ready ( function ( $ ) """),format.raw/*48.52*/("""{"""),format.raw/*48.53*/("""
            $ ( 'div.navigation' ).css ( """),format.raw/*49.42*/("""{"""),format.raw/*49.43*/(""" 'width' : '450px', 'float' : 'left' """),format.raw/*49.80*/("""}"""),format.raw/*49.81*/(""" ) ;
            $ ( 'div.content' ).css ( 'display', 'block' ) ;

            var onMouseOutOpacity = 0.67 ;
            $ ( '#thumbs ul.thumbs li' ).opacityrollover ( """),format.raw/*53.60*/("""{"""),format.raw/*53.61*/("""
                mouseOutOpacity : onMouseOutOpacity,
                mouseOverOpacity : 1.0,
                fadeSpeed : 'fast',
                exemptionSelector : '.selected'
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/(""" ) ;

            var gallery = $ ( '#thumbs' ).galleriffic ( """),format.raw/*60.57*/("""{"""),format.raw/*60.58*/("""
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
                onSlideChange : function ( prevIndex, nextIndex ) """),format.raw/*83.67*/("""{"""),format.raw/*83.68*/("""
                this.find ( 'ul.thumbs' ).children ( )
                .eq ( prevIndex ).fadeTo ( 'fast', onMouseOutOpacity ).end ( )
                .eq ( nextIndex ).fadeTo ( 'fast', 1.0 ) ;
                """),format.raw/*87.17*/("""}"""),format.raw/*87.18*/(""",
                onPageTransitionOut : function ( callback ) """),format.raw/*88.61*/("""{"""),format.raw/*88.62*/("""
                this.fadeTo ( 'fast', 0.0, callback ) ;
                """),format.raw/*90.17*/("""}"""),format.raw/*90.18*/(""",
                onPageTransitionIn : function ( ) """),format.raw/*91.51*/("""{"""),format.raw/*91.52*/("""
                this.fadeTo ( 'fast', 1.0 ) ;
                """),format.raw/*93.17*/("""}"""),format.raw/*93.18*/("""
            """),format.raw/*94.13*/("""}"""),format.raw/*94.14*/(""" ) ;
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/(""" ) ;

        function loadPhotos ( categoryId ) """),format.raw/*97.44*/("""{"""),format.raw/*97.45*/("""
            jsRoutes.controllers.PhotoController.loadsPhotoDetails ( categoryId ).ajax ( """),format.raw/*98.90*/("""{"""),format.raw/*98.91*/("""
                success : function ( data ) """),format.raw/*99.45*/("""{"""),format.raw/*99.46*/("""
                    $ ( "#container" ).replaceWith ( data ) ;
                """),format.raw/*101.17*/("""}"""),format.raw/*101.18*/("""
            """),format.raw/*102.13*/("""}"""),format.raw/*102.14*/(""" )
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""
    </script>
""")))})))}
    }
    
    def render(photoList:Seq[models.data.Photo]): play.api.templates.HtmlFormat.Appendable = apply(photoList)
    
    def f:((Seq[models.data.Photo]) => play.api.templates.HtmlFormat.Appendable) = (photoList) => apply(photoList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:40 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/photo.scala.html
                    HASH: db734c65e85feb023ed135507a51c3ba1e88acfc
                    MATRIX: 572->1|701->36|737->38|749->43|815->101|854->103|2171->1384|2210->1407|2250->1409|2372->1495|2386->1500|2414->1506|2534->1590|2548->1595|2576->1601|2784->1773|2798->1778|2826->1784|2990->1916|3223->2121|3252->2122|3322->2164|3351->2165|3416->2202|3445->2203|3642->2372|3671->2373|3889->2563|3918->2564|4008->2626|4037->2627|5094->3656|5123->3657|5361->3867|5390->3868|5480->3930|5509->3931|5610->4004|5639->4005|5719->4057|5748->4058|5839->4121|5868->4122|5909->4135|5938->4136|5978->4149|6007->4150|6084->4199|6113->4200|6231->4290|6260->4291|6333->4336|6362->4337|6470->4416|6500->4417|6542->4430|6572->4431|6611->4442|6641->4443
                    LINES: 19->1|22->1|23->2|23->2|23->2|23->2|48->27|48->27|48->27|50->29|50->29|50->29|51->30|51->30|51->30|55->34|55->34|55->34|59->38|69->48|69->48|70->49|70->49|70->49|70->49|74->53|74->53|79->58|79->58|81->60|81->60|104->83|104->83|108->87|108->87|109->88|109->88|111->90|111->90|112->91|112->91|114->93|114->93|115->94|115->94|116->95|116->95|118->97|118->97|119->98|119->98|120->99|120->99|122->101|122->101|123->102|123->102|124->103|124->103
                    -- GENERATED --
                */
            