package com.example.justatimerandcounter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.justatimerandcounter.databinding.FragmentAboutBinding

class AboutFragment :Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentAboutBinding.inflate(inflater, container, false)

        return binding.root
    }
}