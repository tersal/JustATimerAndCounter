package com.example.justatimerandcounter.screens.counter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.justatimerandcounter.databinding.FragmentCounterBinding

class CounterFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCounterBinding.inflate(inflater, container, false)

        val viewModel = ViewModelProviders.of(this)[CounterViewModel::class.java]

        binding.counterViewModel = viewModel

        viewModel.score.observe(this, Observer { count ->
            binding.counterNumber.text = count.toString()
        })

        return binding.root
    }
}