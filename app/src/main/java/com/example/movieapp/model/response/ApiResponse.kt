package com.example.movieapp.model.response

import com.google.gson.annotations.SerializedName

data class ApiResponse<T>(
    @field:SerializedName("page")
    val page: Int? = 0,

    @field:SerializedName("total_pages")
    val totalPages: Int? = 0,

    @field:SerializedName("total_results")
    val totalResults: Int? = 0,

    @field:SerializedName("results")
    val results: List<T>? = null
)
