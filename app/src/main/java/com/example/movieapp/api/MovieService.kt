package com.example.movieapp.api

import com.example.movieapp.model.request.MovieRequest
import com.example.movieapp.model.response.*
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET

interface MovieService {

    @GET("/movie/now_playing")
    suspend fun getNowPlaying(@Body nowPlaying: MovieRequest): Response<NowPlayingResponse>

    @GET("/movie/popular")
    suspend fun getPopularMovie(@Body popular: MovieRequest): Response<PopularMovieResponse>

    @GET("/movie/top_rated")
    suspend fun getTopRatedMovie(@Body topRated: MovieRequest): Response<TopRatedResponse>

}