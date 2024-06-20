import sbt.*

object Libraries {

  val testingToolkit2: Seq[ModuleID] = Seq(
    "org.scalacheck"             %% "scalacheck"                % "1.18.0",
    "org.scalatest"              %% "scalatest"                 % "3.2.18",
    "org.scalatestplus"          %% "scalacheck-1-18"           % "3.2.18.0",
    "com.github.alexarchambault" %% "scalacheck-shapeless_1.16" % "1.3.1",
    "com.lihaoyi"                %% "pprint"                    % "0.9.0"
  )

}
