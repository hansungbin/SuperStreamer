package com.example.superstreamer.navigation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.superstreamer.R
import com.example.superstreamer.retrofit.RetrofitManager
import com.example.superstreamer.util.RESPONSE_STATE
import com.google.firebase.firestore.FirebaseFirestore

class StationFragment : Fragment() {
    var TAG : String? = "로그 StationFragment - "
    var firestore : FirebaseFirestore? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = LayoutInflater.from(activity).inflate(R.layout.fragment_station,container, false)
        firestore = FirebaseFirestore.getInstance()

        RetrofitManager.instance.searchStation(searchTerm = "",completion = {
            responseState,responseResult ->

            when(responseState) {
                RESPONSE_STATE.OKAY -> {
                    Log.d(TAG,"StationFragment.kt - onCreateView() called RESPONSE_STATE.OKAY " )
                    Toast.makeText(this.context,"api 호출 성공입니다.",Toast.LENGTH_SHORT).show()
                }
                RESPONSE_STATE.FAIL ->{
//                    Toast.makeText(this, "api 호출 에러입니다." , Toast.LENGTH_SHORT).show()
                    Toast.makeText(this.context,"api 호출 실패입니다.",Toast.LENGTH_SHORT).show()
                    Log.d(TAG,"StationFragment.kt - onCreateView() called RESPONSE_STATE.FAIL" )
                }
            }
        })

        return view
    }

    inner class StationViewRecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

        override fun getItemCount(): Int {
            TODO("Not yet implemented")
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            TODO("Not yet implemented")
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            TODO("Not yet implemented")
        }



    }
}