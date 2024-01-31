
plugins {
    id("org.springframework.boot") version "3.1.6"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.20"
    kotlin("plugin.spring") version "1.9.20"
}

var springBootVersion = "3.1.6"

repositories {
    mavenCentral()
}
//
//project(":cow-auth:cow-auth-app") {
//    dependencies {
//        implementation("org.springframework.boot:spring-boot-starter:$springBootVersion")
//        implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
//        api(project(":cow-auth:cow-auth-infrastructure"))
//        api(project(":cow-auth:cow-auth-domain"))
//    }
//}
//
//
//project(":cow-auth:cow-auth-domain") {
//    dependencies {
//        implementation("org.springframework.boot:spring-boot-starter:$springBootVersion")
//    }
//}
//
//project(":cow-auth-infrastructure") {
//    dependencies {
//        api(project(":cow-auth:cow-auth-domain"))
//    }
//}
//
//project(":cow-auth:cow-auth-adapters") {
//    dependencies {
//        api(project(":cow-auth:cow-auth-domain"))
//    }
//}
//
//allprojects {
//    dependencies {
//        implementation("org.jetbrains.kotlin:kotlin-reflect")
//    }
//}

