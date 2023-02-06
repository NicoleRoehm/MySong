package com.example.mysong.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mysong.data.model.Song

class SongRepository {

    private val _songs = MutableLiveData<List<Song>>(loadSongs())
    val songs: LiveData<List<Song>>
    get() = _songs

    fun search(term:String){
        _songs.value = loadSongs().filter {
            it.title.lowercase().contains(term.lowercase()) ||
                    it.artist.lowercase().contains(term.lowercase())
        }
    }

    private fun loadSongs():List<Song>{
        return listOf(

            Song(1, "Bist du Ok?", "Mark Foster"),
            Song(2, "L´enfer", "Stromae"),
            Song(3, "Saoko", "Rosaliá"),
            Song(4, "Love me more", "Mitski"),
            Song(5, "Vegas", "Doja Cat"),
            Song(6, "Fühlst du das auch", "Apache 207"),
            Song(7, "Wildberry Lillet ", "Nina Chuba"),
            Song(8, "Free Yourself", "Jessie Ware"),
            Song(9, "Zukunft Pink", "Peter Fox"),
            Song(10, "Body Paint", "Arctic Monkeys"),
            Song(11, "Es regnet Hirn", "Ok Kid"),
            Song(12, "Fire in the Hall", "Mando Diao"),
            Song(13, "abcdefu", "Gayle"),
            Song(14, "Into You", "Merci, Mercy"),
        )
    }

}