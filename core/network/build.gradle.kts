plugins {
    alias(libs.plugins.footballapp.android.library)
}

android {
    namespace = "com.farooq.network"
}

dependencies {
    implementation(projects.core.common)
}


