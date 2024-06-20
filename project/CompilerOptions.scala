import ScalacOpts.*

/** https://docs.scala-lang.org/overviews/compiler-options/index.html
  * https://docs.scala-lang.org/overviews/compiler-options/index.html#Warning_Settings
  * https://blog.ssanj.net/posts/2019-06-14-scalac-2.13-options-and-flags.html
  * http://eed3si9n.com/stricter-scala-with-xlint-xfatal-warnings-and-scalafix
  */
object CompilerOptions {

  val scalacOptions: Seq[String] = utf8 ++ Seq(
    feature,
    deprecation,
    unchecked,
    postfix,
    higherKindedTypes,
    macroAnnotations, // 2.13+, used by newtype
    warningsAsFatals, // ??? doesn't work as expected
    matchShouldBeExhaustive,
    lintDeprecation,
    "-Xcheckinit",
    "-language:existentials",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Ywarn-dead-code",
    "-Ywarn-unused",
    "-Yrepl-class-based",
    "-Yrangepos",
    "-explaintypes",
  )
}
