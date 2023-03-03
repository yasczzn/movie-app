package com.example.movieapp.model.response

import com.google.gson.annotations.SerializedName

data class Api2Response<T>(
    @SerializedName("page")
    val page: Int,

    @SerializedName("total_pages")
    val totalPages: Int,

    @SerializedName("total_results")
    val totalResults: Int = 0,

    @SerializedName("results")
    val results: List<T>,

    @SerializedName("dates")
    val dates: Dates
)
