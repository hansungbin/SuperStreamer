package com.example.superstreamer

import android.accounts.Account
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.superstreamer.navigation.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    var TAG: String? = "로그 MainActivity - "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //시작시 바텀네비게이션을 로드하고 바로 station 호출
        bottom_navi.setOnNavigationItemSelectedListener(this)
        bottom_navi.selectedItemId = R.id.it_station
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.it_station -> {
                var stationFragment = StationFragment()
                supportFragmentManager.beginTransaction().replace(R.id.Frame_layout_main_content, stationFragment).commit()
                return true
            }
            R.id.it_alarm -> {
                var alarmFragment = AlarmFragment()
                supportFragmentManager.beginTransaction().replace(R.id.Frame_layout_main_content, alarmFragment).commit()
                return true
            }
            R.id.it_idea -> {
                var ideaFragment = IdeaFragment()
                supportFragmentManager.beginTransaction().replace(R.id.Frame_layout_main_content, ideaFragment).commit()
                return true
            }
            R.id.it_account -> {
                var accountFragment = AccountFragment()
                supportFragmentManager.beginTransaction().replace(R.id.Frame_layout_main_content, accountFragment).commit()
                return true
            }
            R.id.it_register -> {
                var registerFragment = RegisterFragment()
                supportFragmentManager.beginTransaction().replace(R.id.Frame_layout_main_content, registerFragment).commit()
                return true
            }
        }
        return false
    }

}