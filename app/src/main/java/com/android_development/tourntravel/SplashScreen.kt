package com.android_development.tourntravel

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android_development.tourntravel.databinding.ActivitySplashScreenBinding


class SplashScreen : AppCompatActivity() {

    private lateinit var binding :ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)

        binding= ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            txtView2.setOnClickListener {
                startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            }
        }

    }
}

