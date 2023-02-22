package com.example.movieapp.ui.movie

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movieapp.MovieViewModel
import com.example.movieapp.databinding.MovieFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

class MovieFragment : Fragment() {

    private lateinit var viewModel: MovieViewModel

    companion object {
        fun  newInstance() = MovieFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: MovieFragmentBinding = MovieFragmentBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
    }

}