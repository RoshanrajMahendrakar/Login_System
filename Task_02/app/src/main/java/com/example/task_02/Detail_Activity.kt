package com.example.task_02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Detail_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val circleView = findViewById<custom>(R.id.circleView)
        val Text = intent.getStringExtra("ITEM_Text")?:""
        circleView.setText(Text)
    }
}