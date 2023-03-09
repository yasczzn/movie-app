package com.example.movieapp.repo.datasource

import com.example.movieapp.api.MovieService
import com.example.movieapp.db.MovieDAO
import com.example.movieapp.model.request.MovieRequest
import com.example.movieapp.model.response.NowPlayingResponse
import retrofit2.Response
import javax.inject.Inject

class MovieDataSourceImpl @Inject constructor(
    private val movieService: MovieService) : MovieDataSource{

    override suspend fun getMovies(movie: MovieRequest): Response<NowPlayingResponse> {
        return movieService.getNowPlaying(nowPlaying = movie)
    }

}