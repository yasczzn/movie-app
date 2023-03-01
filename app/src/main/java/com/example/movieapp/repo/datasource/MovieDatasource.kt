package com.example.movieapp.repo.datasource

import com.example.movieapp.model.response.ApiResponse
import com.example.movieapp.model.response.MovieRequest
import com.example.movieapp.model.response.MovieResponse

interface MovieDatasource {
    suspend fun movies(movie : MovieRequest): ApiResponse<MovieResponse>
}