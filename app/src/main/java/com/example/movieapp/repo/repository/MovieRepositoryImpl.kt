package com.example.movieapp.repo.repository


import com.example.movieapp.model.request.MovieRequest
import com.example.movieapp.model.response.NowPlayingResponse
import com.example.movieapp.util.Resource
import com.example.movieapp.repo.datasource.MovieDataSource
import retrofit2.Response
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieDataSource: MovieDataSource
): MovieRepository {

        private fun responseMovieResult(response: Response<NowPlayingResponse>) : Resource<NowPlayingResponse> {
            if(response.isSuccessful){
                response.body()?.let { result->
                    return Resource.Success(result)
                }
            }
            return Resource.Error(message = "${response.errorBody()?.string()}")
        }

    override suspend fun getMovies(movie: MovieRequest): Resource<NowPlayingResponse> {
        return responseMovieResult(movieDataSource.getMovies(movie = movie))
    }
}