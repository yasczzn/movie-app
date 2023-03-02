package com.example.movieapp.db

import androidx.databinding.adapters.Converters
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.movieapp.model.response.MovieResponse

@Database(entities = [MovieResponse::class], version = 1, exportSchema =false)
@TypeConverters(Converters::class)
abstract class MovieDatabase : RoomDatabase(){
    abstract fun movieDAO() : MovieDAO
}