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

dependencies{
    implementation("com.android.tools.build:gradle:8.9.0") // ✅ 버전 맞게 수정
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "com.test2.moduletest.application"
            implementationClass = "com.test2.convention.AndroidApplicationConventionPlugin"
        }

        register("hilt") {
            id = libs.plugins.nowinandroid.hilt.get().pluginId
            implementationClass = "com.test2.convention.HiltConventionPlugin"
        }
    }
}