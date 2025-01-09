package com.example.task_02

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DashBoardActivity : AppCompatActivity() {
    val TAG="Details Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.dashboard)

        supportFragmentManager.beginTransaction().add(R.id.frame_layout,BlankFragment()).commit()
        val listview=findViewById<ListView>(R.id.list_view)

        val data= arrayOf(
            "Salaar",
            "Pushpa2",
            "Devera",
            "Kalki",
            "GameChanger",
            "KGF2",
            "KGF",
            "OG",
            "DakkuMaharaj",
            "Sankranthi",
            "Stree",
            "Stree2",

            )
        val apdater=ArrayAdapter(this,android.R.layout.simple_list_item_1,data)
        listview.adapter=apdater

        listview.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this,Detail_Activity::class.java)
            intent.putExtra("ITEM_Text", data[i] )
            startActivity(intent)

        }
    }
}
