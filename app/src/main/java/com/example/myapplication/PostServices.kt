package com.example.myapplication

import retrofit2.http.GET

interface PostServices {
    @GET("/data/2.5/weather?q=jakarta&appid=670057281ea3920160a7a992c87dbf88")
    suspend fun getData(): DataModel
}