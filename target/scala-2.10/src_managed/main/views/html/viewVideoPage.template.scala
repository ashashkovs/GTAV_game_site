
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
object viewVideoPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.data.Video,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(video: models.data.Video):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.28*/("""

"""),_display_(Seq[Any](/*3.2*/views/*3.7*/.html.template.main("Видео: " + video.name, "video")/*3.59*/ {_display_(Seq[Any](format.raw/*3.61*/("""
    <div class="container" id="center-container">
        <article class="content-list">
            <section class="video-interface">
                <div class="site-wrapper">
                    <div class="video-details">
                        <h3 class="content-list h3"> """),_display_(Seq[Any](/*9.55*/video/*9.60*/.name)),format.raw/*9.65*/(""" </h3>
                        <p class="excerpt">"""),_display_(Seq[Any](/*10.45*/Html(video.description))),format.raw/*10.68*/("""</p>
                    </div>
                    <div class="video-player">
                        <iframe width="620" height="354" src="//www.youtube.com/embed/"""),_display_(Seq[Any](/*13.88*/video/*13.93*/.link)),format.raw/*13.98*/("""?feature=player_detailpage" frameborder="0" allowfullscreen></iframe>
                    </div>
                    <script type="text/javascript" src="//yandex.st/share/share.js" charset="utf-8">
                    </script>
                    <div class="yashare-auto-init" data-yashareL10n="ru" data-yashareType="none" data-yashareQuickServices="yaru,vkontakte,facebook,twitter,odnoklassniki,moimir,lj,friendfeed,moikrug,gplus,surfingbird">
                    </div>
                </div>
            </section>
        </article>
    </div>
""")))})))}
    }
    
    def render(video:models.data.Video): play.api.templates.HtmlFormat.Appendable = apply(video)
    
    def f:((models.data.Video) => play.api.templates.HtmlFormat.Appendable) = (video) => apply(video)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 28 22:59:18 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/viewVideoPage.scala.html
                    HASH: 1875ab8260020e13fb727860f16df8496c9f48e1
                    MATRIX: 575->1|695->27|732->30|744->35|804->87|843->89|1159->370|1172->375|1198->380|1285->431|1330->454|1532->620|1546->625|1573->630
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3|30->9|30->9|30->9|31->10|31->10|34->13|34->13|34->13
                    -- GENERATED --
                */
            