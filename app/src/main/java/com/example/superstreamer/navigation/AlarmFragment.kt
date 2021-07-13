package com.example.superstreamer.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.superstreamer.R
import com.example.superstreamer.databinding.FragmentAlarmBinding
import com.example.superstreamer.databinding.FragmentIdeaBinding

class AlarmFragment : Fragment() {
    var TAG : String? = "로그 AlarmFragment - "
    private var _binding: FragmentAlarmBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAlarmBinding.inflate(layoutInflater)
        val view = binding.root

        return view
    }
}