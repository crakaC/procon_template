plugins {
    kotlin("jvm") version "1.7.10"
}

repositories {
    mavenCentral()
}

sourceSets.main {
    java.srcDir("src")
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