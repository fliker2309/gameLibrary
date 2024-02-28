package com.example.data

import retrofit2.http.GET

interface AnimeQuoteService {

    //https://animechan.xyz/api/random
    @GET("api/random")
    suspend fun animeQuote() : AnimeQuoteCloud
}