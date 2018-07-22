package com.example.demo.model

import java.util.Date

/**
 * Data model for token claims
 */
data class TokenClaims(
    val uuid: String,
    val auth_time: Long,
    val issued: Date,
    val expire: Date,
    val name: String,
    val cognitoUserName: String,
    val email: String
)
