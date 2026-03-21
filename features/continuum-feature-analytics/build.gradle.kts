plugins {
    id("org.projectcontinuum.feature") version "0.0.7"
}

group = "org.projectcontinuum.feature.analytics"
description = "Continuum Feature Analytics - A feature for collecting and analyzing feature usage data in the Continuum platform."
version = property("featureVersion").toString()

// get continuum platform version from root project properties
val continuumPlatformVersion = property("continuumPlatformVersion").toString()
val kotlinScriptingVersion = "2.1.0"

continuum {
    continuumVersion.set(continuumPlatformVersion)
}

//configurations.configureEach {
//    resolutionStrategy.force(
//        "org.jetbrains.kotlin:kotlin-stdlib:$kotlinScriptingVersion",
//        "org.jetbrains.kotlin:kotlin-stdlib-common:$kotlinScriptingVersion",
//        "org.jetbrains.kotlin:kotlin-reflect:$kotlinScriptingVersion",
//        "org.jetbrains.kotlin:kotlin-script-runtime:$kotlinScriptingVersion",
//        "org.jetbrains.kotlin:kotlin-scripting-common:$kotlinScriptingVersion",
//        "org.jetbrains.kotlin:kotlin-scripting-jvm:$kotlinScriptingVersion",
//        "org.jetbrains.kotlin:kotlin-scripting-jvm-host:$kotlinScriptingVersion",
//        "org.jetbrains.kotlin:kotlin-scripting-jsr223:$kotlinScriptingVersion",
//        "org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:$kotlinScriptingVersion",
//        "org.jetbrains.kotlin:kotlin-scripting-compiler-impl-embeddable:$kotlinScriptingVersion",
//        "org.jetbrains.kotlin:kotlin-compiler-embeddable:$kotlinScriptingVersion"
//    )
//}

dependencies {
    // Keep the entire Kotlin runtime/scripting toolchain on one version.
    // continuum-commons currently pulls Kotlin 1.9.25 transitively, and mixing
    // that with Kotlin scripting 2.1.0 causes REPL/compiler NoSuchMethodError at runtime.
//    implementation(enforcedPlatform("org.jetbrains.kotlin:kotlin-bom:$kotlinScriptingVersion"))

    // Kotlin scripting dependencies
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinScriptingVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinScriptingVersion")
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:$kotlinScriptingVersion")
    implementation("org.jetbrains.kotlin:kotlin-scripting-common:$kotlinScriptingVersion")
//    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm:$kotlinScriptingVersion")
//    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm-host:$kotlinScriptingVersion")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jsr223:$kotlinScriptingVersion")
    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:$kotlinScriptingVersion")
//    implementation("org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:$kotlinScriptingVersion")
//    implementation("org.jetbrains.kotlin:kotlin-scripting-compiler-impl-embeddable:$kotlinScriptingVersion")

    // FreeMarker template engine
    implementation("org.freemarker:freemarker:2.3.32")
}