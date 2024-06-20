import sbt.*

object CompilerPlugins {

  /** https://github.com/typelevel/kind-projector (type lambda syntax: Tuple2[*, Double]) */
  private val kindProjector = compilerPlugin("org.typelevel" %% "kind-projector" % "0.13.3" cross CrossVersion.full)
  /** https://github.com/oleg-py/better-monadic-for (syntax: implicit0(...) inside for) */
  private val betterMonadicFor = compilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")

  val all: Seq[ModuleID] = Seq(
    kindProjector,
    betterMonadicFor,
  )

  // look for the library corresponding
  val silencer = compilerPlugin("com.github.ghik" % "silencer-plugin" % "1.6.0" cross CrossVersion.full)

}
