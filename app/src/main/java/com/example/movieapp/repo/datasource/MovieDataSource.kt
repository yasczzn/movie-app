package com.example.movieapp.repo.datasource

import com.example.movieapp.model.response.ApiResponse
import com.example.movieapp.model.request.MovieRequest
import com.example.movieapp.model.response.MovieResponse

interface MovieDataSource {
    suspend fun movies(movie : MovieRequest): ApiResponse<MovieResponse>
}