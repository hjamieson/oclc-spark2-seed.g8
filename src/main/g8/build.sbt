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
    )

  )

// this is a dummy project that adds provided libs to the run classpath so
// you can run your main class from the sbt command line.  You can use the
// following like this:
// sbt "mainRunner/runMain org.oclc.spark.project1.LocalSparkDemo"

lazy val mainRunner = project.in(file("mainRunner")).dependsOn(RootProject(file("."))).settings(
  libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "2.2.0",
    "org.apache.spark" %% "spark-sql" % "2.2.0"
  )
)