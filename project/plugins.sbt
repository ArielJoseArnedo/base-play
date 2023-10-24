addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.20")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.11.0")
resolvers += Resolver.jcenterRepo
addSbtPlugin("net.aichler" % "sbt-jupiter-interface" % "0.11.0")
ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always