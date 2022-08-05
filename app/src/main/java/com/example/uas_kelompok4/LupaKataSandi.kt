package com.example.uas_kelompok4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LupaKataSandi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_kata_sandi)
        supportActionBar?.hide()

        var btnUbahsandi: Button = findViewById(R.id.button_ubah_katasandi);
        btnUbahsandi.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}