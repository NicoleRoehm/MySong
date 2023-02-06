package com.example.mysong.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.mysong.R
import com.example.mysong.data.model.Song

class SongAdapter () : RecyclerView.Adapter<SongAdapter.ItemViewHolder>() {

    private var dataset = listOf<Song>()

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.song_title_text)
        val artist: TextView = view.findViewById(R.id.song_artist_text)
        val layout: ConstraintLayout = view.findViewById(R.id.song_layout)
    }
    fun submitList(list: List<Song>){
        dataset = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.song_item,parent,false)

        return ItemViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item : Song = dataset[position]

        holder.title.text = item.title
        holder.artist.text = item.artist

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}