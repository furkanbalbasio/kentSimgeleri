package com.balbasio.kentsimgeleri

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.balbasio.kentsimgeleri.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val landmark = intent.getSerializableExtra("landmark") as Landmark
        binding.nameText.text =landmark.name
        binding.countryText.text = landmark.country
        binding.imageView.setImageResource(landmark.image)


    }
}