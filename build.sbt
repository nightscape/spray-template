// Project specific settings.
name := "spray-template"

organization := "spray.cc"

version := "0.7.0"

scalaVersion := "2.9.0-1"

// Some of the transitive dependencies have invalid md5 hashes in their Maven repos, so this
// bypasses that problem. This should probably be removed in the future once all those things
// are brought up to date. Recommended by Mark Harrah.
checksums := Nil

// Absolutely necessary dependencies.
libraryDependencies ++= Seq(
  "se.scalablesolutions.akka" % "akka" % "1.1.3",
  "cc.spray" %% "spray-http" % "0.7.0" % "compile" withSources(),
  "cc.spray" %% "spray-server" % "0.7.0" % "compile" withSources()
)

// Testing dependencies.
libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.5" % "test",
  "org.eclipse.jetty" % "jetty-server" % "8.0.0.M3" % "jetty",
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.0.M3" % "jetty"
)

// slf4j is not required but a good option for logging. logback is a good slf4j backend.
libraryDependencies ++= Seq(
  "se.scalablesolutions.akka" % "akka-slf4j" % "1.1.3",
  "ch.qos.logback" % "logback-classic" % "0.9.29" % "runtime"
)

// Inject the xsbt-web-plugin webSettings into these project settings to enable
// commands such as jetty-run.
seq(webSettings :_*)

// When depending on a spray snapshot build we need the ScalaToolsSnapshots resolver
// GuiceyFruit is required because their things were removed from public Maven repos
// and some of their jars are transitive dependencies.
resolvers ++= Seq(
  ScalaToolsSnapshots,
  "GuiceyFruit Release Repository" at "http://guiceyfruit.googlecode.com/svn/repo/releases/"
)

resolvers += "Akka Repository" at "http://akka.io/repository"