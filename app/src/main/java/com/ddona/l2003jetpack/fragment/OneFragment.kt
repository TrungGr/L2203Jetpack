package com.ddona.l2003jetpack.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ddona.l2003jetpack.databinding.DataFragmentBinding

class OneFragment : Fragment() {
    private lateinit var binding: DataFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

}