package com.ddona.l2003jetpack.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ddona.l2003jetpack.fragment.OneFragment
import com.ddona.l2003jetpack.fragment.TwoFragment

class DataPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> OneFragment()
            1 -> TwoFragment()
            else -> throw IllegalArgumentException("Unknown fragment")
        }
    }
}