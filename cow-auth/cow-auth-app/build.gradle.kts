plugins {
    id("org.springframework.boot") version "3.1.6"
    kotlin("jvm") version "1.9.20"
    id ("org.jetbrains.kotlin.plugin.lombok") version "1.8.0"
    id ("io.freefair.lombok") version "5.3.0"
}

group = "com.echozoo"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:3.1.6")
    implementation("org.springframework.boot:spring-boot-starter-web:3.1.6")
    api(project(":cow-auth:cow-auth-infrastructure"))
    api(project(":cow-auth:cow-auth-domain"))
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.16.0")
}

tasks.register("prepareKotlinBuildScriptModel") {}
