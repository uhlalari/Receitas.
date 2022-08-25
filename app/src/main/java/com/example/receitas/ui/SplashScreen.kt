package com.example.receitas.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.receitas.R
import com.example.receitas.databinding.SplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: SplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.apply { hide() }

        Glide.with(binding.Gif)
            .load("https://firebasestorage.googleapis.com/v0/b/app-de-receita-9c8c6.appspot.com/o/gif_splash.gif?alt=media&token=0dbdfcec-8399-48ce-ab0a-5c4ddfc57f93")
            .into(binding.Gif)
        binding.Gif.alpha = 1f

        binding.Gif.animate().setDuration(2500).alpha(1f).withEndAction {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}