package com.example.tugas7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        buton2.setOnClickListener {
            val awal = et.text.toString()
            val akhir = et2.text.toString()

                if(et.text.trim().isNotEmpty() || et2.text.trim().isNotEmpty()){
                    Toast.makeText(this, "Pengisian berhasil", Toast.LENGTH_SHORT).show()

                }else{
                    Toast.makeText(this, "File tidak boleh kosong ", Toast.LENGTH_SHORT).show()
                }
            Intent(Intent(this,MainActivity4::class.java)).also {
                it.putExtra("first",awal)
                it.putExtra("second",akhir)
                startActivity(it)
            }
        }

        buton4.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}