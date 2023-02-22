package com.example.movieapp.di

import android.app.Application
import com.example.movieapp.ApiKey
import com.example.movieapp.api.MovieService
import com.example.movieapp.repo.MovieRepository
import com.example.movieapp.repo.MovieRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMovieService(): MovieService {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3")
            .build()
            .create(MovieService::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: MovieService, app: Application): MovieRepository {
        return  MovieRepositoryImpl(api, app)
    }

}