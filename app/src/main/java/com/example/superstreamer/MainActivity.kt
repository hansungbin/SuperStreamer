package com.example.superstreamer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.superstreamer.databinding.ActivityMainBinding
import com.example.superstreamer.navigation.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    var TAG: String? = "로그 MainActivity - "
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bottomNavi.setOnNavigationItemSelectedListener(this)
        binding.bottomNavi.selectedItemId = R.id.it_station
    }

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





}