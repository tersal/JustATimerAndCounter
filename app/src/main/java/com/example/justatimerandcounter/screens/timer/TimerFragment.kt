package com.example.justatimerandcounter.screens.timer

import android.os.Bundle
import android.os.SystemClock
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Chronometer
import androidx.fragment.app.Fragment
import com.example.justatimerandcounter.databinding.FragmentTimerBinding

class TimerFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTimerBinding.inflate(inflater, container, false)

        val chrono = binding.timerText as Chronometer

        binding.startButton.setOnClickListener {
            chrono.start()
        }

        binding.stopButton.setOnClickListener {
            chrono.stop()
        }

        binding.resetTimerButton.setOnClickListener {
            chrono.base = SystemClock.elapsedRealtime()
            chrono.stop()
        }

        return binding.root
    }
}