plugins {
    alias(libs.plugins.footballapp.android.library)
}

android {
    namespace = "com.farooq.football.model"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.androidx.test.espresso.core)
    api(libs.retrofit.gson)
}