package com.example.springbootlogging

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootLoggingApplication

fun main(args: Array<String>) {
    runApplication<SpringBootLoggingApplication>(*args)
}
