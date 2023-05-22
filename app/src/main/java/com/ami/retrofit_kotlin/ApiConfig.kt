package com.ami.retrofit_kotlin

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {
    const val baseURL =  "https://rickandmortyapi.com/api/"

    fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getservice(): ApiService{
        return getRetrofit().create(ApiService::class.java)
    }
}