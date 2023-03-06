package com.example.movieapp.di

import android.content.Context
import android.content.SharedPreferences
import com.example.movieapp.api.MovieService
import com.example.movieapp.repo.MovieRepository
import com.example.movieapp.repo.MovieRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
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

    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        return  context.getSharedPreferences("movie_app", Context.MODE_PRIVATE)
    }

}