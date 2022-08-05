package com.example.uas_kelompok4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
        supportActionBar?.hide()

        var btnDaftar: Button = findViewById(R.id.button_daftar);
        btnDaftar.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        var btnLogin: Button = findViewById(R.id.button_login);
        btnLogin.setOnClickListener {
            val intent = Intent(this, HalamanUtama::class.java)
            startActivity(intent)
        }
    }
}