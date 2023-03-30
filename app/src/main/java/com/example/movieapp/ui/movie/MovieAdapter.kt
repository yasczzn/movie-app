package com.example.movieapp.ui.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.R
import com.example.movieapp.databinding.ItemMovieBinding
import com.example.movieapp.model.response.NowPlayingResponse
import retrofit2.Response

private val Any.results: List<NowPlayingResponse>?
    get() {}

class MovieAdapter(private val movie: Response<NowPlayingResponse>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        // Inflating list data from list_item to view
        val view = ItemMovieBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(view)
    }
    // Binding cryptocurrency list to ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movie.results)
    }
    override fun getItemCount(): Int = movie.totalResults
    // Iterating ViewHolder and loading it's
    // content to our Image and Text ViewsT
    class ViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(index: List<NowPlayingResponse>?) {

            binding.btnLike.setOnClickListener(View.OnClickListener { view ->
                view.isSelected = !view.isSelected

                if (view.isSelected) {
                    binding.btnLike.setImageResource(R.drawable.ic_baseline_favorite_24)
                } else {
                    binding.btnLike.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                }
            })
        }
    }
}
