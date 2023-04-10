package com.example.movieapp.ui.moviedetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movieapp.databinding.MovieDetailsFragmentBinding

class MovieDetailsFragment : Fragment() {

    private lateinit var viewModel: MovieDetailsViewModel

    companion object {
        fun  newInstance() = MovieDetailsFragment()
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val binding: MovieDetailsFragmentBinding = MovieDetailsFragmentBinding.inflate(layoutInflater)

        return binding.root
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[MovieDetailsViewModel::class.java]
    }

}