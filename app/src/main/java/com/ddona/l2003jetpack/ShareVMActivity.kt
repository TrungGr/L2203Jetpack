package com.ddona.l2003jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ddona.l2003jetpack.adapter.DataPagerAdapter
import com.ddona.l2003jetpack.databinding.ShareVmactivityBinding
import com.google.android.material.tabs.TabLayoutMediator

class ShareVMActivity : AppCompatActivity() {
    private lateinit var binding: ShareVmactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ShareVmactivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.vpShare.adapter = DataPagerAdapter(this)
        val tabTitles = arrayOf("One", "Two")
        TabLayoutMediator(binding.tabMain, binding.vpShare) {
            tab, position -> tab.text = tabTitles[position]
        }.attach()
    }
}