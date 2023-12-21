plugins {
	id("org.springframework.boot") version "3.2.0"
	kotlin("jvm") version "1.9.20"
}


group = "com.echozoo"
version = "0.0.1-SNAPSHOT"

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
}
