name := "sample"
version := "0.1"
scalaVersion := "2.12.1"

logBuffered in Test := false

libraryDependencies ++= Seq (
  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
