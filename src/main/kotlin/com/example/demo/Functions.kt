package com.example.demo

import java.util.Base64

fun String.toBase64(): String = Base64.getEncoder().encodeToString(this.toByteArray())
