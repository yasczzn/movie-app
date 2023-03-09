package com.example.movieapp.di

import com.example.movieapp.repo.repository.MovieRepository
import com.example.movieapp.repo.repository.MovieRepositoryImpl
import com.example.movieapp.repo.datasource.MovieDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun providesRepository(movieDataSource: MovieDataSource): MovieRepository {
        return MovieRepositoryImpl(
            movieDataSource = movieDataSource)
    }

}