package com.example.myapplication

data class DataModel (
    val name: String? = "",
    val cod: Int? = 0,
    val weather : List<CuacaList>,
    val main: MainData,
    val wind: Wind
)

data class CuacaList (
    val id: Int ? = 0,
    val main: String? = "",
    val description: String ? = "",
    val icon: String? = ""
)

data class MainData(
    val temp: Double ? = 0.0,
    val temp_min: Double ? = 0.0,
    val temp_max: Double ? = 0.0,
    val pressure: Double ? = 0.0,
    val humidity: Double ? = 0.0
)

data class Wind (
    val speed: Double? = 0.0,
    val deg: Double? = 0.0
)