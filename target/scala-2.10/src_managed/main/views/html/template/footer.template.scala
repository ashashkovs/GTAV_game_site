
package views.html.template

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
object footer extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<footer id="siteInfo" class="footer">
    <div class="footer-content">
        <div id="merger">
            <img class="img-max-width" src=""""),_display_(Seq[Any](/*5.46*/routes/*5.52*/.Assets.at("images/gta5LogoFut.jpg"))),format.raw/*5.88*/("""" alt="footer GTA 5 TV" >
            <p id="copyright">© 2013 GTA 5 TV</p>
        </div>
    </div>
</footer>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 28 22:23:10 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/template/footer.scala.html
                    HASH: 94b3448ec7a0c997b20d48a22b69037febffdca7
                    MATRIX: 647->1|824->143|838->149|895->185
                    LINES: 22->2|25->5|25->5|25->5
                    -- GENERATED --
                */
            