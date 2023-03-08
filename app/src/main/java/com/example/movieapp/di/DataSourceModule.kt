package com.example.movieapp.di

import com.example.movieapp.api.MovieService
import com.example.movieapp.db.MovieDAO
import com.example.movieapp.repo.datasource.MovieDataSource
import com.example.movieapp.repo.datasource.MovieDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    @Singleton
    fun providesMovieDataSource(movieDAO: MovieDAO) : MovieDataSource {
        return MovieDataSourceImpl(movieDAO = movieDAO)
    }

    @Provides
    @Singleton
    fun provideMovieDataSource(movieService: MovieService): MovieDataSource {
        return MovieDataSourceImpl(movieService = movieService)
    }

}