package com.example.uas_kelompok4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class WisataBali : AppCompatActivity() {
    var listView: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata_bali)
        listView = findViewById<View>(R.id.list) as ListView
        val values = arrayOf(
            "Pura Tanah Lot", "Pantai Kuta",
            "Pura Uluwatu", "Pura Ulun Danu Beratan Bedugul", "Bali Safari Marine Park",
            "Desa Penglipuran", "Air Terjun Sekumpul", "Garuda Wisnu Kencana"
        )
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, android.R.id.text1, values
        )
        listView!!.adapter = adapter
        listView!!.onItemClickListener =
            OnItemClickListener { parent, view, position, id ->
                if (position == 0) {
                    val myIntent = Intent(view.context, PuraTanahLot::class.java)
                    startActivityForResult(myIntent, 0)
                }
            }
    }
}