package com.ddona.l2003jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ddona.l2003jetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnUp.setOnClickListener {
            upNumber()
        }
    }

    private fun upNumber() {
        number = number.plus(1)
        binding.tvNumber.text = number.toString()
    }
}