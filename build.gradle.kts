plugins {
    id("com.android.library") version "9.2.1"
    id("org.jetbrains.kotlin.android") version "2.4.10" apply false
}
group = "com.mapconductor"
version = "0.1.0"
android {
    namespace = "com.mapconductor.icons.us"
    compileSdk = 35
    defaultConfig { minSdk = 26 }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
dependencies {
    api("com.mapconductor:icons:1.2.0")
    testImplementation("junit:junit:4.13.2")
}
