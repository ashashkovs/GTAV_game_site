
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[web.Page[scala.Tuple2[data.Video, data.VideoCategory]],Int,String,play.api.mvc.Flash,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: web.Page[(data.Video, data.VideoCategory)], currentOrderBy: Int, currentFilter: String)(implicit flash: play.api.mvc.Flash):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*10.2*/header/*10.8*/(orderBy: Int, title: String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.41*/("""
    <th class="col"""),_display_(Seq[Any](/*11.20*/orderBy)),format.raw/*11.27*/(""" header """),_display_(Seq[Any](/*11.36*/if(scala.math.abs(currentOrderBy) == orderBy){/*11.83*/{if(currentOrderBy < 0) "headerSortDown" else "headerSortUp"}})),format.raw/*11.144*/("""">
        <a href=""""),_display_(Seq[Any](/*12.19*/link(0, Some(orderBy)))),format.raw/*12.41*/("""">"""),_display_(Seq[Any](/*12.44*/title)),format.raw/*12.49*/("""</a>
    </th>
""")))};def /*3.2*/link/*3.6*/(newPage: Int, newOrderBy: Option[Int] = None) = {{
    controllers.admin.routes.VideoController.list(newPage, newOrderBy.map { orderBy =>
        if(orderBy == scala.math.abs(currentOrderBy)) -currentOrderBy else orderBy
    }.getOrElse(currentOrderBy), currentFilter)

}};
Seq[Any](format.raw/*1.139*/("""

"""),format.raw/*8.2*/("""

"""),format.raw/*14.2*/("""

"""),_display_(Seq[Any](/*16.2*/views/*16.7*/.html.template.admin("Видео", "video", false)/*16.52*/ {_display_(Seq[Any](format.raw/*16.54*/("""
    """),_display_(Seq[Any](/*17.6*/flash/*17.11*/.get("success").map/*17.30*/ { message =>_display_(Seq[Any](format.raw/*17.43*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*19.37*/message)),format.raw/*19.44*/("""
        </div>
    """)))})),format.raw/*21.6*/("""
    <div id="actions">
        <a type="button" class="btn btn-success" id="add" href=""""),_display_(Seq[Any](/*23.66*/controllers/*23.77*/.admin.routes.VideoController.create())),format.raw/*23.115*/("""">Добавить</a>
        <form action="/admin/videoList" method="GET" class="navbar-form navbar-right">
            <div class="form-group">
                <input type="search" class="form-control" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*26.91*/currentFilter)),format.raw/*26.104*/("""" placeholder="Наименование">
            </div>
            <input type="submit" id="searchsubmit" value="Поиск" class="btn btn-primary">
        </form>
    </div>
    """),_display_(Seq[Any](/*31.6*/Option(currentPage.items)/*31.31*/.filterNot(_.isEmpty).map/*31.56*/ { videos =>_display_(Seq[Any](format.raw/*31.68*/("""
    <table class="table table-bordered">
    <thead>
    <tr>
            """),_display_(Seq[Any](/*35.14*/header(2, "Наименование"))),format.raw/*35.39*/("""
            """),_display_(Seq[Any](/*36.14*/header(3, "Категория"))),format.raw/*36.36*/("""
            """),_display_(Seq[Any](/*37.14*/header(4, "Дата создания"))),format.raw/*37.40*/("""
        </tr>
    </thead>
    <tbody>
        """),_display_(Seq[Any](/*41.10*/videos/*41.16*/.map/*41.20*/ {/*42.13*/case (video, category) =>/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
                <tr>
                <td><a href=""""),_display_(Seq[Any](/*44.31*/controllers/*44.42*/.admin.routes.VideoController.edit(video.id))),format.raw/*44.86*/("""">"""),_display_(Seq[Any](/*44.89*/video/*44.94*/.name)),format.raw/*44.99*/("""</a></td>
                <td>
                    """),_display_(Seq[Any](/*46.22*/category/*46.30*/.name)),format.raw/*46.35*/("""
                </td>
                <td>
                    """),_display_(Seq[Any](/*49.22*/video/*49.27*/.introduced)),format.raw/*49.38*/("""
                </td>
                </tr>
            """)))}})),format.raw/*53.10*/("""
    </tbody>
    </table>
    <div id="pagination">
    <ul class="pagination">
        """),_display_(Seq[Any](/*58.10*/currentPage/*58.21*/.prev.map/*58.30*/ { page =>_display_(Seq[Any](format.raw/*58.40*/("""
        <li class="prev">
        <a href=""""),_display_(Seq[Any](/*60.19*/link(page))),format.raw/*60.29*/("""">&larr; Previous</a>
        </li>
        """)))}/*62.10*/.getOrElse/*62.20*/ {_display_(Seq[Any](format.raw/*62.22*/("""
            <li class="prev disabled">
                <a>&larr; Previous</a>
            </li>
        """)))})),format.raw/*66.10*/("""
    <li class="current">
    <a>Displaying """),_display_(Seq[Any](/*68.20*/(currentPage.offset + 1))),format.raw/*68.44*/(""" to """),_display_(Seq[Any](/*68.49*/(currentPage.offset + videos.size))),format.raw/*68.83*/(""" of """),_display_(Seq[Any](/*68.88*/currentPage/*68.99*/.total)),format.raw/*68.105*/("""</a>
    </li>
        """),_display_(Seq[Any](/*70.10*/currentPage/*70.21*/.next.map/*70.30*/ { page =>_display_(Seq[Any](format.raw/*70.40*/("""
        <li class="next">
        <a href=""""),_display_(Seq[Any](/*72.19*/link(page))),format.raw/*72.29*/("""">Next &rarr;</a>
        </li>
        """)))}/*74.10*/.getOrElse/*74.20*/ {_display_(Seq[Any](format.raw/*74.22*/("""
            <li class="next disabled">
                <a>Next &rarr;</a>
            </li>
        """)))})),format.raw/*78.10*/("""
    </ul>
    </div>
    """)))}/*81.6*/.getOrElse/*81.16*/ {_display_(Seq[Any](format.raw/*81.18*/("""
        <div class="well">
            <em>Nothing to display</em>
        </div>
    """)))})),format.raw/*85.6*/("""
""")))})),format.raw/*86.2*/("""

            """))}
    }
    
    def render(currentPage:web.Page[scala.Tuple2[data.Video, data.VideoCategory]],currentOrderBy:Int,currentFilter:String,flash:play.api.mvc.Flash): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentOrderBy,currentFilter)(flash)
    
    def f:((web.Page[scala.Tuple2[data.Video, data.VideoCategory]],Int,String) => (play.api.mvc.Flash) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentOrderBy,currentFilter) => (flash) => apply(currentPage,currentOrderBy,currentFilter)(flash)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/admin/video/list.scala.html
                    HASH: aa7fd51d7d5a7db3e90caa2b08aa748b62b2a347
                    MATRIX: 645->1|860->420|874->426|988->459|1044->479|1073->486|1118->495|1173->542|1258->603|1315->624|1359->646|1398->649|1425->654|1463->141|1474->145|1777->138|1805->417|1834->670|1872->673|1885->678|1939->723|1979->725|2020->731|2034->736|2062->755|2113->768|2230->849|2259->856|2311->877|2436->966|2456->977|2517->1015|2782->1244|2818->1257|3024->1428|3058->1453|3092->1478|3142->1490|3254->1566|3301->1591|3351->1605|3395->1627|3445->1641|3493->1667|3578->1716|3593->1722|3606->1726|3617->1741|3651->1766|3691->1768|3779->1820|3799->1831|3865->1875|3904->1878|3918->1883|3945->1888|4033->1940|4050->1948|4077->1953|4178->2018|4192->2023|4225->2034|4316->2102|4442->2192|4462->2203|4480->2212|4528->2222|4609->2267|4641->2277|4705->2322|4724->2332|4764->2334|4902->2440|4983->2485|5029->2509|5070->2514|5126->2548|5167->2553|5187->2564|5216->2570|5276->2594|5296->2605|5314->2614|5362->2624|5443->2669|5475->2679|5535->2720|5554->2730|5594->2732|5728->2834|5773->2861|5792->2871|5832->2873|5951->2961|5984->2963
                    LINES: 19->1|21->10|21->10|23->10|24->11|24->11|24->11|24->11|24->11|25->12|25->12|25->12|25->12|27->3|27->3|33->1|35->8|37->14|39->16|39->16|39->16|39->16|40->17|40->17|40->17|40->17|42->19|42->19|44->21|46->23|46->23|46->23|49->26|49->26|54->31|54->31|54->31|54->31|58->35|58->35|59->36|59->36|60->37|60->37|64->41|64->41|64->41|64->42|64->42|64->42|66->44|66->44|66->44|66->44|66->44|66->44|68->46|68->46|68->46|71->49|71->49|71->49|74->53|79->58|79->58|79->58|79->58|81->60|81->60|83->62|83->62|83->62|87->66|89->68|89->68|89->68|89->68|89->68|89->68|89->68|91->70|91->70|91->70|91->70|93->72|93->72|95->74|95->74|95->74|99->78|102->81|102->81|102->81|106->85|107->86
                    -- GENERATED --
                */
            