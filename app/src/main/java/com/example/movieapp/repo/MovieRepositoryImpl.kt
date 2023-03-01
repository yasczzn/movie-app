package com.example.movieapp.repo

import com.example.movieapp.api.MovieService
import com.example.movieapp.model.response.ApiResponse
import com.example.movieapp.model.response.MovieRequest
import com.example.movieapp.model.response.MovieResponse
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieService: MovieService): MovieRepository{

    suspend fun movie(movies: MovieRequest): ApiResponse<MovieResponse> {
        return movieService.getLatestMovie(movies = movies);
    }
}