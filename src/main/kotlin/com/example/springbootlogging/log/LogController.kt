package com.example.springbootlogging.log

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger {}

@RestController
class LogController {

    @GetMapping("/log")
    fun log() {
        logger.trace { "로그 - trace" }
        logger.debug { "로그 - debug" }
        logger.info { "로그 - info" }
        logger.warn { "로그 - warn" }
        logger.error { "로그 - error" }
    }
}
