package com.example.springoauth2.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Suppress("unused")
class ResourceController {

    @GetMapping("/public")
    fun publicResource(): String = "public Resource"

    @GetMapping("/protected")
    fun protectedResource(): String = "protected Resource"

}
