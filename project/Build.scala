import sbt._
import Keys._
import play.Project._
//import com.github.play2war.plugin._

object ApplicationBuild extends Build {

  val appName         = "gta5tv"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    cache,
    "org.squeryl" %% "squeryl" % "0.9.5-6" exclude("org.scala-stm", "scala-stm_2.10.0"),
    "mysql" % "mysql-connector-java" % "5.1.10",
    "org.mindrot" % "jbcrypt" % "0.3m" exclude("org.scala-stm", "scala-stm_2.10.0")
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here

  )
//    .settings(Play2WarPlugin.play2WarSettings: _*).settings(
//    Play2WarKeys.servletVersion := "2.5"
//  )

}
