plugins {
    alias(libs.plugins.footballapp.android.library)
    alias(libs.plugins.footballapp.android.hilt)
}

android {
    namespace = "com.farooq.data"
}

dependencies {
    implementation(libs.androidx.core.ktx)

    api(projects.core.model)
    api(projects.core.common)
    api(projects.core.network)
}