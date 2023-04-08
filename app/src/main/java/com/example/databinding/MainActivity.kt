package com.example.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listProduct = arrayListOf(
            ListProduct("Sabun","20000","12",R.drawable.ic_android_black_24dp),
            ListProduct("Sampo","2000","29",R.drawable.ic_launcher_foreground),
            ListProduct("Fanta","5000","29",R.drawable.ic_android_black_24dp),
            ListProduct("Chitato","10000","30",R.drawable.ic_launcher_foreground),
            ListProduct("Kecap","3000","67",R.drawable.ic_android_black_24dp)
        )

        var adapterProduct = ProductAdapter(listProduct)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.rvProduct.layoutManager = lm
        binding.rvProduct.adapter = adapterProduct
        

    }
}