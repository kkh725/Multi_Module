plugins {
    id("java-library")
    `kotlin-dsl`             // Kotlin DSL 플러그인
    `java-gradle-plugin`     // Gradle Plugin 개발용 플러그인
    alias(libs.plugins.jetbrains.kotlin.jvm)
}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}
