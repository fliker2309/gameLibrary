package com.example.gamelibrary

import android.app.Application
import com.example.data.AnimeRepositoryImpl
import com.example.domain.AnimeRepository
import com.example.presentation.MainViewModel
import com.example.presentation.ProvideViewModel

class AnimeQuoteApp : Application(), ProvideViewModel {

    private lateinit var viewModel: MainViewModel
    override fun onCreate() {
        super.onCreate()
        val repository : AnimeRepository = AnimeRepositoryImpl()
        viewModel = MainViewModel(repository = repository)
    }

    override fun viewModel(): MainViewModel {
        return viewModel
    }
}