plugins {
    id("org.projectcontinuum.feature") version "0.0.7"
}

group = "org.projectcontinuum.feature.analytics"
description = "Continuum Feature Analytics - A feature for collecting and analyzing feature usage data in the Continuum platform."
version = property("featureVersion").toString()

// get continuum platform version from root project properties
val continuumPlatformVersion = property("continuumPlatformVersion").toString()

continuum {
    continuumVersion.set(continuumPlatformVersion)
}

dependencies {
    // Kotlin scripting dependencies
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:2.1.0")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jsr223:2.1.0")

    // FreeMarker template engine
    implementation("org.freemarker:freemarker:2.3.32")
}