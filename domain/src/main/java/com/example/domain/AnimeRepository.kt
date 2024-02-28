package com.example.domain

interface AnimeRepository {

    /**
     *  Boolean = success
     *  String = data
     */

    suspend fun loadQuote(): Pair<Boolean, String>
}