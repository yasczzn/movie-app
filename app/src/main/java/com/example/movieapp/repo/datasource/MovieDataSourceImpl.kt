package com.example.movieapp.repo.datasource

import com.example.movieapp.api.MovieService
import com.example.movieapp.model.request.MovieRequest
import com.example.movieapp.model.response.ApiResponse
import com.example.movieapp.model.response.MovieResponse
import javax.inject.Inject

class MovieDataSourceImpl @Inject constructor(
    private val movieService: MovieService) : MovieDataSource{

    override suspend fun movies(movie: MovieRequest): ApiResponse<MovieResponse> {
        return movieService.getLatestMovie(movie = movie)
    }

}