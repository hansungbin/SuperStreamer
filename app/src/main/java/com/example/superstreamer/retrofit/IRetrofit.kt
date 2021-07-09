package com.example.superstreamer.retrofit

import com.example.superstreamer.util.API
import com.google.gson.JsonElement
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IRetrofit {

    // https://happynewmind1.cafe24.com/select_content.php?streamerName=트

    @GET(API.SEARCH_STATION)
    fun searchStations(@Query("streamerName") searchTerm : String ) : Call<JsonElement>

}