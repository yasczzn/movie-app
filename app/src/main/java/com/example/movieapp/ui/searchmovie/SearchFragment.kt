package com.example.movieapp.ui.searchmovie

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.movieapp.R
import com.example.movieapp.databinding.SearchFragmentBinding
import com.example.movieapp.ui.movie.mymovie.MyMovieFragment
import com.example.movieapp.ui.movie.mymovie.MyMovieViewModel

class SearchFragment : Fragment() {

    private lateinit var viewModel: SearchViewModel

    companion object {
        fun  newInstance() = SearchFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: SearchFragmentBinding = SearchFragmentBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
    }

}