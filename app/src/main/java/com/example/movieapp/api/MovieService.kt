package com.example.movieapp.api

import com.example.movieapp.model.response.*
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface MovieService {

    @GET("/movie/latest")
    suspend fun getLatestMovie(@Body movies: MovieRequest): ApiResponse<MovieResponse>

    @GET("/movie/now_playing")
    suspend fun getNowPlaying(@Body movies: MoreMovieRequest): Response<NowPlayingResponse>

    @GET("/movie/popular")
    suspend fun getPopularMovie(@Body movies: MoreMovieRequest): ApiResponse<PopularMovieResponse>

    @GET("/movie/top_rated")
    suspend fun getTopRatedMovie(@Body movies: MoreMovieRequest): ApiResponse<TopRatedResponse>

}