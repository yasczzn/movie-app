package com.example.movieapp.model.response

import com.google.gson.annotations.SerializedName

data class MovieResponse(

	@SerializedName("overview")
	val overview: String,

	@SerializedName("original_language")
	val originalLanguage: String,

	@SerializedName("original_title")
	val originalTitle: String,

	@SerializedName("video")
	val video: Boolean,

	@SerializedName("title")
	val title: String,

	@SerializedName("genre_ids")
	val genreIds: List<Int>,

	@SerializedName("poster_path")
	val posterPath: String,

	@SerializedName("backdrop_path")
	val backdropPath: String,

	@SerializedName("release_date")
	val releaseDate: String,

	@SerializedName("popularity")
	val popularity: Any,

	@SerializedName("vote_average")
	val voteAverage: Any,

	@SerializedName("id")
	val id: Int,

	@SerializedName("adult")
	val adult: Boolean,

	@SerializedName("vote_count")
	val voteCount: Int
)




