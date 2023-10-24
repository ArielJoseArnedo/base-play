name := """base-play"""
organization := "co.com.ajac"

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .enablePlugins(BuildInfoPlugin)
  .settings(
    javacOptions ++= Seq("-source", "17", "-target", "17"),
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "co.com.ajac",
    buildInfoOptions += BuildInfoOption.ToJson
  )

ThisBuild / evictionErrorLevel := Level.Info

scalaVersion := "2.13.6"

resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies ++= Seq(
  "com.google.inject"             % "guice"                   % "5.1.0",
  "com.github.ArielJoseArnedo"    % "api-play-command"        % "3.2.0",
  "com.fasterxml.jackson.module"  %% "jackson-module-scala"   % "2.15.3",
  "org.projectlombok"             % "lombok"                  % "1.18.26"                         % Provided,
  "net.aichler"                   % "jupiter-interface"       % JupiterKeys.jupiterVersion.value  % Test,
  "org.mockito"                   % "mockito-junit-jupiter"   % "2.28.2"                          % Test,
  "org.junit.platform"            % "junit-platform-runner"   % "1.6.2"                           % Test,
  "org.assertj"                   % "assertj-core"            % "3.16.1"                          % Test
)

PlayKeys.devSettings := Seq("play.server.http.port" -> "9300")

testOptions += Tests.Argument(jupiterTestFramework, "-v")
