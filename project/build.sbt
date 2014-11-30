addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.0-M1")

resolvers += Resolver.sonatypeRepo("releases")

resolvers += Resolver.sonatypeRepo("snapshots")

resolvers += "spray repo" at "http://repo.spray.io"

addSbtPlugin("io.spray" % "sbt-twirl" % "0.7.0")

addSbtPlugin("com.lihaoyi" % "utest-js-plugin" % "0.2.5-M1")

resolvers += Resolver.url("scala-js-releases",
  url("http://dl.bintray.com/scala-js/scala-js-releases/"))(
    Resolver.ivyStylePatterns)
