package com.example.movieapp.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.databinding.ItemMovieBinding

class MovieAdapter(private val movie: MovieAdapter) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        // Inflating list data from list_item to view
        val view = ItemMovieBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(view)
    }
    // Binding cryptocurrency list to ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    class ViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}
