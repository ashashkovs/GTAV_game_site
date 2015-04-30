
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
object _libs extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /*CSS*/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*2.51*/routes/*2.57*/.Assets.at("images/favicon.png"))),format.raw/*2.89*/("""">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/css/bootstrap.min.css" rel="stylesheet">
"""),format.raw/*4.101*/("""
"""),format.raw/*5.99*/("""
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*6.47*/routes/*6.53*/.Assets.at("stylesheets/gta5tv.css"))),format.raw/*6.89*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.46*/routes/*7.52*/.Assets.at("stylesheets/basic.css"))),format.raw/*7.87*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.46*/routes/*8.52*/.Assets.at("stylesheets/galleriffic-2.css"))),format.raw/*8.95*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("stylesheets/black.css"))),format.raw/*9.87*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("stylesheets/jquery-ui.css"))),format.raw/*10.91*/("""">
"""),format.raw/*12.138*/("""

"""),format.raw/*14.15*/("""
<script src=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*15.66*/("""" ></script>
<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src=""""),_display_(Seq[Any](/*18.15*/routes/*18.21*/.Assets.at("javascripts/jquery.galleriffic.js"))),format.raw/*18.68*/(""""></script>
<script src=""""),_display_(Seq[Any](/*19.15*/routes/*19.21*/.Assets.at("javascripts/jquery.opacityrollover.js"))),format.raw/*19.72*/(""""></script>
<script type="text/javascript">
document.write('<style>.noscript """),format.raw/*21.34*/("""{"""),format.raw/*21.35*/(""" display: none; """),format.raw/*21.51*/("""}"""),format.raw/*21.52*/("""</style>');
</script>
<script type="text/javascript" src=""""),_display_(Seq[Any](/*23.38*/routes/*23.44*/.Application.javascriptRoutes)),format.raw/*23.73*/(""""></script>
<script src="//maps.googleapis.com/maps/api/js?v=3.exp&amp;sensor=false"></script>






"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/libs/_libs.scala.html
                    HASH: 7dc538d69d9fb58f6406919e466a9d54c4a52482
                    MATRIX: 648->8|733->58|747->64|800->96|947->315|975->414|1057->461|1071->467|1128->503|1211->551|1225->557|1281->592|1364->640|1378->646|1442->689|1525->737|1539->743|1595->778|1679->826|1694->832|1755->871|1787->1122|1817->1138|1868->1153|1883->1159|1950->1204|2187->1405|2202->1411|2271->1458|2333->1484|2348->1490|2421->1541|2526->1618|2555->1619|2599->1635|2628->1636|2723->1695|2738->1701|2789->1730
                    LINES: 22->2|22->2|22->2|22->2|24->4|25->5|26->6|26->6|26->6|27->7|27->7|27->7|28->8|28->8|28->8|29->9|29->9|29->9|30->10|30->10|30->10|31->12|33->14|34->15|34->15|34->15|37->18|37->18|37->18|38->19|38->19|38->19|40->21|40->21|40->21|40->21|42->23|42->23|42->23
                    -- GENERATED --
                */
            