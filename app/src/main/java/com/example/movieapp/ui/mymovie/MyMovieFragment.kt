package com.example.movieapp.ui.movie.mymovie

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.movieapp.R
import com.example.movieapp.databinding.MyMovieFragmentBinding
import com.example.movieapp.ui.moviedetails.MovieDetailsFragment
import com.example.movieapp.ui.moviedetails.MovieDetailsViewModel

class MyMovieFragment : Fragment() {

    private lateinit var viewModel: MyMovieViewModel

    companion object {
        fun  newInstance() = MyMovieFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: MyMovieFragmentBinding = MyMovieFragmentBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyMovieViewModel::class.java)
    }

}