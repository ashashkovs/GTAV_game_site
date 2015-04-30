// @SOURCE:D:/projects/gta5/conf/routes
// @HASH:f54406f484c2eab4899045a1199a32ee32b50e19
// @DATE:Sun Oct 27 16:11:52 MSK 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:5
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:6
private[this] lazy val controllers_MainController_main1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("main"))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:11
private[this] lazy val controllers_Application_javascriptRoutes3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("javascriptRoutes"))))
        

// @LINE:16
private[this] lazy val controllers_VideoController_videoList4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("video"))))
        

// @LINE:17
private[this] lazy val controllers_VideoController_loadsVideoDetails5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("video"))))
        

// @LINE:18
private[this] lazy val controllers_VideoController_view6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("videoPage/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:20
private[this] lazy val controllers_PhotoController_photoList7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("photo"))))
        

// @LINE:21
private[this] lazy val controllers_PhotoController_loadsPhotoDetails8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("photo"))))
        

// @LINE:23
private[this] lazy val controllers_NewsController_newsList9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("news"))))
        

// @LINE:24
private[this] lazy val controllers_NewsController_view10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("news/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_InfoController_hints11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("info/hints"))))
        

// @LINE:27
private[this] lazy val controllers_InfoController_maps12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("info/maps"))))
        

// @LINE:29
private[this] lazy val controllers_CheatController_cheats13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cheats"))))
        

// @LINE:31
private[this] lazy val controllers_RadioController_radio14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("radio"))))
        

// @LINE:35
private[this] lazy val controllers_admin_AdminController_admin15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
        

// @LINE:36
private[this] lazy val controllers_admin_AdminController_login16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/login"))))
        

// @LINE:37
private[this] lazy val controllers_admin_AdminController_auth17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/auth"))))
        

// @LINE:38
private[this] lazy val controllers_admin_AdminController_logout18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/logout"))))
        

// @LINE:39
private[this] lazy val controllers_admin_NewsController_list19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/news/list"))))
        

// @LINE:40
private[this] lazy val controllers_admin_NewsController_edit20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/news/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:41
private[this] lazy val controllers_admin_NewsController_editPost21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/news/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:42
private[this] lazy val controllers_admin_VideoController_list22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/video"))))
        

// @LINE:43
private[this] lazy val controllers_admin_VideoController_list23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/video/list"))))
        

// @LINE:44
private[this] lazy val controllers_admin_VideoController_create24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/video/create"))))
        

// @LINE:45
private[this] lazy val controllers_admin_VideoController_createPost25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/video/createPost"))))
        

// @LINE:46
private[this] lazy val controllers_admin_VideoController_edit26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/video/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:47
private[this] lazy val controllers_admin_VideoController_editPost27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/video/editPost/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:48
private[this] lazy val controllers_admin_VideoController_delete28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """main""","""controllers.MainController.main()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """javascriptRoutes""","""controllers.Application.javascriptRoutes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """video""","""controllers.VideoController.videoList(p:Int, s:String, o:String, f:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """video""","""controllers.VideoController.loadsVideoDetails(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """videoPage/$id<[^/]+>""","""controllers.VideoController.view(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """photo""","""controllers.PhotoController.photoList()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """photo""","""controllers.PhotoController.loadsPhotoDetails(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """news""","""controllers.NewsController.newsList(p:Int, s:String, o:String, f:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """news/$id<[^/]+>""","""controllers.NewsController.view(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """info/hints""","""controllers.InfoController.hints()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """info/maps""","""controllers.InfoController.maps()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cheats""","""controllers.CheatController.cheats()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """radio""","""controllers.RadioController.radio()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.admin.AdminController.admin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/login""","""controllers.admin.AdminController.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/auth""","""controllers.admin.AdminController.auth"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/logout""","""controllers.admin.AdminController.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/news/list""","""controllers.admin.NewsController.list(p:Int ?= 0, s:Int ?= 2, f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/news/edit/$id<[^/]+>""","""controllers.admin.NewsController.edit(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/news/edit/$id<[^/]+>""","""controllers.admin.NewsController.editPost(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/video""","""controllers.admin.VideoController.list(p:Int ?= 0, s:Int ?= 2, f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/video/list""","""controllers.admin.VideoController.list(p:Int ?= 0, s:Int ?= 2, f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/video/create""","""controllers.admin.VideoController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/video/createPost""","""controllers.admin.VideoController.createPost()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/video/edit/$id<[^/]+>""","""controllers.admin.VideoController.edit(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/video/editPost/$id<[^/]+>""","""controllers.admin.VideoController.editPost(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/$id<[^/]+>/delete""","""controllers.admin.VideoController.delete(id:Int)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:5
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:6
case controllers_MainController_main1(params) => {
   call { 
        invokeHandler(controllers.MainController.main(), HandlerDef(this, "controllers.MainController", "main", Nil,"GET", """""", Routes.prefix + """main"""))
   }
}
        

// @LINE:9
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:11
case controllers_Application_javascriptRoutes3(params) => {
   call { 
        invokeHandler(controllers.Application.javascriptRoutes, HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil,"GET", """""", Routes.prefix + """javascriptRoutes"""))
   }
}
        

// @LINE:16
case controllers_VideoController_videoList4(params) => {
   call(params.fromQuery[Int]("p", None), params.fromQuery[String]("s", None), params.fromQuery[String]("o", None), params.fromQuery[String]("f", None)) { (p, s, o, f) =>
        invokeHandler(controllers.VideoController.videoList(p, s, o, f), HandlerDef(this, "controllers.VideoController", "videoList", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """ Video page""", Routes.prefix + """video"""))
   }
}
        

// @LINE:17
case controllers_VideoController_loadsVideoDetails5(params) => {
   call(params.fromQuery[Int]("id", None)) { (id) =>
        invokeHandler(controllers.VideoController.loadsVideoDetails(id), HandlerDef(this, "controllers.VideoController", "loadsVideoDetails", Seq(classOf[Int]),"POST", """""", Routes.prefix + """video"""))
   }
}
        

// @LINE:18
case controllers_VideoController_view6(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.VideoController.view(id), HandlerDef(this, "controllers.VideoController", "view", Seq(classOf[Int]),"GET", """""", Routes.prefix + """videoPage/$id<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_PhotoController_photoList7(params) => {
   call { 
        invokeHandler(controllers.PhotoController.photoList(), HandlerDef(this, "controllers.PhotoController", "photoList", Nil,"GET", """ Photo page""", Routes.prefix + """photo"""))
   }
}
        

// @LINE:21
case controllers_PhotoController_loadsPhotoDetails8(params) => {
   call(params.fromQuery[Int]("id", None)) { (id) =>
        invokeHandler(controllers.PhotoController.loadsPhotoDetails(id), HandlerDef(this, "controllers.PhotoController", "loadsPhotoDetails", Seq(classOf[Int]),"POST", """""", Routes.prefix + """photo"""))
   }
}
        

// @LINE:23
case controllers_NewsController_newsList9(params) => {
   call(params.fromQuery[Int]("p", None), params.fromQuery[String]("s", None), params.fromQuery[String]("o", None), params.fromQuery[String]("f", None)) { (p, s, o, f) =>
        invokeHandler(controllers.NewsController.newsList(p, s, o, f), HandlerDef(this, "controllers.NewsController", "newsList", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """ News page""", Routes.prefix + """news"""))
   }
}
        

// @LINE:24
case controllers_NewsController_view10(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.NewsController.view(id), HandlerDef(this, "controllers.NewsController", "view", Seq(classOf[Int]),"GET", """""", Routes.prefix + """news/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_InfoController_hints11(params) => {
   call { 
        invokeHandler(controllers.InfoController.hints(), HandlerDef(this, "controllers.InfoController", "hints", Nil,"GET", """ Info page""", Routes.prefix + """info/hints"""))
   }
}
        

// @LINE:27
case controllers_InfoController_maps12(params) => {
   call { 
        invokeHandler(controllers.InfoController.maps(), HandlerDef(this, "controllers.InfoController", "maps", Nil,"GET", """""", Routes.prefix + """info/maps"""))
   }
}
        

// @LINE:29
case controllers_CheatController_cheats13(params) => {
   call { 
        invokeHandler(controllers.CheatController.cheats(), HandlerDef(this, "controllers.CheatController", "cheats", Nil,"GET", """ Cheats page""", Routes.prefix + """cheats"""))
   }
}
        

// @LINE:31
case controllers_RadioController_radio14(params) => {
   call { 
        invokeHandler(controllers.RadioController.radio(), HandlerDef(this, "controllers.RadioController", "radio", Nil,"GET", """ Radio page""", Routes.prefix + """radio"""))
   }
}
        

// @LINE:35
case controllers_admin_AdminController_admin15(params) => {
   call { 
        invokeHandler(controllers.admin.AdminController.admin, HandlerDef(this, "controllers.admin.AdminController", "admin", Nil,"GET", """ Админка""", Routes.prefix + """admin"""))
   }
}
        

// @LINE:36
case controllers_admin_AdminController_login16(params) => {
   call { 
        invokeHandler(controllers.admin.AdminController.login, HandlerDef(this, "controllers.admin.AdminController", "login", Nil,"GET", """""", Routes.prefix + """admin/login"""))
   }
}
        

// @LINE:37
case controllers_admin_AdminController_auth17(params) => {
   call { 
        invokeHandler(controllers.admin.AdminController.auth, HandlerDef(this, "controllers.admin.AdminController", "auth", Nil,"POST", """""", Routes.prefix + """admin/auth"""))
   }
}
        

// @LINE:38
case controllers_admin_AdminController_logout18(params) => {
   call { 
        invokeHandler(controllers.admin.AdminController.logout, HandlerDef(this, "controllers.admin.AdminController", "logout", Nil,"GET", """""", Routes.prefix + """admin/logout"""))
   }
}
        

// @LINE:39
case controllers_admin_NewsController_list19(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[Int]("s", Some(2)), params.fromQuery[String]("f", Some(""))) { (p, s, f) =>
        invokeHandler(controllers.admin.NewsController.list(p, s, f), HandlerDef(this, "controllers.admin.NewsController", "list", Seq(classOf[Int], classOf[Int], classOf[String]),"GET", """""", Routes.prefix + """admin/news/list"""))
   }
}
        

// @LINE:40
case controllers_admin_NewsController_edit20(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.admin.NewsController.edit(id), HandlerDef(this, "controllers.admin.NewsController", "edit", Seq(classOf[Int]),"GET", """""", Routes.prefix + """admin/news/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:41
case controllers_admin_NewsController_editPost21(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.admin.NewsController.editPost(id), HandlerDef(this, "controllers.admin.NewsController", "editPost", Seq(classOf[Int]),"POST", """""", Routes.prefix + """admin/news/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:42
case controllers_admin_VideoController_list22(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[Int]("s", Some(2)), params.fromQuery[String]("f", Some(""))) { (p, s, f) =>
        invokeHandler(controllers.admin.VideoController.list(p, s, f), HandlerDef(this, "controllers.admin.VideoController", "list", Seq(classOf[Int], classOf[Int], classOf[String]),"GET", """""", Routes.prefix + """admin/video"""))
   }
}
        

// @LINE:43
case controllers_admin_VideoController_list23(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[Int]("s", Some(2)), params.fromQuery[String]("f", Some(""))) { (p, s, f) =>
        invokeHandler(controllers.admin.VideoController.list(p, s, f), HandlerDef(this, "controllers.admin.VideoController", "list", Seq(classOf[Int], classOf[Int], classOf[String]),"GET", """""", Routes.prefix + """admin/video/list"""))
   }
}
        

// @LINE:44
case controllers_admin_VideoController_create24(params) => {
   call { 
        invokeHandler(controllers.admin.VideoController.create(), HandlerDef(this, "controllers.admin.VideoController", "create", Nil,"GET", """""", Routes.prefix + """admin/video/create"""))
   }
}
        

// @LINE:45
case controllers_admin_VideoController_createPost25(params) => {
   call { 
        invokeHandler(controllers.admin.VideoController.createPost(), HandlerDef(this, "controllers.admin.VideoController", "createPost", Nil,"POST", """""", Routes.prefix + """admin/video/createPost"""))
   }
}
        

// @LINE:46
case controllers_admin_VideoController_edit26(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.admin.VideoController.edit(id), HandlerDef(this, "controllers.admin.VideoController", "edit", Seq(classOf[Int]),"GET", """""", Routes.prefix + """admin/video/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:47
case controllers_admin_VideoController_editPost27(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.admin.VideoController.editPost(id), HandlerDef(this, "controllers.admin.VideoController", "editPost", Seq(classOf[Int]),"POST", """""", Routes.prefix + """admin/video/editPost/$id<[^/]+>"""))
   }
}
        

// @LINE:48
case controllers_admin_VideoController_delete28(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.admin.VideoController.delete(id), HandlerDef(this, "controllers.admin.VideoController", "delete", Seq(classOf[Int]),"POST", """""", Routes.prefix + """admin/$id<[^/]+>/delete"""))
   }
}
        
}
    
}
        