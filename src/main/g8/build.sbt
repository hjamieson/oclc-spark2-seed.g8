// A simple default sbt project layout

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "2.11.12"
    )),
    name := "$name$"
  )
