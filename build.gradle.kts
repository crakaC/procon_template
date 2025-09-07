plugins {
    kotlin("jvm") version "1.8.20"
}

repositories {
    mavenCentral()
}

sourceSets.main {
    kotlin.srcDir("src")
}

kotlin {
    jvmToolchain(17)
}

tasks.register("prepare") {
    doLast {
        sourceSets.main {
            println("prepare runtime classpath.")
            println(runtimeClasspath.asPath)
            File(".runtimeClassPath").writeText(runtimeClasspath.asPath)
        }
    }
}