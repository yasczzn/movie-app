package com.example.movieapp.repo.repository

import com.example.movieapp.model.request.MovieRequest
import com.example.movieapp.model.response.NowPlayingResponse
import com.example.movieapp.util.Resource

interface MovieRepository {

    suspend fun getMovies(movie : MovieRequest) : Resource<NowPlayingResponse>
}