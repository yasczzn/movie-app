package com.example.movieapp.api

import com.example.movieapp.model.response.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface MovieService {

    @GET("/movie/latest")
    suspend fun getLatestMovie(
        @Header("Authorization") token: String,
        @Path("language") language: String
    ): ApiResponse<MovieResponse>

    @GET("/movie/now_playing")
    suspend fun getNowPlaying(
        @Header("Authorization") token: String,
        @Path("language") language: String,
        @Path("page") page: Int? = null
    ): Response<NowPlayingResponse>

    @GET("/movie/popular")
    suspend fun getPopularMovie(
        @Header("Authorization") token: String,
        @Path("language") language: String,
        @Path("page") page: Int? = null
    ): ApiResponse<PopularMovieResponse>

    @GET("/movie/top_rated")
    suspend fun getTopRatedMovie(
        @Header("Authorization") token: String,
        @Path("language") language: String,
        @Path("page") page: Int? = null
    ): ApiResponse<TopRatedResponse>

}