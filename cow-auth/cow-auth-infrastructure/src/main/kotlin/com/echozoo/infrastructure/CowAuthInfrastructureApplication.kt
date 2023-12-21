package com.echozoo.infrastructure

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CowAuthInfrastructureApplication

fun main(args: Array<String>) {
    runApplication<CowAuthInfrastructureApplication>(*args)
}
