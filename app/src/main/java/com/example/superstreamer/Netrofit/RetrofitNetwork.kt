package com.example.retro_api_test

import com.example.superstreamer.navigation.menu.StationDTO
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitNetwork {

    // 호출할 경로
    @GET("/select_content.php")
    //
    fun listUser() : Call<StationDTO>

}