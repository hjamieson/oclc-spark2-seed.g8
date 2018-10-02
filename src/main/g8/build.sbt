// A simple default sbt project layout

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "2.11.12"
    )),
    name := "$name$",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "2.2.0" % Provided,
      "org.apache.spark" %% "spark-sql" % "2.2.0" % Provided
    ),
    // this plops provided libs on the run classpath!
    classpathConfiguration in Runtime := Configurations.CompileInternal

  )
