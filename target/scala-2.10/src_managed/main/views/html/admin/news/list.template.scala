
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[web.Page[data.News],Int,String,play.api.mvc.Flash,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: web.Page[data.News], currentOrderBy: Int, currentFilter: String)(implicit flash: play.api.mvc.Flash):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*9.2*/header/*9.8*/(orderBy: Int, title: String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.41*/("""
    <th class="col"""),_display_(Seq[Any](/*10.20*/orderBy)),format.raw/*10.27*/(""" header """),_display_(Seq[Any](/*10.36*/if(scala.math.abs(currentOrderBy) == orderBy){/*10.83*/{if(currentOrderBy < 0) "headerSortDown" else "headerSortUp"}})),format.raw/*10.144*/("""">
        <a href=""""),_display_(Seq[Any](/*11.19*/link(0, Some(orderBy)))),format.raw/*11.41*/("""">"""),_display_(Seq[Any](/*11.44*/title)),format.raw/*11.49*/("""</a>
    </th>
""")))};def /*3.2*/link/*3.6*/(newPage: Int, newOrderBy: Option[Int] = None) = {{
    controllers.admin.routes.NewsController.list(newPage, newOrderBy.map { orderBy =>
        if(orderBy == scala.math.abs(currentOrderBy)) -currentOrderBy else orderBy
    }.getOrElse(currentOrderBy), currentFilter)
}};
Seq[Any](format.raw/*1.116*/("""

"""),format.raw/*7.2*/("""

"""),format.raw/*13.2*/("""

"""),_display_(Seq[Any](/*15.2*/views/*15.7*/.html.template.admin("Новости", "news", false)/*15.53*/ {_display_(Seq[Any](format.raw/*15.55*/("""
    """),_display_(Seq[Any](/*16.6*/flash/*16.11*/.get("success").map/*16.30*/ { message =>_display_(Seq[Any](format.raw/*16.43*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*18.37*/message)),format.raw/*18.44*/("""
        </div>
    """)))})),format.raw/*20.6*/("""
    <div id="actions">
        <a type="button" class="btn btn-success" id="add" href=""""),_display_(Seq[Any](/*22.66*/controllers/*22.77*/.admin.routes.VideoController.create())),format.raw/*22.115*/("""">Добавить</a>
    </div>
    """),_display_(Seq[Any](/*24.6*/Option(currentPage.items)/*24.31*/.filterNot(_.isEmpty).map/*24.56*/ { newsList =>_display_(Seq[Any](format.raw/*24.70*/("""
    <table class="table table-bordered">
    <thead>
        <tr>
            """),_display_(Seq[Any](/*28.14*/header(2, "Наименование"))),format.raw/*28.39*/("""
            """),_display_(Seq[Any](/*29.14*/header(3, "Теги"))),format.raw/*29.31*/("""
            """),_display_(Seq[Any](/*30.14*/header(4, "Краткое имя"))),format.raw/*30.38*/("""
            """),_display_(Seq[Any](/*31.14*/header(1, "Дата создания"))),format.raw/*31.40*/("""
        </tr>
    </thead>
    <tbody>
        """),_display_(Seq[Any](/*35.10*/newsList/*35.18*/.map/*35.22*/ {/*36.12*/case (news) =>/*36.26*/{_display_(Seq[Any](format.raw/*36.27*/("""
               <tr>
                   <td>
                    <a href=""""),_display_(Seq[Any](/*39.31*/controllers/*39.42*/.admin.routes.NewsController.edit(news.id))),format.raw/*39.84*/("""">"""),_display_(Seq[Any](/*39.87*/news/*39.91*/.name)),format.raw/*39.96*/("""</a>
                   </td>
                   <td>
                    """),_display_(Seq[Any](/*42.22*/news/*42.26*/.tags)),format.raw/*42.31*/("""
                   </td>
                   <td>
                       """),_display_(Seq[Any](/*45.25*/news/*45.29*/.shortName)),format.raw/*45.39*/("""
                   </td>
                   <td>
                       """),_display_(Seq[Any](/*48.25*/news/*48.29*/.introduced)),format.raw/*48.40*/("""
                   </td>
               </tr>
           """)))}})),format.raw/*52.10*/("""
    </tbody>
    </table>
    <div id="pagination">
    <ul class="pagination">
        """),_display_(Seq[Any](/*57.10*/currentPage/*57.21*/.prev.map/*57.30*/ { page =>_display_(Seq[Any](format.raw/*57.40*/("""
        <li class="prev">
        <a href=""""),_display_(Seq[Any](/*59.19*/link(page))),format.raw/*59.29*/("""">&larr; Previous</a>
        </li>
        """)))}/*61.10*/.getOrElse/*61.20*/ {_display_(Seq[Any](format.raw/*61.22*/("""
            <li class="prev disabled">
                <a>&larr; Previous</a>
            </li>
        """)))})),format.raw/*65.10*/("""
    <li class="current">
    <a>Displaying """),_display_(Seq[Any](/*67.20*/(currentPage.offset + 1))),format.raw/*67.44*/(""" to """),_display_(Seq[Any](/*67.49*/(currentPage.offset + newsList.size))),format.raw/*67.85*/(""" of """),_display_(Seq[Any](/*67.90*/currentPage/*67.101*/.total)),format.raw/*67.107*/("""</a>
    </li>
        """),_display_(Seq[Any](/*69.10*/currentPage/*69.21*/.next.map/*69.30*/ { page =>_display_(Seq[Any](format.raw/*69.40*/("""
        <li class="next">
        <a href=""""),_display_(Seq[Any](/*71.19*/link(page))),format.raw/*71.29*/("""">Next &rarr;</a>
        </li>
        """)))}/*73.10*/.getOrElse/*73.20*/ {_display_(Seq[Any](format.raw/*73.22*/("""
            <li class="next disabled">
                <a>Next &rarr;</a>
            </li>
        """)))})),format.raw/*77.10*/("""
    </ul>
    </div>
    """)))}/*80.6*/.getOrElse/*80.16*/ {_display_(Seq[Any](format.raw/*80.18*/("""
        <div class="well">
            <em>Nothing to display</em>
        </div>
    """)))})),format.raw/*84.6*/("""
""")))})),format.raw/*85.2*/("""

            """))}
    }
    
    def render(currentPage:web.Page[data.News],currentOrderBy:Int,currentFilter:String,flash:play.api.mvc.Flash): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentOrderBy,currentFilter)(flash)
    
    def f:((web.Page[data.News],Int,String) => (play.api.mvc.Flash) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentOrderBy,currentFilter) => (flash) => apply(currentPage,currentOrderBy,currentFilter)(flash)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/admin/news/list.scala.html
                    HASH: 03ce2577377fef289532a0c64009a31c14a8fec9
                    MATRIX: 609->1|800->395|813->401|926->434|982->454|1011->461|1056->470|1111->517|1196->578|1253->599|1297->621|1336->624|1363->629|1401->118|1412->122|1713->115|1741->392|1770->645|1808->648|1821->653|1876->699|1916->701|1957->707|1971->712|1999->731|2050->744|2167->825|2196->832|2248->853|2373->942|2393->953|2454->991|2520->1022|2554->1047|2588->1072|2640->1086|2756->1166|2803->1191|2853->1205|2892->1222|2942->1236|2988->1260|3038->1274|3086->1300|3171->1349|3188->1357|3201->1361|3212->1375|3235->1389|3274->1390|3385->1465|3405->1476|3469->1518|3508->1521|3521->1525|3548->1530|3659->1605|3672->1609|3699->1614|3809->1688|3822->1692|3854->1702|3964->1776|3977->1780|4010->1791|4102->1860|4228->1950|4248->1961|4266->1970|4314->1980|4395->2025|4427->2035|4491->2080|4510->2090|4550->2092|4688->2198|4769->2243|4815->2267|4856->2272|4914->2308|4955->2313|4976->2324|5005->2330|5065->2354|5085->2365|5103->2374|5151->2384|5232->2429|5264->2439|5324->2480|5343->2490|5383->2492|5517->2594|5562->2621|5581->2631|5621->2633|5740->2721|5773->2723
                    LINES: 19->1|21->9|21->9|23->9|24->10|24->10|24->10|24->10|24->10|25->11|25->11|25->11|25->11|27->3|27->3|32->1|34->7|36->13|38->15|38->15|38->15|38->15|39->16|39->16|39->16|39->16|41->18|41->18|43->20|45->22|45->22|45->22|47->24|47->24|47->24|47->24|51->28|51->28|52->29|52->29|53->30|53->30|54->31|54->31|58->35|58->35|58->35|58->36|58->36|58->36|61->39|61->39|61->39|61->39|61->39|61->39|64->42|64->42|64->42|67->45|67->45|67->45|70->48|70->48|70->48|73->52|78->57|78->57|78->57|78->57|80->59|80->59|82->61|82->61|82->61|86->65|88->67|88->67|88->67|88->67|88->67|88->67|88->67|90->69|90->69|90->69|90->69|92->71|92->71|94->73|94->73|94->73|98->77|101->80|101->80|101->80|105->84|106->85
                    -- GENERATED --
                */
            