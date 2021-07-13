package com.example.superstreamer.navigation

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.retro_api_test.RetrofitNetwork
import com.example.superstreamer.R
import com.example.superstreamer.databinding.FragmentStationBinding
import com.example.superstreamer.navigation.menu.StationDTO
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class StationFragment : Fragment(R.layout.fragment_detail) {
    var TAG : String? = "로그 StationFragment - "

    private lateinit var binding : FragmentStationBinding

    private var i_response : Int? = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
//        var view = LayoutInflater.from(activity).inflate(R.layout.fragment_detail,container, false)
        binding = FragmentStationBinding.inflate(layoutInflater)
//        setContentView(view)
        val view = binding.root
        return view

        // 조회할 기본 DB
        val retrofit = Retrofit.Builder()
            .baseUrl("https://happynewmind1.cafe24.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        val service = retrofit.create(RetrofitNetwork::class.java); service.listUser()
            .enqueue(object : Callback<StationDTO> {
                override fun onFailure(call: Call<StationDTO>?, t: Throwable?) {}

                override fun onResponse(call: Call<StationDTO>, response: Response<StationDTO>) {
    /*                    binding.etStation.text = response.body().toString()
    //                    Log.d(TAG,"MainActivity.kt - onResponse() called //  response.toString() = ${response.toString()}")
    //                    Log.d(TAG,"MainActivity.kt - onResponse() called //  response.body().toString() = ${response.body().toString()}")
    //                    Log.d(TAG,"MainActivity.kt - onResponse() called //  response.body().toString() = ${response.body()!!.data.get(1).streamerName}")
    //                    Log.d(TAG,"MainActivity.kt - onResponse() called //  response.body().toString() = ${response.body()!!.data.size}")
    */
    //                    var i: Int = response.body()!!.data.size
                    i_response = response.body()!!.data.size
    //                    while (i > 0) {
    //                        i--
    //                        binding.etStation.text = response.body()!!.data.get(i).streamerName
    //                        Log.d(ContentValues.TAG,"MainActivity.kt - onResponse() called //  i = $i and response.body()!!.data.get(i).streamerName= ${response.body()!!.data.get(i).streamerName}"
    //                        )
    //                    }

                }

            })


        return view
    }


}