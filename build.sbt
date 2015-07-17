name := """sgmplay"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.34",
  "org.mockito" % "mockito-core" % "1.9.5" % "test"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)