package com.example.movieapp.ui.searchmovie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.movieapp.databinding.SearchFragmentBinding

class SearchFragment : Fragment() {

    private lateinit var viewModel: SearchViewModel

    companion object {
        fun  newInstance() = SearchFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: SearchFragmentBinding = SearchFragmentBinding.inflate(layoutInflater)

        return binding.root
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[SearchViewModel::class.java]
    }

}