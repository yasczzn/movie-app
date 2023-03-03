package com.example.movieapp.repo

import com.bumptech.glide.load.engine.Resource
import com.example.movieapp.model.response.ApiResponse
import com.example.movieapp.model.request.MovieRequest
import com.example.movieapp.model.response.MovieResponse
import com.example.movieapp.repo.datasource.MovieDataSource
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieDataSource: MovieDataSource): MovieRepository{

//        private fun responseMovieResult(response: ApiResponse<MovieResponse>) : Resource<MovieResponse>{
//            if(response.isSuccessful){
//                response.body()?.let { result->
//                    return Resource.Success(result)
//                }
//            }
//            return Resource.Error(message = "${response.errorBody()?.string()}")
//        }
//
//    override suspend fun getMovies(movie: MovieRequest): Resource<MovieResponse> {
//        return responseMovieResult(movieDataSource.getMovies(movie = movie))
//    }

}