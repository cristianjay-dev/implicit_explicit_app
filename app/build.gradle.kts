plugins {
    alias(libs.plugins.android.application)
    // Add Google services Gradle plugin
    id("com.google.gms.google-services")
}

android {
    namespace = "com.shop.explicitandimplicit"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.shop.explicitandimplicit"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    // Import the BOM for the Firebase platform
    implementation(platform("com.google.firebase:firebase-bom:33.13.0"))
    // Add the dependency for the Firebase Realtime Database
    implementation("com.google.firebase:firebase-database")


    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}