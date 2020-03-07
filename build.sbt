/**
 * Main SBT Build Script
 */

lazy val root = project.in(file("."))
  .settings(
    name := "scala-moniker",
    version := "1.0.0",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      "com.beachape" %% "enumeratum" % "1.5.15",
    ),
    mainClass in Compile := Some("com.github.halfmatthalfcat.moniker.Moniker"),
    mainClass in (Compile, run) := Some("com.github.halfmatthalfcat.moniker.Moniker"),
  )