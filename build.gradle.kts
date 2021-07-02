buildscript {
    repositories {
        google()
        gradlePluginPortal()
    }
    dependencies {
        classpath(Deps.kotlinGradlePlugin)
    }
}
apply(plugin = "org.jetbrains.kotlin.jvm")
apply(plugin = "java-gradle-plugin")

repositories {
    mavenCentral()
    google()
}
