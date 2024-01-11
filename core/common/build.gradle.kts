plugins {
    alias(libs.plugins.footballapp.android.library)
    alias(libs.plugins.footballapp.android.hilt)
}

android {
    namespace = "com.farooq.common"
}

dependencies {

    implementation(libs.androidx.core.ktx)
}