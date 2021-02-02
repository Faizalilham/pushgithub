package com.example.tugas7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        val first1 = intent.getStringExtra("first")
        val second1= intent.getStringExtra("second")
        val full = "My name is $first1 $second1"
        hasil.text = full

        buton3.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
            finish()
        }

    }
}