name := "sbt-lighter"

version := "1.0.0"

scalaVersion := "2.12.6"

sbtPlugin := true

val awsVersion = "1.11.320"
val circeVersion = "0.8.0"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-emr" % awsVersion,
  "com.amazonaws" % "aws-java-sdk-s3" % awsVersion,
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion
)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")

publishMavenStyle := false
organization := "net.pishen"

enablePlugins(AutomateHeaderPlugin)
organizationName := "Pishen Tsai"
startYear := Some(2017)
licenses += (
  "Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.html")
)
