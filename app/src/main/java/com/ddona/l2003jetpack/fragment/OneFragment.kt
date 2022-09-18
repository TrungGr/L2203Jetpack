package com.ddona.l2003jetpack.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.ddona.l2003jetpack.databinding.DataFragmentBinding
import com.ddona.l2003jetpack.vm.DataViewModel

class OneFragment : Fragment() {
    private lateinit var binding: DataFragmentBinding

    //    private val viewModel: DataViewModel by viewModels()
    private lateinit var viewModel: DataViewModel //instance  DataViewModel 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataFragmentBinding.inflate(inflater, container, false)
//        viewModel = ViewModelProvider(this)[DataViewModel::class.java]
        viewModel = ViewModelProvider(requireActivity())[DataViewModel::class.java]
        viewModel.number.observe(viewLifecycleOwner) {
            binding.tvNumber.text = it.toString()
        }
        binding.btnUp.setOnClickListener {
            viewModel.updateNumber()
        }
        return binding.root
    }

}