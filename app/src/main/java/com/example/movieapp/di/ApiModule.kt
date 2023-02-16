package com.example.movieapp.di

import com.example.movieapp.api.MovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ApiModule {

    @Provides
    @Singleton
    fun movies(retrofit: Retrofit): MovieService =
        retrofit.create(MovieService::class.java)

}