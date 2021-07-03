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
    var fragmentView: View? = null
    var TAG: String? = "로그 MainActivity - "

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.it_station -> {
                var stationFragment = StationFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content, stationFragment).commit()
                return true
            }
            R.id.it_alarm -> {
                var alarmFragment = AlarmFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content, alarmFragment).commit()
                return true
            }
            R.id.it_idea -> {
                var ideaFragment = IdeaFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content, ideaFragment).commit()
                return true
            }
            R.id.it_account -> {
                var accountFragment = AccountFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content, accountFragment).commit()
                return true
            }
            R.id.it_register -> {
                var registerFragment = RegisterFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content, registerFragment).commit()
                return true
            }
        }
        return false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navi.setOnNavigationItemSelectedListener(this)

    }


}