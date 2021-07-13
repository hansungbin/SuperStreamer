package com.example.superstreamer.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.superstreamer.R
import com.example.superstreamer.databinding.FragmentIdeaBinding
import com.example.superstreamer.databinding.FragmentRegisterBinding

class IdeaFragment : Fragment() {
    var TAG : String? = "로그 IdeaFragment - "
    private var _binding: FragmentIdeaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIdeaBinding.inflate(layoutInflater)
        val view = binding.root

        return view
    }
}