package com.example.movieapp.model.response

import retrofit2.http.Header

data class MovieRequest(
    @Header("Authorization")
    val token: String,
    val language: String
)
