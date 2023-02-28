package com.example.movieapp

import androidx.lifecycle.ViewModel
import com.example.movieapp.repo.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(private val repository: MovieRepository) : ViewModel() {
    // TODO: Implement the ViewModel
}