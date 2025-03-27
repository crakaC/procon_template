plugins {
    kotlin("jvm") version "2.1.20"
}

repositories {
    mavenCentral()
}

sourceSets.main {
    kotlin.srcDir("src")
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