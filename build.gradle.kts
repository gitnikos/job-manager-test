plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")

    // Kotest framework (JUnit 5 platform)
    testImplementation("io.kotest:kotest-runner-junit5:5.5.1")

    // Kotest assertions core
    testImplementation("io.kotest:kotest-assertions-core:5.5.1")

    // MockK for mocking
    testImplementation("io.mockk:mockk:1.13.10")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}