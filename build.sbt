ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "Stampede"
  )
libraryDependencies += "org.scalafx" % "scalafx_3" % "20.0.0-R31"
libraryDependencies  ++= Seq(
  // Last stable release
  "org.scalanlp" %% "breeze" % "2.1.0",

  // The visualization library is distributed separately as well.
  // It depends on LGPL code
  "org.scalanlp" %% "breeze-viz" % "2.1.0"
)
libraryDependencies += "com.lihaoyi" %% "upickle" % "3.3.0"
libraryDependencies += "com.lihaoyi" %% "os-lib" % "0.9.3"
libraryDependencies += "org.controlsfx" % "controlsfx" % "11.2.1"




