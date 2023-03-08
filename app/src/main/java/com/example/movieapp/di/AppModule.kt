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
class AppModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        return  context.getSharedPreferences("movie_app", Context.MODE_PRIVATE)
    }

}