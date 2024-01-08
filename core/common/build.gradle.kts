plugins {
    alias(libs.plugins.footballapp.android.library)
}

android {
    namespace = "com.farooq.common"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.compose.material3)
}