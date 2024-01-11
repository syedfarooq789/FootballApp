plugins {
    alias(libs.plugins.footballapp.android.feature)
    alias(libs.plugins.footballapp.android.library.compose)
}

android {
    namespace = "com.farooq.fixtures"
}

dependencies {
    implementation(projects.core.ui)
    implementation(projects.core.model)
    implementation(projects.core.domain)
}