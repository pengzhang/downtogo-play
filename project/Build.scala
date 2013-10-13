import sbt._
import Keys._
import play.Project._
import com.github.play2war.plugin._

object ApplicationBuild extends Build {

  val appName         = "downtogo"
  val appVersion      = "1.0"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "mysql" % "mysql-connector-java" % "5.1.18",
    "org.apache.commons" % "commons-email" % "1.3.1"
  )

  val main = play.Project(appName, appVersion, appDependencies)
  .settings(Play2WarPlugin.play2WarSettings: _*)
  .settings(Play2WarKeys.servletVersion := "2.5")  

}
