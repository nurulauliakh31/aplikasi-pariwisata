package com.example.uas_kelompok4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment


public class HalamanUtama : AppCompatActivity() {

    override protected open fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)
        supportActionBar?.hide()

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomnavigation)
        bottomNav.setOnNavigationItemSelectedListener(navListener)

        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, HomeFragment(
                null
            )
            ).commit()
        }
    }

    private val navListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.Home -> selectedFragment = HomeFragment(null)
                R.id.List -> selectedFragment = ListData()
                R.id.Tambah -> selectedFragment = TambahData()
                R.id.Akun -> selectedFragment = Akun()
            }
            if (selectedFragment != null) {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, selectedFragment).commit()
            }
            true
        }

}
