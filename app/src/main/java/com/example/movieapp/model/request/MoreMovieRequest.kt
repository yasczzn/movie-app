package com.example.movieapp.model.request

import retrofit2.http.Header

data class MoreMovieRequest(
    @Header("Authorization")
    val token: String,
    val language: String,
    val page: Int
)
