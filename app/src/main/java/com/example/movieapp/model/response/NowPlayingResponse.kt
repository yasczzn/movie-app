package com.example.movieapp.model.response

import com.google.gson.annotations.SerializedName

data class NowPlayingResponse(

	@SerializedName("dates")
	val dates: Dates? = null,

	@SerializedName("results")
	val results: List<ResultsItem>? = null

) {
	data class ResultsItem(

		@SerializedName("overview")
		val overview: String? = null,

		@SerializedName("original_language")
		val originalLanguage: String? = null,

		@SerializedName("original_title")
		val originalTitle: String? = null,

		@SerializedName("video")
		val video: Boolean? = null,

		@SerializedName("title")
		val title: String? = null,

		@SerializedName("genre_ids")
		val genreIds: List<Int?>? = null,

		@SerializedName("poster_path")
		val posterPath: String? = null,

		@SerializedName("backdrop_path")
		val backdropPath: String? = null,

		@SerializedName("release_date")
		val releaseDate: String? = null,

		@SerializedName("popularity")
		val popularity: Any? = null,

		@SerializedName("vote_average")
		val voteAverage: Any? = null,

		@SerializedName("id")
		val id: Int? = null,

		@SerializedName("adult")
		val adult: Boolean? = null,

		@SerializedName("vote_count")
		val voteCount: Int? = null
	)

	data class Dates(

		@SerializedName("maximum")
		val maximum: String? = null,

		@SerializedName("minimum")
		val minimum: String? = null
	)
}


