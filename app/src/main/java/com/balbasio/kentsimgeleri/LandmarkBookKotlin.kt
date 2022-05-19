package com.balbasio.kentsimgeleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.balbasio.kentsimgeleri.databinding.ActivityLandmarkBookKotlinBinding
import com.balbasio.kentsimgeleri.databinding.ActivityMainBinding

class LandmarkBookKotlin : AppCompatActivity() {
    private lateinit var binding:LandmarkBookKotlin

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding =LandmarkBookKotlinBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)    }
}