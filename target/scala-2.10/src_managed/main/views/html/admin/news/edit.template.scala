
package views.html.admin.news

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
object edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Int,Form[models.web.NewsWeb],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Int, newsForm: Form[models.web.NewsWeb]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{
    FieldConstructor(views.html.template.fields.bootstrapInput.render)
}};
Seq[Any](format.raw/*1.47*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""

"""),_display_(Seq[Any](/*9.2*/views/*9.7*/.html.template.admin("Новости", "news")/*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
    """),_display_(Seq[Any](/*10.6*/helper/*10.12*/.form(action = controllers.admin.routes.NewsController.editPost(id),
        'class -> "form-horizontal", 'id -> "editNewsForm", 'role -> "form")/*11.77*/ {_display_(Seq[Any](format.raw/*11.79*/("""
        <div class="well form-horizontal">
            <h1> Редактирование новости </h1>
            <fieldset>
                """),_display_(Seq[Any](/*15.18*/inputText(newsForm("name"), '_label -> "Название", 'class -> "form-control"))),format.raw/*15.94*/("""
                """),_display_(Seq[Any](/*16.18*/inputText(newsForm("shortName"), '_label -> "Краткое название", 'class -> "form-control"))),format.raw/*16.107*/("""
                """),_display_(Seq[Any](/*17.18*/inputText(newsForm("link"), '_label -> "Ссылка", 'class -> "form-control"))),format.raw/*17.92*/("""
                """),_display_(Seq[Any](/*18.18*/inputText(newsForm("tags"), '_label -> "Теги", 'class -> "form-control"))),format.raw/*18.90*/("""
                """),_display_(Seq[Any](/*19.18*/inputText(newsForm("like"), '_label -> "Лайки", 'class -> "form-control"))),format.raw/*19.91*/("""
                """),_display_(Seq[Any](/*20.18*/inputText(newsForm("preview"), '_label -> "Превью", 'class -> "form-control"))),format.raw/*20.95*/("""
                <div class="form-group  """),_display_(Seq[Any](/*21.42*/if(newsForm("description").hasErrors)/*21.79*/{_display_(Seq[Any](format.raw/*21.80*/("""error""")))})),format.raw/*21.86*/("""">
                    <label for="description" class="control-label">Описание</label>
                    <div class="control-item">
                        <textarea class="ckeditor" cols="80" id="description" name="description" rows="10" style="visibility: hidden; display: none;">
                            """),_display_(Seq[Any](/*25.30*/newsForm("description")/*25.53*/.value.get)),format.raw/*25.63*/("""
                        </textarea>
                        <span class="help-inline">
                            """),_display_(Seq[Any](/*28.30*/if(newsForm("description").hasErrors)/*28.67*/ {_display_(Seq[Any](_display_(Seq[Any](/*28.70*/newsForm("description")/*28.93*/.value.get))))})),format.raw/*28.104*/("""
                        </span>
                    </div>
                </div>
                <div class="actions" style="margin-top: 10px">
                    <button type="submit" class="btn btn-primary"> Сохранить </button>
                    <a type="submit" class="btn btn-primary"> Удалить </a>
                    <a href="#" class="btn btn-default"> Отмена </a>
                </div>
            </fieldset>
        </div>
    """)))})),format.raw/*39.6*/("""
    <script type="text/javascript">
            $(document).ready(function() """),format.raw/*41.42*/("""{"""),format.raw/*41.43*/("""
                //$('#editor').wysiwyg();

            """),format.raw/*44.13*/("""}"""),format.raw/*44.14*/(""");
    </script>
""")))})))}
    }
    
    def render(id:Int,newsForm:Form[models.web.NewsWeb]): play.api.templates.HtmlFormat.Appendable = apply(id,newsForm)
    
    def f:((Int,Form[models.web.NewsWeb]) => play.api.templates.HtmlFormat.Appendable) = (id,newsForm) => apply(id,newsForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/admin/news/edit.scala.html
                    HASH: ab80804fcd13da9f669f1abcde1e9f5827c4e9da
                    MATRIX: 588->1|735->67|767->91|875->46|903->65|930->169|967->172|979->177|1026->216|1065->218|1106->224|1121->230|1275->375|1315->377|1481->507|1579->583|1633->601|1745->690|1799->708|1895->782|1949->800|2043->872|2097->890|2192->963|2246->981|2345->1058|2423->1100|2469->1137|2508->1138|2546->1144|2896->1458|2928->1481|2960->1491|3113->1608|3159->1645|3208->1648|3240->1671|3278->1682|3753->2126|3859->2204|3888->2205|3972->2261|4001->2262
                    LINES: 19->1|22->5|22->5|25->1|27->4|28->7|30->9|30->9|30->9|30->9|31->10|31->10|32->11|32->11|36->15|36->15|37->16|37->16|38->17|38->17|39->18|39->18|40->19|40->19|41->20|41->20|42->21|42->21|42->21|42->21|46->25|46->25|46->25|49->28|49->28|49->28|49->28|49->28|60->39|62->41|62->41|65->44|65->44
                    -- GENERATED --
                */
            