plugins {
    `kotlin-dsl`
}

dependencies {
    val kotlinVer = "1.8.0"
    implementation(platform(kotlin("bom", kotlinVer)))
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVer")
    implementation("org.jetbrains.kotlin:kotlin-serialization:$kotlinVer")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of("11"))
    }
}

repositories {
    mavenCentral()
}
