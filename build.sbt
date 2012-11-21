name := "monkeyman"

version := "0.21"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "org.pegdown" % "pegdown" % "1.1.0",
  "org.fusesource.scalamd" % "scalamd" % "1.5",
  "joda-time" % "joda-time" % "2.0",
  "eu.medsea.mimeutil" % "mime-util" % "2.1.3" intransitive,
  "commons-io" % "commons-io" % "2.1",
  "org.joda" % "joda-convert" % "1.2",
  "org.fusesource.scalate" % "scalate-core" % "1.5.2-scala_2.8.1",
  "org.clapper" %% "argot" % "0.3.3",
  "com.ibm.icu" % "icu4j" % "4.8.1.1",
  "ch.qos.logback" % "logback-core" % "1.0.0",
  "ch.qos.logback" % "logback-classic" % "1.0.0",
  "com.asual.lesscss" % "lesscss-engine" % "1.1.5"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2",
  "snapshots" at "http://scala-tools.org/repo-snapshots",
  "releases"  at "http://scala-tools.org/repo-releases",
  "asusual" at "http://www.asual.com/maven/content/groups/public"
)




