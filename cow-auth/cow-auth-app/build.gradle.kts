
plugins {
	kotlin("jvm") version "1.9.20"
}

group = "com.echozoo"
version = "0.0.1-SNAPSHOT"


dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	api(project(":cow-auth:cow-auth-infrastructure"))
	api(project(":cow-auth:cow-auth-infrastructure"))
}
