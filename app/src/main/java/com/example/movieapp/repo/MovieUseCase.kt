package com.example.movieapp.repo


import com.example.movieapp.model.request.MovieRequest
import com.example.movieapp.model.response.NowPlayingResponse
import com.example.movieapp.repo.repository.MovieRepository
import com.example.movieapp.util.Resource
import javax.inject.Inject

class MovieUseCase @Inject constructor(private val movieRepository: MovieRepository) {

    suspend fun getMovies(movie : MovieRequest) : Resource<NowPlayingResponse> {
        return movieRepository.getMovies(movie = movie)
    }

}