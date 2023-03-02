package com.example.movieapp.api

import com.example.movieapp.model.request.MoreMovieRequest
import com.example.movieapp.model.request.MovieRequest
import com.example.movieapp.model.response.*
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET

interface MovieService {

    @GET("/movie/latest")
    suspend fun getLatestMovie(@Body movie: MovieRequest): ApiResponse<MovieResponse>

    @GET("/movie/now_playing")
    suspend fun getNowPlaying(@Body nowPlaying: MoreMovieRequest): Response<NowPlayingResponse>

    @GET("/movie/popular")
    suspend fun getPopularMovie(@Body popular: MoreMovieRequest): ApiResponse<PopularMovieResponse>

    @GET("/movie/top_rated")
    suspend fun getTopRatedMovie(@Body topRated: MoreMovieRequest): ApiResponse<TopRatedResponse>

}