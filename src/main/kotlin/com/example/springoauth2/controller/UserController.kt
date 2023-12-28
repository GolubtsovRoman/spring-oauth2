package com.example.springoauth2.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal


@RestController
@Suppress("unused")
class UserController {

    @GetMapping("/username")
    fun currentUserName(principal: Principal): String = principal.name

}
