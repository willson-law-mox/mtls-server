package com.example.mtlstest

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MtlsController {
    private val log = LoggerFactory.getLogger(this.javaClass)

    @PostMapping("/simulation")
    fun simulationEndpoint(): ResponseEntity<String> {
        log.info("Received simulation request")
        return ResponseEntity.ok("Completed mtls process")
    }
}