package com.example.tugas7

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        button2.setOnClickListener {
            val github = Intent(Intent.ACTION_VIEW)
            github.setData(Uri.parse("https://github.com/Faizalilham"))
            startActivity(github)

        }
        button3.setOnClickListener {
            startActivity(Intent(this,finish()::class.java))
            finish()
        }
        button4.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
            finish()
        }

    }
}