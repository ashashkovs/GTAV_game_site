
package views.html.template.fields

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
object bootstrapInput extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""


<div class="form-group """),_display_(Seq[Any](/*4.25*/if(elements.hasErrors)/*4.47*/ {_display_(Seq[Any](format.raw/*4.49*/("""error""")))})),format.raw/*4.55*/("""">
    <label for=""""),_display_(Seq[Any](/*5.18*/elements/*5.26*/.id)),format.raw/*5.29*/("""" class="control-label">"""),_display_(Seq[Any](/*5.54*/elements/*5.62*/.label)),format.raw/*5.68*/("""</label>
    <div class="control-item">
        """),_display_(Seq[Any](/*7.10*/elements/*7.18*/.input)),format.raw/*7.24*/("""
        <span class="help-inline">"""),_display_(Seq[Any](/*8.36*/elements/*8.44*/.infos.mkString(", "))),format.raw/*8.65*/("""</span>
    </div>
</div>"""))}
    }
    
    def render(elements:helper.FieldElements): play.api.templates.HtmlFormat.Appendable = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.HtmlFormat.Appendable) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/template/fields/bootstrapInput.scala.html
                    HASH: 251ff4cda9a310f419e0f200502dca21a2256b94
                    MATRIX: 595->1|721->33|783->60|813->82|852->84|889->90|944->110|960->118|984->121|1044->146|1060->154|1087->160|1171->209|1187->217|1214->223|1285->259|1301->267|1343->288
                    LINES: 19->1|22->1|25->4|25->4|25->4|25->4|26->5|26->5|26->5|26->5|26->5|26->5|28->7|28->7|28->7|29->8|29->8|29->8
                    -- GENERATED --
                */
            