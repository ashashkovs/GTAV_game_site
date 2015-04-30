
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
object hints extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
"""),_display_(Seq[Any](/*2.2*/views/*2.7*/.html.template.main("Советы и подсказки, прохождение", "hints")/*2.70*/ {_display_(Seq[Any](format.raw/*2.72*/("""
    <div class="container" id="center-container">
        <div class="container-hints font-hints">
            <h3>Эта страница содержит различные советы и подсказки, которые сделают процесс игры в GTA V более продуктивным и занимательным. Это не читы, а стратегии, следуя которым вы можете стать лучшим игроком.</h3>
            <br>
            <h4>Получаем  халяву и скидки</h4>
            <img class="leftimg img-max-width" src=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("images/91.jpg"))),format.raw/*8.87*/("""" alt="" width="400">  <br>
            <p>Lifeinvader – это эквивалент Facebook’a в GTA 5.  Stalk – это эквивалент фэйсбуковского  Like  в Lifeinvader.</p>
            <p>Определенные магазины в игре предлагают скидки или бесплатный товар за проставление stalk’a – “лайка” магазину на его странице в Lifeinvader.</p><br><br><br><br><br>
            <ul>Ниже приведен список известных в настоящее время вещей  и скидок, которые вы можете бесплатно получить за stalk:
                <li>Stalk на странице Elitas Travel дает Вам скидку в 10 % от первой покупки на elitastravel.com</li>
                <li>Stalk на странице Herr Kutz Barber дает Вам бесплатную стрижку при первом посещении этой сети парикмахерских</li>
                <li>Stalk на странице InkInc  обеспечит Вам бесплатную татуировку на выбор</li>
                <li>Stalk на странице Legendary Motorsport дает Вам скидку в 10 % при первой покупке через их онлайн-шоурум</li>
                <li>Stalk на странице Los Santos Customs обеспечивает Вам бесплатную покраску любого транспортного средства</li>
                <li>Stalk на странице Redwood Cigarettes дает вам скидку в 10 % при первом посещении любого госпиталя</li>
                <li>Stalk на странице Sprunk, естественно, обеспечит вам бесплатную баночку напитка Sprunk</li>
                <li> И, наконец, stalk на странице Warstock Cache & Carry дает Вам скидку в 10 % от первой покупки в магазине.</li>
            </ul><br>
            <h4>Постоянная скидка в магазинах сети “Амму-нация” (Ammunation)</h4>
                <img class="leftimg img-max-width" src=""""),_display_(Seq[Any](/*22.58*/routes/*22.64*/.Assets.at("images/GTA-V-Ammu-nation.jpg"))),format.raw/*22.106*/("""" alt="" width="400"><br>
            <p>Во всех магазинах “Амму-нация” доступна скидка в 25 %, и доступна она уже с того момента как Вы только начали игру. Итак, чтоб получить скидку, проследуйте в любой магазин “Амму-нация”, войдите внутрь и пройдите к стрельбищу. Далее, заработайте золотые медали во всех испытаниях. В худшем случае это займет 20 минут. Как только Вы получите последнее ‘золото’, Вам станет доступна постоянная скидка в 25%, она сохранится и будет действовать во всех магазинах “Амму-нация”.<p><br><br>
            <h4>Бесплатные улучшения для оружия</h4>
                <p>Апгрейды для оружия получить совсем не трудно, и Вы можете получить их бесплатно. Будучи на выполнении миссии, зайдите в  “Амму-нацию” и купите все оружие, какое можете себе позволить, в том числе и гранату, если, конечно, у Вас её еще нет. Покиньте магазин, а затем взорвите себя с помощью гранаты.  Это и правда настолько просто.  Миссия будет провалена, но, как только вы начнете заново, апгрейды будут целы и все деньги, потраченные на оружие, будут возвращены.</p><br>
                <h4>Сам себе не по зубам / Out Of Your Depth</h4>
                <p>Out Of Your Depth – это достижение на Xbox 360 и трофей на PS3, очень важная штука, которую можно заработать, убив акулу или, наоборот, став ее добычей. Итак, получить это достижение (трофей) достаточно просто. Найдите лодку или водные лыжи и плывите до тех пор, пока вода не станет темно-синей. Там, где вода темно-синяя – и есть глубокое место в океане, где водятся акулы. Покатайтесь по этой темной воде пока на мини-карте не появится красный значок. Этот значок и есть акула. Теперь осталось только прыгнуть в воду и убить акулу или подождать пока она не съест Вас. </p>
        </div>
    </div>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:40 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/hints.scala.html
                    HASH: de3e82d337e6a0fd5f19f86097c17ac6193eea83
                    MATRIX: 549->1|644->3|680->5|692->10|763->73|802->75|1273->511|1287->517|1335->544|2972->2145|2987->2151|3052->2193
                    LINES: 19->1|22->1|23->2|23->2|23->2|23->2|29->8|29->8|29->8|43->22|43->22|43->22
                    -- GENERATED --
                */
            