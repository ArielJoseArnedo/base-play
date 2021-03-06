name := """base-play"""
organization := "co.com.ajac"

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .enablePlugins(BuildInfoPlugin)
  .settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "co.com.ajac",
    buildInfoOptions += BuildInfoOption.ToJson
  )

scalaVersion := "2.13.8"

resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies ++= Seq(
  guice,
  "com.github.ArielJoseArnedo"    % "api-play-command"        % "2.1.1",
  "org.projectlombok"             % "lombok"                  % "1.18.12"                         % Provided,
  "net.aichler"                   % "jupiter-interface"       % JupiterKeys.jupiterVersion.value  % Test,
  "org.mockito"                   % "mockito-junit-jupiter"   % "2.28.2"                          % Test,
  "org.junit.platform"            % "junit-platform-runner"   % "1.6.2"                           % Test,
  "org.assertj"                   % "assertj-core"            % "3.16.1"                          % Test
)

PlayKeys.devSettings := Seq("play.server.http.port" -> "9300")

testOptions += Tests.Argument(jupiterTestFramework, "-v")
