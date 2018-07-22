package com.example.demo.controller

import com.example.demo.model.TokenClaims
import com.example.demo.service.AuthService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * User endpoints, require authentication
 */
@RestController
@RequestMapping("/user")
class UserController(val authService: AuthService) {
    @GetMapping("/me")
    fun getCurrentUser(): TokenClaims {
        return authService.getClaims()
    }
}
