package com.example.movieapp.response;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class MovieResponse{

	@SerializedName("original_language")
	private String originalLanguage;

	@SerializedName("imdb_id")
	private Object imdbId;

	@SerializedName("video")
	private boolean video;

	@SerializedName("title")
	private String title;

	@SerializedName("backdrop_path")
	private Object backdropPath;

	@SerializedName("revenue")
	private int revenue;

	@SerializedName("genres")
	private List<GenresItem> genres;

	@SerializedName("popularity")
	private Object popularity;

	@SerializedName("production_countries")
	private List<Object> productionCountries;

	@SerializedName("id")
	private int id;

	@SerializedName("vote_count")
	private int voteCount;

	@SerializedName("budget")
	private int budget;

	@SerializedName("overview")
	private String overview;

	@SerializedName("original_title")
	private String originalTitle;

	@SerializedName("runtime")
	private int runtime;

	@SerializedName("poster_path")
	private Object posterPath;

	@SerializedName("spoken_languages")
	private List<Object> spokenLanguages;

	@SerializedName("production_companies")
	private List<Object> productionCompanies;

	@SerializedName("release_date")
	private String releaseDate;

	@SerializedName("vote_average")
	private Object voteAverage;

	@SerializedName("belongs_to_collection")
	private Object belongsToCollection;

	@SerializedName("tagline")
	private String tagline;

	@SerializedName("adult")
	private boolean adult;

	@SerializedName("homepage")
	private String homepage;

	@SerializedName("status")
	private String status;

	public String getOriginalLanguage(){
		return originalLanguage;
	}

	public Object getImdbId(){
		return imdbId;
	}

	public boolean isVideo(){
		return video;
	}

	public String getTitle(){
		return title;
	}

	public Object getBackdropPath(){
		return backdropPath;
	}

	public int getRevenue(){
		return revenue;
	}

	public List<GenresItem> getGenres(){
		return genres;
	}

	public Object getPopularity(){
		return popularity;
	}

	public List<Object> getProductionCountries(){
		return productionCountries;
	}

	public int getId(){
		return id;
	}

	public int getVoteCount(){
		return voteCount;
	}

	public int getBudget(){
		return budget;
	}

	public String getOverview(){
		return overview;
	}

	public String getOriginalTitle(){
		return originalTitle;
	}

	public int getRuntime(){
		return runtime;
	}

	public Object getPosterPath(){
		return posterPath;
	}

	public List<Object> getSpokenLanguages(){
		return spokenLanguages;
	}

	public List<Object> getProductionCompanies(){
		return productionCompanies;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public Object getVoteAverage(){
		return voteAverage;
	}

	public Object getBelongsToCollection(){
		return belongsToCollection;
	}

	public String getTagline(){
		return tagline;
	}

	public boolean isAdult(){
		return adult;
	}

	public String getHomepage(){
		return homepage;
	}

	public String getStatus(){
		return status;
	}
}