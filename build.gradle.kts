plugins {
    
    // TODO : Use BoM
    val kotlinVersion = "2.1.20-rigel-276"
    kotlin("multiplatform") version kotlinVersion apply false
    kotlin("plugin.serialization") version kotlinVersion apply false
    alias(libs.plugins.androidLibrary) apply false
}
