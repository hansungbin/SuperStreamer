package com.example.superstreamer.retrofit

import android.util.Log
import com.example.superstreamer.util.API
import com.example.superstreamer.util.RESPONSE_STATE
import com.google.gson.JsonElement
import retrofit2.Call
import retrofit2.Response

class RetrofitManager {

    companion object{
        val instance = RetrofitManager()
    }

    // http 콜 만들기
    // 레트로핏 인터페이스 가져오기
    private val iRetrofit : IRetrofit? = RetrofitClient.getClient(API.BASE_URL)?.create(IRetrofit::class.java)
    var TAG : String? = "로그 RetrofitManager.kt"

    // searchPhotos
    // 검색 API 호출
    fun searchStation(searchTerm: String, completion : (RESPONSE_STATE, String) -> Unit ){

        val term = searchTerm.let{
            it
        }?: ""

        val call = iRetrofit?.searchStations(searchTerm = searchTerm).let {
            it
        }?: return

        call.enqueue(object : retrofit2.Callback<JsonElement>{

            override fun onFailure(call: Call<JsonElement>, t: Throwable) {
                Log.d(TAG,"RetrofitManager.kt - onFailure() called / t : $t" )

                completion(RESPONSE_STATE.FAIL, t.toString())
            }

            override fun onResponse(call: Call<JsonElement>, response: Response<JsonElement>) {
                Log.d(TAG,"RetrofitManager.kt - onResponse() called / response : ${response.raw()}" )

                completion(RESPONSE_STATE.OKAY, response.raw().toString())
            }



        })

    }
}