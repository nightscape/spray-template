// Additional repositories to search for plugins in.
// You can remove the sbt-idea-repo if you don't need to use the gen-idea command to generate your IDEA project files.
resolvers ++= Seq(
  "Akka Repository" at "http://akka.io/repository",
  "sbt-idea-repo" at "http://mpeltonen.github.com/maven/",
  "Web plugin repo" at "http://siasia.github.com/maven2"
)

// This may be a bug in SBT? Mark Harrah recommended this and it fixed issues with
// things that depend on SBT itself.
resolvers <+= sbtResolver.identity

// Remove the sbt-idea dependency if you don't need to use the 'gen-idea' command to generate your IDEA project files.
libraryDependencies ++= Seq(
  "se.scalablesolutions.akka" % "akka-sbt-plugin" % "1.2-RC6"
)

// Fetches the correct version of the xsbt-web-plugin for the current version of SBT. This is what gives you
// SBT commands such as 'jetty-run' and 'jetty-stop'.
addSbtPlugin("com.github.siasia" %% "xsbt-web-plugin" % "0.1.2")
