package com.example.crazywallpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.crazywallpaper.dataApi.ApiCallInteface
import com.example.crazywallpaper.dataApi.RetrofitObj
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.create

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val call=RetrofitObj.retrofitC.create(ApiCallInteface::class.java)

        GlobalScope.launch {

            val data=call.getImagesFromApi()
            Log.d("bhaikar",data.body().toString())
        }
    }
}