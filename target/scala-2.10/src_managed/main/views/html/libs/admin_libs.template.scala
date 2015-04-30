
package views.html.libs

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
/*CSS*/
object admin_libs extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /*CSS*/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*2.51*/routes/*2.57*/.Assets.at("images/favicon.png"))),format.raw/*2.89*/("""">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*5.46*/routes/*5.52*/.Assets.at("stylesheets/admin_video.css"))),format.raw/*5.93*/("""">
"""),format.raw/*6.15*/("""
<script src=""""),_display_(Seq[Any](/*7.15*/routes/*7.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*7.66*/("""" ></script>
<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src=""""),_display_(Seq[Any](/*10.15*/routes/*10.21*/.Assets.at("javascripts/bootstrap-wysiwyg.js"))),format.raw/*10.67*/(""""></script>
<script src=""""),_display_(Seq[Any](/*11.15*/routes/*11.21*/.Assets.at("javascripts/jquery.hotkeys.js"))),format.raw/*11.64*/(""""></script>
<script src=""""),_display_(Seq[Any](/*12.15*/routes/*12.21*/.Assets.at("javascripts/ckeditor/ckeditor.js"))),format.raw/*12.67*/(""""></script>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/libs/admin_libs.scala.html
                    HASH: 6a61d396a2af5cc366872437681b4be65090946d
                    MATRIX: 653->8|738->58|752->64|805->96|1105->361|1119->367|1181->408|1211->425|1261->440|1275->446|1341->491|1578->692|1593->698|1661->744|1723->770|1738->776|1803->819|1865->845|1880->851|1948->897
                    LINES: 22->2|22->2|22->2|22->2|25->5|25->5|25->5|26->6|27->7|27->7|27->7|30->10|30->10|30->10|31->11|31->11|31->11|32->12|32->12|32->12
                    -- GENERATED --
                */
            