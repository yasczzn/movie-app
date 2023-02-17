package com.example.movieapp.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface MovieService {

    @GET("/movie/latest")
    suspend fun getLatestMovie(
        @Header("Authorization") token: String,
        @Path("language") language: String
    ): Call<List<MovieResponse>>

    @GET("/movie/now_playing")
    suspend fun getNowPlaying(
        @Header("Authorization") token: String,
        @Path("language") language: String,
        @Path("page") page: Int? = null
    ): Call<List<NowPlayingResponse>>

    @GET("/movie/popular")
    suspend fun getPopularMovie(
        @Header("Authorization") token: String,
        @Path("language") language: String,
        @Path("page") page: Int? = null
    ): Call<List<PopularMovieResponse>>

    @GET("/movie/top_rated")
    suspend fun getTopRatedMovie(
        @Header("Authorization") token: String,
        @Path("language") language: String,
        @Path("page") page: Int? = null
    ): Call<List<TopRatedMovieResponse>>

}