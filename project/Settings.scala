import sbt.Def.*
import sbt.Keys.*

object Settings {

  val common2: Seq[Setting[?]] = Seq(
    version := "0.0.1",
    resolvers ++= Resolvers.all,
    scalaVersion := Versions.vScala213,
    scalacOptions ++= CompilerOptions.scalacOptions,
    scalacOptions -= ScalacOpts.warningsAsFatals,
    libraryDependencies ++= CompilerPlugins.all,
    libraryDependencies ++= Libraries.testingToolkit2
  )

}
