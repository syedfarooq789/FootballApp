plugins {
    alias(libs.plugins.footballapp.android.library)
    alias(libs.plugins.footballapp.android.library.compose)
}

android {
    namespace = "com.farooq.ui"
}

dependencies {
    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.ui.util)
    api(libs.androidx.compose.material3)
}