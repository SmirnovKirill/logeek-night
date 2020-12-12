import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}

allprojects {
    apply(plugin = "kotlin")
    apply(plugin = "groovy")

    group = "logeek-night"

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("org.slf4j:slf4j-api:1.7.30")
        implementation("org.apache.logging.log4j:log4j-core:2.14.0")
        implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.14.0")
        implementation("com.google.guava:guava:30.0-jre")
        implementation("joda-time:joda-time:2.10.8")
        implementation("org.apache.commons:commons-lang3:3.11")
        implementation("org.projectlombok:lombok:1.18.16")
        implementation("com.fasterxml.jackson.core:jackson-databind:2.12.0")

        testImplementation("junit:junit:4.4.12")
        testImplementation("org.spockframework:spock-core:1.3-groovy-2.5")
        testImplementation("org.spockframework:spock-unitils:1.3-groovy-2.5")
    }

    tasks.withType<KotlinCompile>() {
        kotlinOptions.jvmTarget = "1.8"
    }
}