package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class DataViewModel() : ViewModel() {

    val kota = MutableLiveData<String>().apply { value = "Jakarta" }
    val date = MutableLiveData<String>().apply { value = getDateTime() }
    val time = MutableLiveData<String>().apply { value = getTime() }
    val wind = MutableLiveData<String>().apply { value = "5m/s" }
    val temp = MutableLiveData<String>().apply { value = "28" + " \u2103" }
    val hum = MutableLiveData<String>().apply { value = "72%" }
    val isDay = MutableLiveData<Boolean>().apply {
        value = getGreetingMsg() != "Good Night" || getGreetingMsg() != "Good Evening"
    }
    val greetings = MutableLiveData<String>().apply { value = getGreetingMsg() }
    val dataModel = MutableLiveData<DataModel>().apply { }

    fun getDataWeather(){
        GlobalScope.launch {
            val repository = Services.retrofit.getData()
            kota.postValue(repository.name)

            /*cara pertama : cara ini akan membuat code lebih sedikit karena
              data yang ditampilkan pada view "@{vm.dataModel.wind.speed.toString() + `m/s`}"
              akan diambil langsung dari class DataModel
             */
            dataModel.postValue(repository)

            /*cara kedua : cara ini dilakukan dengan meng-asign nilai satu persatu
              ke variabel dengan mengambil data dari class DataModel
            */
            temp.postValue(repository.main.temp.toString() + " \u2103")
            wind.postValue(repository.wind.speed.toString() + "m/s")
            hum.postValue(repository.main.humidity.toString() + "%")
        }
    }

    private fun getDateTime(): String? {
        return try {
            val now = Date()
            val simpleDateFormat = SimpleDateFormat("EEEE HH:mm a")
            simpleDateFormat.timeZone = TimeZone.getTimeZone("Asia/Jakarta")
            simpleDateFormat.format(now)
        } catch (e: Exception) {
            e.toString()
        }
    }

    private fun getTime(): String? {
        return try {
            val now = Date()
            val sdf = SimpleDateFormat("HH:mm")
            sdf.timeZone = TimeZone.getTimeZone("Asia/Jakarta")
            val date = sdf.format(now)
            date.toString()
        } catch (e: Exception) {
            e.toString()
        }
    }

    private fun getGreetingMsg():String{
        val c = Calendar.getInstance()
        return when (c.get(Calendar.HOUR_OF_DAY)) {
            in 0..11 -> "Good Morning"
            in 12..15 -> "Good Afternoon"
            in 16..20 -> "Good Evening"
            in 21..23 -> "Good Night"
            else -> "Hello"
        }
    }
}