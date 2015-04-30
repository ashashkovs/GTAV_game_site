
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
object maps extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/views/*3.7*/.html.template.main("Карты", "maps")/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""
    <div class="container" id="center-container" xmlns="http://www.w3.org/1999/html">

        <div>
            <input type="checkbox" id="checkbox1" name="letter" >
            <label for="chk1">Отрывок из письма</label>
            <input type="checkbox" id="checkbox2" name="nlo" >
            <label for="chk2">Космический корабль</label>
        </div>
        <div class="page">
            <div id="map-canvas"></div>
            <p class="siteInfo" align="center">
                Оригинал карты - <a href="https://itunes.apple.com/app/grand-theft-auto-ifruit/id697056811">iFruit приложение Rockstar Games</a>
                ) | Первоначальная реализация - <a href="http://www.gtagaming.com/">GTAGaming.com</a> <br>
                Адаптация - <a href="http://GTA5TV.ru/">gta5tv.ru</a>
            </p>
        </div>


        <script>

        function MapTypeOption ( mapName, mapId ) """),format.raw/*24.51*/("""{"""),format.raw/*24.52*/("""
        return """),format.raw/*25.16*/("""{"""),format.raw/*25.17*/("""
        getTileUrl : function ( coord, zoom ) """),format.raw/*26.47*/("""{"""),format.raw/*26.48*/("""

        var normal = getNormalizedCoord ( coord, zoom ) ;
        if ( ! normal ) """),format.raw/*29.25*/("""{"""),format.raw/*29.26*/("""
        return "/assets/images/maps/" + mapId + "/" + "blank.jpg" ;
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""

        return "/assets/images/maps/" + mapId + "/" + zoom + "_" + normal.x + "_" + normal.y + ".jpg" ;
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/(""",
        tileSize : new google.maps.Size ( 256, 256 ),
        maxZoom : 5,
        minZoom : 2,
        radius : 1738000,
        name : mapName
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/(""" ;
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/("""

        function getNormalizedCoord ( coord, zoom ) """),format.raw/*43.53*/("""{"""),format.raw/*43.54*/("""
            var x = coord.x ;
            var y = coord.y ;
            var  diapason = 1 << zoom ;
            if ( y >=  diapason || y < 0 ) """),format.raw/*47.44*/("""{"""),format.raw/*47.45*/("""return null"""),format.raw/*47.56*/("""}"""),format.raw/*47.57*/("""
            if ( x < 0 || x >=  diapason ) """),format.raw/*48.44*/("""{"""),format.raw/*48.45*/("""x = ( x %  diapason +  diapason ) %  diapason"""),format.raw/*48.90*/("""}"""),format.raw/*48.91*/("""
            return """),format.raw/*49.20*/("""{"""),format.raw/*49.21*/("""x : x, y : y"""),format.raw/*49.33*/("""}"""),format.raw/*49.34*/(""" ;
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/("""

        var typesMap = """),format.raw/*52.24*/("""{"""),format.raw/*52.25*/("""
        "satell" : new google.maps.ImageMapType ( MapTypeOption ( "Спутник", "satell" ) ),
        "atlas" : new google.maps.ImageMapType ( MapTypeOption ( "Карта местности", "atlas" ) ),
        "road" : new google.maps.ImageMapType ( MapTypeOption ( "Карта дорог", "road" ) )
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/(""" ;

        google.maps.event.addDomListener ( window, "load", function ( ) """),format.raw/*58.73*/("""{"""),format.raw/*58.74*/("""
        var map_options = """),format.raw/*59.27*/("""{"""),format.raw/*59.28*/("""
            center : new google.maps.LatLng ( 0, 0 ),
            zoom : 2,
            streetViewControl : false,
            mapTypeControlOptions : """),format.raw/*63.37*/("""{"""),format.raw/*63.38*/("""
            mapTypeIds :[ "satell", "atlas", "road" ]
            """),format.raw/*65.13*/("""}"""),format.raw/*65.14*/("""
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/(""" ;

        var map = new google.maps.Map ( document.getElementById ( "map-canvas" ), map_options ),
        title_letter = 'Отрывок из письма' ;
        image_letter = '/assets/images/maps/icons/letter.png' ;
        var icon = new google.maps.MarkerImage ( image_letter, new google.maps.Size ( 24, 24 ), new google.maps.Point ( 0, 0 ) ) ;
        var locations_letter =[
        [ - 81.73583037869732, 14.8095703123 ],
        [ - 15.496032414238635, 70.7958984371 ],
        [ - 79.75774896078302, 3.603515626 ],
        [ - 80.8588748843299, - 46.669921877 ],
        [ - 79.05513728566137, - 40.60546877 ],
        [ - 80.3496314080124, - 16.962890628 ],
        [ - 77.04927084349017, 28.828126 ],
        [ - 75.85591106616446, - 12.568359376 ],
        [ - 74.21198251594366, - 15.556640626 ],
        [ - 71.25848024041381, - 54.7119140626 ],
        [ - 70.62719676071550, 67.6318359376 ],
        [ - 68.78414378041500, - 44.4287109373 ],
        [ - 69.14692017504961, - 68.1591796874 ],
        [ - 67.67608458198099, 4.5263671873 ],
        [ - 66.63555577803262, - 18.28125 ],
        [ - 60.41385235046494, - 49.21873 ],
        [ - 59.66774058164962, - 12.216796874 ],
        [ - 58.03137242177636, 20.830078124 ],
        [ - 56.072035471800867, - 64.8193359374 ],
        [ - 56.12106042504409, - 6.8994140624 ],
        [ - 52.10650519075632, - 103.2275390626 ],
        [ - 50.93073802371819, - 25.224609375 ],
        [ - 47.93106634750979, 18.193359374 ],
        [ - 47.66538735632652, - 81.2548828124 ],
        [ - 35.56798045801209, - 18.80859376 ],
        [ - 24.60706913770969, 7.470703126 ],
        [ - 22.715390019335929, - 59.4140626 ],
        [ - 1.845383988573186, - 31.640626 ],
        [ 0.08789059053083692, 73.5205078124 ],
        [ 3.0746950723696944, - 9.755859375 ],
        [ 7.972197714386877, 11.953125 ],
        [ 13.667338259654947, - 84.4189453125 ],
        [ 16.25686733062342, - 40.7373046875 ],
        [ 18.8543103618899, - 23.02734375 ],
        [ 19.559790136497399, - 7.294921874 ],
        [ 22.755920681486405, 23.5546874 ],
        [ 37.96152331396613, 30.5419921874 ],
        [ 51.890053935216924, - 60.556640623 ],
        [ 53.014783245859234, - 14.150390622 ],
        [ 52.295042284537322, 24.9169921874 ],
        [ 60.06484046010451, - 41.1767578123 ],
        [ - 31.203404950917384, - 44.5166015623 ],
        [ 64.20637724320851, 40.78125 ],
        [ 65.16457888401898, 84.6826171878 ],
        [ 68.28565146003618, - 31.552734378 ],
        [ 69.77895177646761, - 1.7578127 ],
        [ 76.22690740640382, - 26.630859376 ],
        [ 76.2059670431413, 26.806640624 ],
        [ 77.41825440071793, 27.2021484376 ],
        [ 78.41136870123747, - 11.6015623 ]
        ] ;

        $ ( '#checkbox1' ).on ( 'change', function ( ) """),format.raw/*125.56*/("""{"""),format.raw/*125.57*/("""
            if ( this.checked ) """),format.raw/*126.33*/("""{"""),format.raw/*126.34*/("""
                for ( var l = 0 ; l < locations_letter.length ; l ++ ) """),format.raw/*127.72*/("""{"""),format.raw/*127.73*/("""
                    marker = new google.maps.Marker ( """),format.raw/*128.55*/("""{"""),format.raw/*128.56*/("""
                    position : new google.maps.LatLng ( locations_letter[ l ][ 0 ], locations_letter[ l ][ 1 ] ),
                    map : map,
                    title : title_letter,
                    icon : icon
                    """),format.raw/*133.21*/("""}"""),format.raw/*133.22*/(""" ) ;
                """),format.raw/*134.17*/("""}"""),format.raw/*134.18*/("""
            """),format.raw/*135.13*/("""}"""),format.raw/*135.14*/("""
            else """),format.raw/*136.18*/("""{"""),format.raw/*136.19*/("""
            """),format.raw/*137.13*/("""}"""),format.raw/*137.14*/("""
        """),format.raw/*138.9*/("""}"""),format.raw/*138.10*/(""" ) ;

        title = 'Космический корабль' ;
        image_nlo = '/assets/images/maps/icons/nlo.png' ;
        var icon_nlo = new google.maps.MarkerImage ( image_nlo, new google.maps.Size ( 24, 24 ), new google.maps.Point ( 0, 0 ) ) ;
        var locations_nlo = [
        [21.493963563064452, 42.01171871],
        [19.518375478601561, 10.1953122],
        [41.50857729743933, 58.0078123],
        [35.38904996691164, 41.7041015624],
        [43.32517767999295, 28.3447265625],
        [54.749990970226926, 95.888671876],
        [60.06484046010457, 55.810546877],
        [70.17020068549208, 48.9111328128],
        [77.06895356504109, -3.076171879],
        [75.02766361549941, -24.3017578120],
        [69.93030017617482, -28.916015621],
        [68.00757101804003, -56.7333984372],
        [56.96893619436124, -71.1474609373],
        [54.85131525968605, -30.4541015624],
        [37.50972584293756, -31.640624],
        [30.524413269923987, -12.919921874],
        [21.90227796666868, -26.5869140626],
        [-1.4500404973607949, -56.5576171877],
        [-6.227933930268671, -70.7080078128],
        [-22.63429269379353, -70.0927734379],
        [-21.002471054356714, -96.416015621],
        [-34.63320791137955, -58.53515622],
        [-29.726222319395506, -27.4658203123],
        [-36.38591277287657, -12.744140624],
        [-40.31304320888088, -14.2822265626],
        [-53.67068019347261, -50.537109377],
        [-53.94698448906466, -25.41614055633548],
        [-56.792409151130853, -22.03235149383549],
        [-61.05828537037912, -48.0322265622],
        [-69.05285807666013, -40.60546873],
        [-61.81466389468394, -10.4150390624],
        [-66.35513620288550, 0.8349609376],
        [-64.1297836764254, -1.494140627],
        [-69.53451763078357, -16.171878],
        [-61.897577621605015, -8.61328129],
        [-77.157162522660, -4.130859371],
        [-83.47037908027311, -50.09765622],
        [-80.53207112232732, -5.009765623],
        [-82.45453683432583, 3.2080078124],
        [-79.78116424879934, 18.369140625],
        [-80.77471572295194, 30.8056640626],
        [-73.37821477939465, 35.5078122],
        [-68.46379955520323, 20.7421873],
        [-52.482780222078203, 34.27734374],
        [-42.71473218539452, 42.275390627],
        [-36.56260003738543, 69.873046878],
        [-9.449061826881416, 8.96484379],
        [0, 25.48828127],
        [2.986927393334877, -9.931640627],
        [0.7909904981540056, 76.025390626]
        ];

        $ ( '#checkbox2' ).on ( 'change', function ( ) """),format.raw/*196.56*/("""{"""),format.raw/*196.57*/("""
            if ( this.checked ) """),format.raw/*197.33*/("""{"""),format.raw/*197.34*/("""
                for ( var n = 0 ; n < locations_nlo.length ; n ++ ) """),format.raw/*198.69*/("""{"""),format.raw/*198.70*/("""
                    marker = new google.maps.Marker ( """),format.raw/*199.55*/("""{"""),format.raw/*199.56*/("""
                    position : new google.maps.LatLng ( locations_nlo[ n ][ 0 ], locations_nlo[ n ][ 1 ] ),
                    map : map,
                    title : title,
                    icon : icon_nlo
                    """),format.raw/*204.21*/("""}"""),format.raw/*204.22*/(""" ) ;
                """),format.raw/*205.17*/("""}"""),format.raw/*205.18*/("""
            """),format.raw/*206.13*/("""}"""),format.raw/*206.14*/("""
            else """),format.raw/*207.18*/("""{"""),format.raw/*207.19*/("""

            """),format.raw/*209.13*/("""}"""),format.raw/*209.14*/("""
        """),format.raw/*210.9*/("""}"""),format.raw/*210.10*/(""" ) ;

        map.mapTypes.set ( "satell", typesMap[ "satell" ] ) ;
        map.mapTypes.set ( "atlas", typesMap[ "atlas" ] ) ;
        map.mapTypes.set ( "road", typesMap[ "road" ] ) ;
        map.setMapTypeId ( "satell" )

        """),format.raw/*217.9*/("""}"""),format.raw/*217.10*/(""" ) ;
        </script></div>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:40 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/maps.scala.html
                    HASH: 222bc39ba8512e23baca2bb2c46a4d50a9d155a7
                    MATRIX: 548->1|643->3|680->6|692->11|736->47|775->49|1702->948|1731->949|1775->965|1804->966|1879->1013|1908->1014|2020->1098|2049->1099|2153->1176|2182->1177|2323->1291|2352->1292|2534->1447|2563->1448|2601->1459|2630->1460|2712->1514|2741->1515|2913->1659|2942->1660|2981->1671|3010->1672|3082->1716|3111->1717|3184->1762|3213->1763|3261->1783|3290->1784|3330->1796|3359->1797|3397->1808|3426->1809|3479->1834|3508->1835|3822->2122|3851->2123|3955->2199|3984->2200|4039->2227|4068->2228|4248->2380|4277->2381|4372->2448|4401->2449|4437->2458|4466->2459|7298->5262|7328->5263|7390->5296|7420->5297|7521->5369|7551->5370|7635->5425|7665->5426|7934->5666|7964->5667|8014->5688|8044->5689|8086->5702|8116->5703|8163->5721|8193->5722|8235->5735|8265->5736|8302->5745|8332->5746|10892->8277|10922->8278|10984->8311|11014->8312|11112->8381|11142->8382|11226->8437|11256->8438|11516->8669|11546->8670|11596->8691|11626->8692|11668->8705|11698->8706|11745->8724|11775->8725|11818->8739|11848->8740|11885->8749|11915->8750|12176->8983|12206->8984
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3|45->24|45->24|46->25|46->25|47->26|47->26|50->29|50->29|52->31|52->31|55->34|55->34|61->40|61->40|62->41|62->41|64->43|64->43|68->47|68->47|68->47|68->47|69->48|69->48|69->48|69->48|70->49|70->49|70->49|70->49|71->50|71->50|73->52|73->52|77->56|77->56|79->58|79->58|80->59|80->59|84->63|84->63|86->65|86->65|87->66|87->66|146->125|146->125|147->126|147->126|148->127|148->127|149->128|149->128|154->133|154->133|155->134|155->134|156->135|156->135|157->136|157->136|158->137|158->137|159->138|159->138|217->196|217->196|218->197|218->197|219->198|219->198|220->199|220->199|225->204|225->204|226->205|226->205|227->206|227->206|228->207|228->207|230->209|230->209|231->210|231->210|238->217|238->217
                    -- GENERATED --
                */
            