package com.example.crazywallpaper.dataApi

import com.example.crazywallpaper.Utils.Constants
import com.example.crazywallpaper.dataApi.Model.ImagesModelApiItem
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiCallInteface {
    @GET(Constants.EndUrl)
    suspend fun getImagesFromApi(
        @Query("page")page:Int=1,@Query("limit")limit:Int=100
    ):Response<List<ImagesModelApiItem>>
}
object RetrofitObj{
    val retrofitC=Retrofit.Builder().baseUrl(Constants.BaseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}