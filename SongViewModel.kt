package com.example.mysong

import androidx.lifecycle.ViewModel
import com.example.mysong.data.SongRepository

class SongViewModel : ViewModel() {

    private val repository = SongRepository()

    val songs = repository.songs

    fun search(term: String){
        repository.search(term)
    }
}