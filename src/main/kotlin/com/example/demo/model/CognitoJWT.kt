package com.example.demo.model

/**
 * Data model for aws token response
 */
data class CognitoJWT(
    val id_token: String = "",
    val access_token: String = "",
    val refresh_token: String = "",
    val expires_in: Int = 0,
    val token_type: String = ""
)
