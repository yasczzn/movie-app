package com.example.movieapp.di

import com.example.movieapp.ui.movie.MovieAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AdapterModule {

    @Provides
    @Singleton
    fun providesMovieAdapter(): MovieAdapter {
        return MovieAdapter()
    }
}