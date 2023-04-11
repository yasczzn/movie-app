package com.example.movieapp.ui.mymovie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.movieapp.databinding.MyMovieFragmentBinding

class MyMovieFragment : Fragment() {

    private lateinit var viewModel: MyMovieViewModel

    companion object {
        fun  newInstance() = MyMovieFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: MyMovieFragmentBinding = MyMovieFragmentBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[MyMovieViewModel::class.java]
    }

}