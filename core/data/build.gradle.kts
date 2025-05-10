plugins {
    alias(libs.plugins.multi.module.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.multi.module.hilt)
    alias(libs.plugins.multi.module.network)
}

android {
    namespace = "com.test2.data"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
//    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}