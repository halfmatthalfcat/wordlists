/**
 * Main SBT Build Script
 */

import ReleaseTransformations._

lazy val root = project.in(file("."))
  .settings(
    name := "scala-moniker",
    organization := "com.github.halfmatthalfcat",
    scalaVersion := "2.13.1",
    crossScalaVersions := Seq("2.13.1", "2.12.10"),
    crossVersion := CrossVersion.binary,
    releaseCrossBuild := true,
    libraryDependencies ++= Seq(
      "com.beachape" %% "enumeratum" % "1.5.15",
    ),
    releaseProcess := Seq[ReleaseStep](
      checkSnapshotDependencies,
      inquireVersions,
      runClean,
      runTest,
      setReleaseVersion,
      commitReleaseVersion,
      tagRelease,
      releaseStepCommandAndRemaining("+publishSigned"),
      releaseStepCommand("sonatypeBundleRelease"),
      setNextVersion,
      commitNextVersion,
      pushChanges
    ),
    pomExtra :=
      <url>https://www.github.com/halfmatthalfcat/scala-moniker</url>
        <licenses>
          <license>
            <name>MIT</name>
            <distribution>repo</distribution>
          </license>
        </licenses>
        <scm>
          <url>git@github.com:halfmatthalfcat/scala-moniker.git</url>
          <connection>scm:git:git@github.com:halfmatthalfcat/scala-moniker.git</connection>
        </scm>
        <developers>
          <developer>
            <id>halfmatthalfcat</id>
            <name>Matt Oliver</name>
            <url>https://www.github.com/halfmatthalfcat</url>
          </developer>
        </developers>,
    publishMavenStyle := true,
    publishTo := sonatypePublishToBundle.value,
    resolvers ++= Seq(DefaultMavenRepository),
  )