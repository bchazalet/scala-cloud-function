libraryDependencies ++= Seq(
  "com.google.cloud.functions" % "functions-framework-api" % "1.0.4",
)

scalaVersion := "2.13.6"

assembly / assemblyOutputPath := file("output") / "cloud-function-scala-sample.jar"
