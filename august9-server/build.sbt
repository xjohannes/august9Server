val ScalatraVersion = "2.6.2"

organization := "com.august9"

name := "August9 Server"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.4"

lazy val versions = new {
  val json4sJackson = "3.5.3"
  val doobie = "0.5.0-M8"
  val circeVersion = "0.7.0"
}


resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.5" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.json4s" %% "json4s-jackson" % versions.json4sJackson,
  "org.tpolecat" %% "doobie-core" % versions.doobie,
  "org.tpolecat" %% "doobie-postgres" % versions.doobie,
  "io.circe" %% "circe-core" % versions.circeVersion,
  "io.circe" %% "circe-generic" % versions.circeVersion,
  "io.circe" %% "circe-parser" % versions.circeVersion
)


enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)
