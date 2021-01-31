lazy val root = (project in file("."))
  .settings(
    name := "fs2-reactive-button",
    scalaVersion := "2.13.4",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "co.fs2" %%% "fs2-core" % "2.5.0",
      "org.scala-js" %%% "scalajs-dom" % "1.1.0"
    )
  )
  .enablePlugins(ScalaJSPlugin)
