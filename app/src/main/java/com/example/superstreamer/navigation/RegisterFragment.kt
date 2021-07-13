package com.example.superstreamer.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.superstreamer.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    var TAG: String? = "로그 RegisterFragment - "

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(layoutInflater)
        val view = binding.root



        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
