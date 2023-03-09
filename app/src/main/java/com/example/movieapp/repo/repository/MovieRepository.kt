package com.example.movieapp.repo.repository

import com.example.movieapp.util.Resource
import com.example.movieapp.model.request.MovieRequest
import com.example.movieapp.model.response.NowPlayingResponse
import retrofit2.Response

interface MovieRepository {

    suspend fun getMovies(movie : MovieRequest) : Resource<NowPlayingResponse>
}