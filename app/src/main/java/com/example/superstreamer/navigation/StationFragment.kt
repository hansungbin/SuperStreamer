package com.example.superstreamer.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.superstreamer.R
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