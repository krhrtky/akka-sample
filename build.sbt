name := "akkasample"

version := "0.1"

scalaVersion := "2.13.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-Xlint")

assemblyOutputPath in assembly := file("./akka-http-standalone.jar")

libraryDependencies ++= {
  val akkaV = "2.5.25"

  Seq(
    "com.typesafe.akka" %% "akka-http"   % "10.1.9",
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-stream" % akkaV,
    "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.9",
  )
}

Revolver.settings
