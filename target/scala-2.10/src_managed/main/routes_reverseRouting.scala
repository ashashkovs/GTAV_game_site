// @SOURCE:D:/projects/gta5/conf/routes
// @HASH:f54406f484c2eab4899045a1199a32ee32b50e19
// @DATE:Sun Oct 27 16:11:52 MSK 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
package controllers.admin {

// @LINE:41
// @LINE:40
// @LINE:39
class ReverseNewsController {
    

// @LINE:40
def edit(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/news/edit/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:41
def editPost(id:Int): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/news/edit/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:39
def list(p:Int = 0, s:Int = 2, f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/news/list" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == 2) None else Some(implicitly[QueryStringBindable[Int]].unbind("s", s)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                
    
}
                          

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
class ReverseAdminController {
    

// @LINE:38
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/logout")
}
                                                

// @LINE:35
def admin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                                                

// @LINE:36
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/login")
}
                                                

// @LINE:37
def auth(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/auth")
}
                                                
    
}
                          

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseVideoController {
    

// @LINE:45
def createPost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/video/createPost")
}
                                                

// @LINE:47
def editPost(id:Int): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/video/editPost/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:43
// @LINE:42
def list(p:Int = 0, s:Int = 2, f:String = ""): Call = {
   (p: @unchecked, s: @unchecked, f: @unchecked) match {
// @LINE:42
case (p, s, f) if true => Call("GET", _prefix + { _defaultPrefix } + "admin/video" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == 2) None else Some(implicitly[QueryStringBindable[Int]].unbind("s", s)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
                                                        
// @LINE:43
case (p, s, f) if true => Call("GET", _prefix + { _defaultPrefix } + "admin/video/list" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == 2) None else Some(implicitly[QueryStringBindable[Int]].unbind("s", s)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
                                                        
   }
}
                                                

// @LINE:44
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/video/create")
}
                                                

// @LINE:48
def delete(id:Int): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/" + implicitly[PathBindable[Int]].unbind("id", id) + "/delete")
}
                                                

// @LINE:46
def edit(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/video/edit/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                
    
}
                          
}
                  

// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:11
// @LINE:9
// @LINE:6
// @LINE:5
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:21
// @LINE:20
class ReversePhotoController {
    

// @LINE:20
def photoList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "photo")
}
                                                

// @LINE:21
def loadsPhotoDetails(id:Int): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "photo" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
}
                                                
    
}
                          

// @LINE:31
class ReverseRadioController {
    

// @LINE:31
def radio(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "radio")
}
                                                
    
}
                          

// @LINE:24
// @LINE:23
class ReverseNewsController {
    

// @LINE:23
def newsList(p:Int, s:String, o:String, f:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "news" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), Some(implicitly[QueryStringBindable[String]].unbind("s", s)), Some(implicitly[QueryStringBindable[String]].unbind("o", o)), Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:24
def view(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "news/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:6
class ReverseMainController {
    

// @LINE:6
def main(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "main")
}
                                                
    
}
                          

// @LINE:11
// @LINE:5
class ReverseApplication {
    

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:11
def javascriptRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "javascriptRoutes")
}
                                                
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseVideoController {
    

// @LINE:17
def loadsVideoDetails(id:Int): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "video" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
}
                                                

// @LINE:16
def videoList(p:Int, s:String, o:String, f:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "video" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), Some(implicitly[QueryStringBindable[String]].unbind("s", s)), Some(implicitly[QueryStringBindable[String]].unbind("o", o)), Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:18
def view(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "videoPage/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:29
class ReverseCheatController {
    

// @LINE:29
def cheats(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cheats")
}
                                                
    
}
                          

// @LINE:27
// @LINE:26
class ReverseInfoController {
    

// @LINE:26
def hints(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "info/hints")
}
                                                

// @LINE:27
def maps(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "info/maps")
}
                                                
    
}
                          
}
                  


// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
package controllers.admin.javascript {

// @LINE:41
// @LINE:40
// @LINE:39
class ReverseNewsController {
    

// @LINE:40
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.NewsController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/news/edit/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:41
def editPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.NewsController.editPost",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/news/edit/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:39
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.NewsController.list",
   """
      function(p,s,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/news/list" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("s", s)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        
    
}
              

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
class ReverseAdminController {
    

// @LINE:38
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.AdminController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/logout"})
      }
   """
)
                        

// @LINE:35
def admin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.AdminController.admin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:36
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.AdminController.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/login"})
      }
   """
)
                        

// @LINE:37
def auth : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.AdminController.auth",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/auth"})
      }
   """
)
                        
    
}
              

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseVideoController {
    

// @LINE:45
def createPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.VideoController.createPost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/video/createPost"})
      }
   """
)
                        

// @LINE:47
def editPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.VideoController.editPost",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/video/editPost/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:43
// @LINE:42
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.VideoController.list",
   """
      function(p, s, f) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/video" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("s", s)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/video/list" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("s", s)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
      }
   """
)
                        

// @LINE:44
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.VideoController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/video/create"})
      }
   """
)
                        

// @LINE:48
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.VideoController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:46
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admin.VideoController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/video/edit/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        

// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:11
// @LINE:9
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:20
class ReversePhotoController {
    

// @LINE:20
def photoList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PhotoController.photoList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "photo"})
      }
   """
)
                        

// @LINE:21
def loadsPhotoDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PhotoController.loadsPhotoDetails",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "photo" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        
    
}
              

// @LINE:31
class ReverseRadioController {
    

// @LINE:31
def radio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RadioController.radio",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "radio"})
      }
   """
)
                        
    
}
              

// @LINE:24
// @LINE:23
class ReverseNewsController {
    

// @LINE:23
def newsList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NewsController.newsList",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "news" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)])})
      }
   """
)
                        

// @LINE:24
def view : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NewsController.view",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "news/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseMainController {
    

// @LINE:6
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.main",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "main"})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:5
class ReverseApplication {
    

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:11
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "javascriptRoutes"})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseVideoController {
    

// @LINE:17
def loadsVideoDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VideoController.loadsVideoDetails",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "video" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:16
def videoList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VideoController.videoList",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "video" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)])})
      }
   """
)
                        

// @LINE:18
def view : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VideoController.view",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "videoPage/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:29
class ReverseCheatController {
    

// @LINE:29
def cheats : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CheatController.cheats",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cheats"})
      }
   """
)
                        
    
}
              

// @LINE:27
// @LINE:26
class ReverseInfoController {
    

// @LINE:26
def hints : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InfoController.hints",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "info/hints"})
      }
   """
)
                        

// @LINE:27
def maps : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InfoController.maps",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "info/maps"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
package controllers.admin.ref {

// @LINE:41
// @LINE:40
// @LINE:39
class ReverseNewsController {
    

// @LINE:40
def edit(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.NewsController.edit(id), HandlerDef(this, "controllers.admin.NewsController", "edit", Seq(classOf[Int]), "GET", """""", _prefix + """admin/news/edit/$id<[^/]+>""")
)
                      

// @LINE:41
def editPost(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.NewsController.editPost(id), HandlerDef(this, "controllers.admin.NewsController", "editPost", Seq(classOf[Int]), "POST", """""", _prefix + """admin/news/edit/$id<[^/]+>""")
)
                      

// @LINE:39
def list(p:Int, s:Int, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.NewsController.list(p, s, f), HandlerDef(this, "controllers.admin.NewsController", "list", Seq(classOf[Int], classOf[Int], classOf[String]), "GET", """""", _prefix + """admin/news/list""")
)
                      
    
}
                          

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
class ReverseAdminController {
    

// @LINE:38
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.AdminController.logout(), HandlerDef(this, "controllers.admin.AdminController", "logout", Seq(), "GET", """""", _prefix + """admin/logout""")
)
                      

// @LINE:35
def admin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.AdminController.admin(), HandlerDef(this, "controllers.admin.AdminController", "admin", Seq(), "GET", """ Админка""", _prefix + """admin""")
)
                      

// @LINE:36
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.AdminController.login(), HandlerDef(this, "controllers.admin.AdminController", "login", Seq(), "GET", """""", _prefix + """admin/login""")
)
                      

// @LINE:37
def auth(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.AdminController.auth(), HandlerDef(this, "controllers.admin.AdminController", "auth", Seq(), "POST", """""", _prefix + """admin/auth""")
)
                      
    
}
                          

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseVideoController {
    

// @LINE:45
def createPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.VideoController.createPost(), HandlerDef(this, "controllers.admin.VideoController", "createPost", Seq(), "POST", """""", _prefix + """admin/video/createPost""")
)
                      

// @LINE:47
def editPost(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.VideoController.editPost(id), HandlerDef(this, "controllers.admin.VideoController", "editPost", Seq(classOf[Int]), "POST", """""", _prefix + """admin/video/editPost/$id<[^/]+>""")
)
                      

// @LINE:42
def list(p:Int, s:Int, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.VideoController.list(p, s, f), HandlerDef(this, "controllers.admin.VideoController", "list", Seq(classOf[Int], classOf[Int], classOf[String]), "GET", """""", _prefix + """admin/video""")
)
                      

// @LINE:44
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.VideoController.create(), HandlerDef(this, "controllers.admin.VideoController", "create", Seq(), "GET", """""", _prefix + """admin/video/create""")
)
                      

// @LINE:48
def delete(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.VideoController.delete(id), HandlerDef(this, "controllers.admin.VideoController", "delete", Seq(classOf[Int]), "POST", """""", _prefix + """admin/$id<[^/]+>/delete""")
)
                      

// @LINE:46
def edit(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admin.VideoController.edit(id), HandlerDef(this, "controllers.admin.VideoController", "edit", Seq(classOf[Int]), "GET", """""", _prefix + """admin/video/edit/$id<[^/]+>""")
)
                      
    
}
                          
}
                  

// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:11
// @LINE:9
// @LINE:6
// @LINE:5
package controllers.ref {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:21
// @LINE:20
class ReversePhotoController {
    

// @LINE:20
def photoList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PhotoController.photoList(), HandlerDef(this, "controllers.PhotoController", "photoList", Seq(), "GET", """ Photo page""", _prefix + """photo""")
)
                      

// @LINE:21
def loadsPhotoDetails(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PhotoController.loadsPhotoDetails(id), HandlerDef(this, "controllers.PhotoController", "loadsPhotoDetails", Seq(classOf[Int]), "POST", """""", _prefix + """photo""")
)
                      
    
}
                          

// @LINE:31
class ReverseRadioController {
    

// @LINE:31
def radio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RadioController.radio(), HandlerDef(this, "controllers.RadioController", "radio", Seq(), "GET", """ Radio page""", _prefix + """radio""")
)
                      
    
}
                          

// @LINE:24
// @LINE:23
class ReverseNewsController {
    

// @LINE:23
def newsList(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NewsController.newsList(p, s, o, f), HandlerDef(this, "controllers.NewsController", "newsList", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """ News page""", _prefix + """news""")
)
                      

// @LINE:24
def view(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NewsController.view(id), HandlerDef(this, "controllers.NewsController", "view", Seq(classOf[Int]), "GET", """""", _prefix + """news/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseMainController {
    

// @LINE:6
def main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.main(), HandlerDef(this, "controllers.MainController", "main", Seq(), "GET", """""", _prefix + """main""")
)
                      
    
}
                          

// @LINE:11
// @LINE:5
class ReverseApplication {
    

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq(), "GET", """""", _prefix + """javascriptRoutes""")
)
                      
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseVideoController {
    

// @LINE:17
def loadsVideoDetails(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VideoController.loadsVideoDetails(id), HandlerDef(this, "controllers.VideoController", "loadsVideoDetails", Seq(classOf[Int]), "POST", """""", _prefix + """video""")
)
                      

// @LINE:16
def videoList(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VideoController.videoList(p, s, o, f), HandlerDef(this, "controllers.VideoController", "videoList", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """ Video page""", _prefix + """video""")
)
                      

// @LINE:18
def view(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VideoController.view(id), HandlerDef(this, "controllers.VideoController", "view", Seq(classOf[Int]), "GET", """""", _prefix + """videoPage/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:29
class ReverseCheatController {
    

// @LINE:29
def cheats(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CheatController.cheats(), HandlerDef(this, "controllers.CheatController", "cheats", Seq(), "GET", """ Cheats page""", _prefix + """cheats""")
)
                      
    
}
                          

// @LINE:27
// @LINE:26
class ReverseInfoController {
    

// @LINE:26
def hints(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InfoController.hints(), HandlerDef(this, "controllers.InfoController", "hints", Seq(), "GET", """ Info page""", _prefix + """info/hints""")
)
                      

// @LINE:27
def maps(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InfoController.maps(), HandlerDef(this, "controllers.InfoController", "maps", Seq(), "GET", """""", _prefix + """info/maps""")
)
                      
    
}
                          
}
                  
      