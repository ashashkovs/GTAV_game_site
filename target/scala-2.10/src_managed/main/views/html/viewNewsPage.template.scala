
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
object viewNewsPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.data.News,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(news: models.data.News):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""

"""),_display_(Seq[Any](/*3.2*/views/*3.7*/.html.template.main("Новость: " + news.name, "news")/*3.59*/ {_display_(Seq[Any](format.raw/*3.61*/("""
    <div class="container" id="center-container">
        <section class="video-interface">
            <div class="site-wrapper">
                <div class="news-page-details">
                    <h3 class="news-h3"> """),_display_(Seq[Any](/*8.43*/news/*8.47*/.name)),format.raw/*8.52*/(""" </h3>
                    <div class="news-date"> """),_display_(Seq[Any](/*9.46*/news/*9.50*/.introduced)),format.raw/*9.61*/(""" </div>
                    <div class="excerpt"> """),_display_(Seq[Any](/*10.44*/Html(news.description))),format.raw/*10.66*/(""" </div>
                </div>
                <script type="text/javascript" src="//yandex.st/share/share.js" charset="utf-8">
                </script>
                <div class="yashare-auto-init" data-yashareL10n="ru" data-yashareType="none" data-yashareQuickServices="yaru,vkontakte,facebook,twitter,odnoklassniki,moimir,lj,friendfeed,moikrug,gplus,surfingbird">
                </div>
            </div>
        </section>
    </div>
""")))})))}
    }
    
    def render(news:models.data.News): play.api.templates.HtmlFormat.Appendable = apply(news)
    
    def f:((models.data.News) => play.api.templates.HtmlFormat.Appendable) = (news) => apply(news)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/viewNewsPage.scala.html
                    HASH: 08478d4fee4c1db18e240f5862043497c32693ab
                    MATRIX: 573->1|691->25|728->28|740->33|800->85|839->87|1096->309|1108->313|1134->318|1221->370|1233->374|1265->385|1352->436|1396->458
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10
                    -- GENERATED --
                */
            