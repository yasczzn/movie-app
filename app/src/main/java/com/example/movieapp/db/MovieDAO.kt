package com.example.movieapp.db

import androidx.room.Dao
import com.example.movieapp.model.response.NowPlayingResponse
import retrofit2.http.Query


@Dao
interface MovieDAO {

    @Query("select * from movie")
    fun movieListItem(): List<NowPlayingResponse>

}