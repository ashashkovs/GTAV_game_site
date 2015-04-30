
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
object videoDetails extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Seq[models.data.Video],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(videoList: Seq[models.data.Video]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

    <div id="videoDetails">
        <article id="center-container">
            <section class="content-list">
                <ul>
                """),_display_(Seq[Any](/*7.18*/for(video <- videoList) yield /*7.41*/ {_display_(Seq[Any](format.raw/*7.43*/("""
                    <li>
                        <a href=""""),_display_(Seq[Any](/*9.35*/controllers/*9.46*/.routes.VideoController.view(video.id))),format.raw/*9.84*/("""">
                            <img class="img-max-width" width="300,465" height="178.2" src="http://img.youtube.com/vi/"""),_display_(Seq[Any](/*10.119*/video/*10.124*/.link)),format.raw/*10.129*/("""/0.jpg" alt=""""),_display_(Seq[Any](/*10.143*/video/*10.148*/.name)),format.raw/*10.153*/("""">
                        </a>
                        <article class="preview-details">
                            <h3 class="post-title"><a href=""""),_display_(Seq[Any](/*13.62*/controllers/*13.73*/.routes.VideoController.view(video.id))),format.raw/*13.111*/("""">"""),_display_(Seq[Any](/*13.114*/video/*13.119*/.name)),format.raw/*13.124*/("""</a></h3>
                            <p class="excerpt">"""),_display_(Seq[Any](/*14.49*/Html(video.description))),format.raw/*14.72*/("""</p>
                        </article>
                        <a href=""""),_display_(Seq[Any](/*16.35*/controllers/*16.46*/.routes.VideoController.view(video.id))),format.raw/*16.84*/("""" class="content-list-btn">Подробнее</a>
                    </li>
                """)))})),format.raw/*18.18*/("""
                </ul>
            </section>
        </article>
    </div>

"""))}
    }
    
    def render(videoList:Seq[models.data.Video]): play.api.templates.HtmlFormat.Appendable = apply(videoList)
    
    def f:((Seq[models.data.Video]) => play.api.templates.HtmlFormat.Appendable) = (videoList) => apply(videoList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 28 23:06:14 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/videoDetails.scala.html
                    HASH: aa04cf978c996b40e98105e2ac15f1f64407731c
                    MATRIX: 579->1|708->36|894->187|932->210|971->212|1066->272|1085->283|1144->321|1302->442|1317->447|1345->452|1396->466|1411->471|1439->476|1626->627|1646->638|1707->676|1747->679|1762->684|1790->689|1884->747|1929->770|2039->844|2059->855|2119->893|2235->977
                    LINES: 19->1|22->1|28->7|28->7|28->7|30->9|30->9|30->9|31->10|31->10|31->10|31->10|31->10|31->10|34->13|34->13|34->13|34->13|34->13|34->13|35->14|35->14|37->16|37->16|37->16|39->18
                    -- GENERATED --
                */
            