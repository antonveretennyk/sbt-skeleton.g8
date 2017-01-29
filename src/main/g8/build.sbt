
resolvers in ThisBuild ++= Seq("Apache Development Snapshot Repository" at "https://repository.apache.org/content/repositories/snapshots/",
    Resolver.mavenLocal)

name := "$name$"

version := "$version$"

organization := "$organization$"

scalaVersion in ThisBuild := "$scala_version$"


libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.7" % "test"
)

// Read here for optional dependencies:
// https://etorreborre.github.io/specs2/guide/SPECS2-3.8.7/org.specs2.guide.Installation.html#other-dependencies

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)
