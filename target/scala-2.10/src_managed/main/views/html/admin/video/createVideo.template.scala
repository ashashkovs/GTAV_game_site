
package views.html.admin.video

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
object createVideo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.web.VideoWeb],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(videoForm: Form[models.web.VideoWeb]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(views.html.template.fields.bootstrapInput.render) }};
Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.100*/("""

"""),_display_(Seq[Any](/*7.2*/views/*7.7*/.html.template.admin("Видео", "video")/*7.45*/ {_display_(Seq[Any](format.raw/*7.47*/("""
    """),_display_(Seq[Any](/*8.6*/helper/*8.12*/.form(action = controllers.admin.routes.VideoController.createPost(),
        'class -> "form-horizontal", 'id -> "createVideoForm", 'role -> "form")/*9.80*/ {_display_(Seq[Any](format.raw/*9.82*/("""
        <div class="well form-horizontal" style="margin-top: 70px">
            <h1>Новое видео</h1>
            <fieldset>
                """),_display_(Seq[Any](/*13.18*/inputText(videoForm("name"), '_label -> "Название", 'class->"form-control"))),format.raw/*13.93*/("""
                """),_display_(Seq[Any](/*14.18*/select(
                    videoForm("categoryId"),
                    options(models.data.VideoCategory.options),
                    '_label -> "Категория", '_default -> "-- Категория --", 'class->"form-control",
                    '_showConstraints -> false
                ))),format.raw/*19.18*/("""
                """),_display_(Seq[Any](/*20.18*/inputText(videoForm("rating"), '_label -> "Рейтинг", 'class->"form-control"))),format.raw/*20.94*/("""
                """),_display_(Seq[Any](/*21.18*/inputText(videoForm("tags"),'_label -> "Теги", 'class->"form-control"))),format.raw/*21.88*/("""
                """),_display_(Seq[Any](/*22.18*/textarea(videoForm("link"),'_label -> "Ссылка", 'class->"form-control"))),format.raw/*22.89*/("""
                """),_display_(Seq[Any](/*23.18*/textarea(videoForm("description"), '_label -> "Описание", 'class->"form-control"))),format.raw/*23.99*/("""
                <div class="actions" style="margin-top: 10px">
                    <a type="submit" class="btn btn-primary">Создать</a>
                    <a href="#" class="btn btn-default">Отмена</a>
                </div>
            </fieldset>
        </div>
    """)))})),format.raw/*30.6*/("""
""")))})))}
    }
    
    def render(videoForm:Form[models.web.VideoWeb]): play.api.templates.HtmlFormat.Appendable = apply(videoForm)
    
    def f:((Form[models.web.VideoWeb]) => play.api.templates.HtmlFormat.Appendable) = (videoForm) => apply(videoForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/admin/video/createVideo.scala.html
                    HASH: 1ed2bb56784aa4266e715c42d28ae4683ba9b9c2
                    MATRIX: 593->1|733->60|765->84|869->39|897->58|926->158|963->161|975->166|1021->204|1060->206|1100->212|1114->218|1271->367|1310->369|1488->511|1585->586|1639->604|1942->885|1996->903|2094->979|2148->997|2240->1067|2294->1085|2387->1156|2441->1174|2544->1255|2846->1526
                    LINES: 19->1|22->5|22->5|23->1|25->4|26->5|28->7|28->7|28->7|28->7|29->8|29->8|30->9|30->9|34->13|34->13|35->14|40->19|41->20|41->20|42->21|42->21|43->22|43->22|44->23|44->23|51->30
                    -- GENERATED --
                */
            