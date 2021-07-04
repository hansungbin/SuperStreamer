package com.example.superstreamer.navigation

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.superstreamer.R
import com.example.superstreamer.navigation.menu.StationDTO
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.fragment_register.*
import kotlinx.android.synthetic.main.fragment_register.view.*


class RegisterFragment : Fragment() {
    var TAG: String? = "로그 RegisterFragment - "
    var contentUid: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        contentUid = FirebaseAuth.getInstance().currentUser?.uid
        var comment = LayoutInflater.from(activity).inflate(R.layout.fragment_register, container, false)

        comment.btn_register.setOnClickListener {

            var station = StationDTO()
            station.streamerName = et_streamer_name.text.toString()
            station.streamerExplain = et_streamer_explain.text.toString()
            station.youtubeAddress = et_youtube_address.text.toString()
            station.afreecaAddress = et_afreeca_address.text.toString()
            station.twichAddress = et_twitch_address.text.toString()
            station.timestamp = System.currentTimeMillis()

            FirebaseFirestore.getInstance().collection("station").document(contentUid!!).set(station)

            et_streamer_name.setText("")
            et_streamer_explain.setText("")
            et_youtube_address.setText("")
            et_afreeca_address.setText("")
            et_twitch_address.setText("")

            Toast.makeText(this.context, "저장 완료", Toast.LENGTH_LONG).show()

        }

        return comment


    }
}