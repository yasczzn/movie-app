package com.example.movieapp.repo.datasource

import com.example.movieapp.model.request.MovieRequest
import com.example.movieapp.model.response.NowPlayingResponse
import retrofit2.Response

interface MovieDataSource {
    suspend fun getMovies(movie : MovieRequest): Response<NowPlayingResponse>
}