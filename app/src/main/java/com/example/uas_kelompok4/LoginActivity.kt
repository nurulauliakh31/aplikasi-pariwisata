package com.example.uas_kelompok4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.uas_kelompok4.Daftar
import com.example.uas_kelompok4.HalamanUtama
import com.example.uas_kelompok4.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        var btnLogin: Button = findViewById(R.id.button_login);
        btnLogin.setOnClickListener {
            val intent = Intent(this, HalamanUtama::class.java)
            startActivity(intent)
        }

        var btnDaftar: Button = findViewById(R.id.button_daftar);
        btnDaftar.setOnClickListener {
            val intent = Intent(this, Daftar::class.java)
            startActivity(intent)
        }

    }
}