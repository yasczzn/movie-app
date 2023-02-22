package com.example.movieapp.repo

import android.app.Application
import com.example.movieapp.api.MovieService

class MovieRepositoryImpl(
    private val api: MovieService,
    private val movieContext: Application
): MovieRepository {

    override suspend fun movies() {

    }
}