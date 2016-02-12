name := """sgmplay"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "org.postgresql" % "postgresql" % "9.4-1203-jdbc42"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)