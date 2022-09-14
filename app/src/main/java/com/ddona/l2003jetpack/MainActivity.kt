package com.ddona.l2003jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.ddona.l2003jetpack.databinding.ActivityMainBinding
import com.ddona.l2003jetpack.vm.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

//    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Cách khởi tạo
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.btnUp.setOnClickListener {
            viewModel.updateNumber()//2
//            upNumber()
        }

        viewModel.number.observe(this) {
            //lắng nghe
            binding.tvNumber.text = it.toString()//2
        }
    }

//    private fun upNumber() {
//        number = number.plus(1)
//        binding.tvNumber.text = number.toString()
//    }
}