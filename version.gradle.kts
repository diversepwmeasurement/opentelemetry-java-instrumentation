val stableVersion = "2.4.1"
val alphaVersion = "2.4.1-alpha"

allprojects {
  if (findProperty("otel.stable") != "true") {
    version = alphaVersion
  } else {
    version = stableVersion
  }
}
