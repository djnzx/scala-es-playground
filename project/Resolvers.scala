import sbt.Resolver

object Resolvers {

  val all = Seq(
    Resolver.mavenLocal,
    Resolver.mavenCentral,
  )

}
