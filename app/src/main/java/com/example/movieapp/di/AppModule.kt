package com.example.movieapp.di

import com.example.movieapp.api.MovieService
import com.example.movieapp.repo.MovieRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    private const val BASE_URL = "https://api.themoviedb.org/3"

    @Provides
    @Singleton
    fun provideMovieService(): MovieService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()
            .create(MovieService::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: MovieService): MovieRepository {
        return  MovieRepositoryImpl(api)
    }

}