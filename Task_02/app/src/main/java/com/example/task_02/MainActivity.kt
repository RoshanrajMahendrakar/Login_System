package com.example.task_02

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG="main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.btn)
        val usernametxt=findViewById<EditText>(R.id.usertxt)
        val userpassword=findViewById<EditText>(R.id.userpwd)

        btn.setOnClickListener {
            val getusername=usernametxt.getText().toString()
            val getuserpwd=userpassword.getText().toString()
            if(getusername!="" && getuserpwd!="")
            {
                if(getusername=="Roshan" && getuserpwd=="Roshan")
                {
                    val intent=Intent(this,DashBoardActivity::class.java)
                    startActivity(intent)
                }
                else
                {
                    Toast.makeText(this, "Wrong credentials", Toast.LENGTH_SHORT).show()
                }

            }
            else
            {
                Toast.makeText(this, "Please enter details", Toast.LENGTH_SHORT).show()
            }

        }
        Log.e(TAG, "onCreate: ", )
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart: ", )
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: ", )
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: ", )
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop: ", )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: ", )
    }

}
