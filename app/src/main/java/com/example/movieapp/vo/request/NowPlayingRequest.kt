package com.example.movieapp.vo.request

import com.google.gson.annotations.SerializedName

data class NowPlayingRequest(
    @SerializedName("language")
    val language: String,
    @SerializedName("page")
    val page: Int
)
