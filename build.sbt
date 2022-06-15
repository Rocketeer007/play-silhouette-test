name := """pplay-silhouette-test"""
organization := "com.prient"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test

val silhouetteVersion = "8.0.2"
libraryDependencies += "io.github.honeycomb-cheesecake" %% "play-silhouette" % silhouetteVersion
libraryDependencies += "io.github.honeycomb-cheesecake" %% "play-silhouette-cas" % silhouetteVersion
libraryDependencies += "io.github.honeycomb-cheesecake" %% "play-silhouette-crypto-jca" % silhouetteVersion
libraryDependencies += "io.github.honeycomb-cheesecake" %% "play-silhouette-password-argon2" % silhouetteVersion
libraryDependencies += "io.github.honeycomb-cheesecake" %% "play-silhouette-password-bcrypt" % silhouetteVersion
libraryDependencies += "io.github.honeycomb-cheesecake" %% "play-silhouette-persistence" % silhouetteVersion
libraryDependencies += "io.github.honeycomb-cheesecake" %% "play-silhouette-totp" % silhouetteVersion
libraryDependencies += "io.github.honeycomb-cheesecake" %% "play-silhouette-testkit" % silhouetteVersion % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.prient.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.prient.binders._"
