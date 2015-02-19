import play.PlayJava

name := """sgmplay"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.34",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "com.wordnik" %% "swagger-play2" % "1.3.12"
  //"com.typesafe.slick" %% "slick" % "2.1.0",
  //"com.typesafe.play" %% "play-slick" % "0.8.1"
)