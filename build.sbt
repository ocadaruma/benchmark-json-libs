lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.11.8"
)

lazy val root = (project in file("."))
  .settings(
    name := "benchmark-json-libs"
  )
  .settings(commonSettings: _*)
  .settings(libraryDependencies ++= Seq(
    // circe
    "io.circe" %% "circe-core" % "0.4.1",
    "io.circe" %% "circe-generic" % "0.4.1",
    "io.circe" %% "circe-parser" % "0.4.1",

    // argonaut-shapeless
    "com.github.alexarchambault" %% "argonaut-shapeless_6.1" % "1.0.0-RC1",

    // spray-json-shapeless
    "com.github.fommil" %% "spray-json-shapeless" % "1.2.0",

    // json4s
    "org.json4s" %% "json4s-native" % "3.3.0",
    "org.json4s" %% "json4s-jackson" % "3.3.0",
    "org.json4s" %% "json4s-ext" % "3.3.0"
  ))
  .enablePlugins(JmhPlugin)
