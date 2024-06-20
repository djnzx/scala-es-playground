import scala.collection.Seq

Global / onChangedBuildSource := ReloadOnSourceChanges

name := "scala-es-playground"
version := "0.0.1"

lazy val es68 = (project in file("es68"))
  .settings(
    Settings.common2,
    crossScalaVersions := Seq(Versions.vScala212, Versions.vScala213),
    description := "Elastic Search 6.8 Learning",
    libraryDependencies ++= Seq(
      "com.sksamuel.elastic4s" %% "elastic4s-core"       % "6.7.8",
      "com.sksamuel.elastic4s" %% "elastic4s-http"       % "6.7.8",
      "com.beachape"           %% "enumeratum"           % "1.7.2",
      "com.beachape"           %% "enumeratum-circe"     % "1.7.2",
      "io.circe"               %% "circe-parser"         % "0.14.6",
      "io.circe"               %% "circe-generic-extras" % "0.14.3",
      "org.typelevel"          %% "cats-core"            % "2.10.0",
      "com.github.pureconfig"  %% "pureconfig"           % "0.17.4",
    ),
  )

lazy val es68s_akka = (project in file("es68s_akka"))
  .settings(Settings.common2)
  .dependsOn(es68)
  .settings(
    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.21"
  )

lazy val es68s_ce = (project in file("es68s_ce"))
  .settings(Settings.common2)
  .dependsOn(es68)
  .settings(
    libraryDependencies += "co.fs2" %% "fs2-core" % "3.10.2"
  )

lazy val es68s_zio = (project in file("es68s_zio"))
  .settings(Settings.common2)
  .dependsOn(es68)
  .settings(
    libraryDependencies += "dev.zio" %% "zio-streams" % "2.1.3"
  )

lazy val es89 = (project in file("es89"))
  .settings(
    Settings.common2,
    description := "Elastic Search 8 Learning",
    libraryDependencies ++= Seq(
      "com.sksamuel.elastic4s" %% "elastic4s-client-esjava" % "8.11.3",
      "com.sksamuel.elastic4s" %% "elastic4s-testkit"       % "8.11.3",
      "org.typelevel"          %% "cats-core"               % "2.12.0",
    ),
  )
