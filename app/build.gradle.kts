plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.thirdroc"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.thirdroc"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

  /*  viewBinding{
        enable = true
    }

    dataBinding{
        enable = true
    }*/
}

dependencies {
    //noinspection GradleCompatible
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.github.mukeshsolanki.android-otpview-pinview:otpview:3.1.0")
    implementation ("androidmads.library.qrgenearator:QRGenearator:1.0.3")
    implementation ("com.google.android.gms:play-services-vision:11.8.0")
    implementation ("com.github.yuriy-budiyev:code-scanner:2.3.2")
    implementation ("com.hbb20:ccp:2.6.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

}