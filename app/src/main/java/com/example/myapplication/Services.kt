package com.example.myapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Services {
    companion object {
        val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(PostServices::class.java)
        }
    }
}