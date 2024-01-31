package com.echozoo.adapter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.echozoo"])
class CowAuthAdapterApplication

fun main(args: Array<String>) {
	runApplication<CowAuthAdapterApplication>(*args)
	println("""
		http://localhost:8080/swagger-ui/index.html
	""".trimIndent())
}
