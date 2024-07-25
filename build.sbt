ThisBuild / scalaVersion := "3.3.3"

lazy val root = (project in file("."))
  .settings(
    name := "scala-hkt-java",
    compileOrder := CompileOrder.ScalaThenJava
  )
