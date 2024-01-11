plugins {
    alias(libs.plugins.footballapp.android.library)
    alias(libs.plugins.footballapp.android.hilt)
}

android {
    namespace = "com.farooq.network"
}

dependencies {
    api(projects.core.common)
    api(projects.core.model)

    implementation(libs.coil.kt)
    implementation(libs.coil.kt.svg)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.retrofit.gson)
}


