// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id(Plugins.dependencyUpdates) version Versions.dependencyUpdates
}

buildscript {

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(Plugins.gradleTools)
        classpath(Plugins.gradleKotlin)
    }
}

allprojects {

    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
