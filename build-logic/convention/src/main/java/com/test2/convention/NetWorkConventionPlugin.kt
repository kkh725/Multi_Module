package com.test2.convention

import com.android.build.gradle.api.AndroidBasePlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies

class NetWorkConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "com.google.devtools.ksp")

            dependencies {
                "ksp"(libs.findLibrary("hilt.compiler").get())
                "implementation"(libs.findLibrary("retrofit").get())
                "implementation"(libs.findLibrary("retrofit-kotlin-serialization").get())

                "implementation"(libs.findLibrary("okhttp").get())
                "implementation"(libs.findLibrary("okhttp-logging-interceptor").get())
                "implementation"(platform(libs.findLibrary("okhttp-bom").get()))
            }
        }
    }
}