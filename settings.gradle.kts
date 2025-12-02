rootProject.name = "Common-Utils-Library-Kotlin-Multiplatform"
include("lib")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        }
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        }
        maven {
            url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
        }
    }
}
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
