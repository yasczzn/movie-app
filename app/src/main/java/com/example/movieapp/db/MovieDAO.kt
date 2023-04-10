package com.example.movieapp.db

import androidx.room.Dao
import com.example.movieapp.model.response.NowPlayingResponse


@Dao
interface MovieDAO {
    
    fun movieListItem(): List<NowPlayingResponse>

}