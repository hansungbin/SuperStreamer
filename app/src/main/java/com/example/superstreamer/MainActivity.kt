package com.example.superstreamer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var fragmentView: View? = null
    var TAG : String? = "로그 MainActivity - "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stationListActivity = StationListActivity()
        supportFragmentManager.beginTransaction().replace(R.id.main_content, stationListActivity).commit()

//        var intent = Intent(this, StationListActivity::class.java)
//        startActivity(intent)

    }


//    var detailViewFragment = DetailViewFragment()
//    supportFragmentManager.beginTransaction().replace(R.id.main_content, detailViewFragment).commit()
//    return true

    //        var stationListActivity = StationListActivity()
//        supportFragmentManager.beginTransaction().replace(R.id.main_content, stationListActivity).commit()
//        return true
//
//        viewholder.detailViewItem_comment_imageview.setOnClickListener { v ->
//            var intent = Intent(v.context, CommentActivity::class.java)
//            intent.putExtra("contentUid", contentUidList[position])
//            intent.putExtra("destinationUid", contentDTOs[position].uid)
//            startActivity(intent)
//        }
}