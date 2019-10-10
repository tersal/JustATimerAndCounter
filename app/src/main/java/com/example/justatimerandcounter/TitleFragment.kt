package com.example.justatimerandcounter

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.justatimerandcounter.databinding.FragmentTitleBinding

class TitleFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentTitleBinding.inflate(inflater, container, false)

        binding.titleCounterButton.setOnClickListener {
            it.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToCounterFragment())
        }

        binding.titleTimerButton.setOnClickListener {
            it.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToTimerFragment())
        }

        return binding.root
    }
}