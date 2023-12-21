plugins {
    kotlin("jvm") version "1.9.20"
}

group = "com.echozoo"
version = "0.0.1-SNAPSHOT"

dependencies {
    api(project(":cow-auth:cow-auth-domain"))
}
