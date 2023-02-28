package com.example.movieapp.model.dao

import androidx.room.Dao
import com.example.movieapp.model.response.MovieResponse
import org.intellij.lang.annotations.Flow
import retrofit2.http.Query

@Dao
interface MovieDAO {

    @Query("select * from movie")
    fun movieListItem(): List<MovieResponse>

}