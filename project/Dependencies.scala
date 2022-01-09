import sbt._

object Dependencies {

  object Version {
    val scalaTest = "3.2.10"
  }

  lazy val scalaTest = "org.scalatest" %% "scalatest" % Version.scalaTest

}
