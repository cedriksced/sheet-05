plugins {
    java
    idea
    eclipse
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_15
    targetCompatibility = JavaVersion.VERSION_15
}

idea.module {
    isDownloadJavadoc = true
    isDownloadSources = true
}

eclipse.classpath {
    isDownloadJavadoc = true
    isDownloadSources = true
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}