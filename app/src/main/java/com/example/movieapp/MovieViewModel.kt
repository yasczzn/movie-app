package com.example.movieapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movieapp.repo.MovieUseCase
import com.example.movieapp.repo.repository.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val movieUseCase: MovieUseCase, private val repository: MovieRepository) : ViewModel() {

    val successful: MutableLiveData<Boolean?> = MutableLiveData()
    val error: MutableLiveData<String?> = MutableLiveData()

}