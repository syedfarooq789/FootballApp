plugins {
    alias(libs.plugins.footballapp.android.library)
    alias(libs.plugins.footballapp.android.hilt)
}

android {
    namespace = "com.farooq.domain"
}


dependencies {
    api(projects.core.model)
    api(projects.core.network)
    api(projects.core.data)
    api(projects.core.common)
}