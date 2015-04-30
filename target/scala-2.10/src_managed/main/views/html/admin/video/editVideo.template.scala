
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
object editVideo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Int,Form[models.web.VideoWeb],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Int, videoForm: Form[models.web.VideoWeb]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{
    FieldConstructor(views.html.template.fields.bootstrapInput.render)
}};
Seq[Any](format.raw/*1.49*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""

"""),_display_(Seq[Any](/*9.2*/views/*9.7*/.html.template.admin("Видео", "video")/*9.45*/ {_display_(Seq[Any](format.raw/*9.47*/("""
    """),_display_(Seq[Any](/*10.6*/helper/*10.12*/.form(action = controllers.admin.routes.VideoController.editPost(id),
        'class -> "form-horizontal", 'id -> "createVideoForm", 'role -> "form")/*11.80*/ {_display_(Seq[Any](format.raw/*11.82*/("""
        <div class="well form-horizontal">
            <h1> Редактирвоание видео </h1>
            <fieldset>
                """),_display_(Seq[Any](/*15.18*/inputText(videoForm("name"), '_label -> "Название", 'class -> "form-control"))),format.raw/*15.95*/("""
                """),_display_(Seq[Any](/*16.18*/select(
                    videoForm("categoryId"),
                    options(models.data.VideoCategory.options),
                    '_label -> "Категория", '_default -> "-- Категория --", 'class -> "form-control",
                    '_showConstraints -> false
                ))),format.raw/*21.18*/("""
                """),_display_(Seq[Any](/*22.18*/inputText(videoForm("rating"), '_label -> "Рейтинг", 'class -> "form-control"))),format.raw/*22.96*/("""
                """),_display_(Seq[Any](/*23.18*/inputText(videoForm("tags"), '_label -> "Теги", 'class -> "form-control"))),format.raw/*23.91*/("""
                """),_display_(Seq[Any](/*24.18*/textarea(videoForm("link"), '_label -> "Ссылка", 'class -> "form-control"))),format.raw/*24.92*/("""
                """),_display_(Seq[Any](/*25.18*/textarea(videoForm("description"), '_label -> "Описание", 'class -> "form-control"))),format.raw/*25.101*/("""
                <div class="actions" style="margin-top: 10px">
                    <a type="submit" class="btn btn-primary"> Сохранить </a>
                    <a type="submit" class="btn btn-primary"> Удалить </a>
                    <a href="#" class="btn btn-default"> Отмена </a>
                </div>
            </fieldset>
        </div>
    """)))})),format.raw/*33.6*/("""
    <script type="text/javascript">
        $(document).ready(function() """),format.raw/*35.38*/("""{"""),format.raw/*35.39*/("""

        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/(""");
    </script>
""")))})))}
    }
    
    def render(id:Int,videoForm:Form[models.web.VideoWeb]): play.api.templates.HtmlFormat.Appendable = apply(id,videoForm)
    
    def f:((Int,Form[models.web.VideoWeb]) => play.api.templates.HtmlFormat.Appendable) = (id,videoForm) => apply(id,videoForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/admin/video/editVideo.scala.html
                    HASH: c96f97d78a00eeb05f0aef0048cab2547ca80876
                    MATRIX: 595->1|744->69|776->93|884->48|912->67|939->171|976->174|988->179|1034->217|1073->219|1114->225|1129->231|1287->380|1327->382|1491->510|1590->587|1644->605|1949->888|2003->906|2103->984|2157->1002|2252->1075|2306->1093|2402->1167|2456->1185|2562->1268|2945->1620|3047->1694|3076->1695|3113->1705|3142->1706
                    LINES: 19->1|22->5|22->5|25->1|27->4|28->7|30->9|30->9|30->9|30->9|31->10|31->10|32->11|32->11|36->15|36->15|37->16|42->21|43->22|43->22|44->23|44->23|45->24|45->24|46->25|46->25|54->33|56->35|56->35|58->37|58->37
                    -- GENERATED --
                */
            