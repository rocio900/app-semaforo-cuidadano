package com.example.semaforo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGuest = findViewById<Button>(R.id.btnGuest)
        val btnAdmin = findViewById<Button>(R.id.btnAdmin)

        btnGuest.setOnClickListener {
            // Abre la actividad de invitado
            val intent = Intent(this@MainActivity, GuestActivity::class.java)
            startActivity(intent)
        }

        btnAdmin.setOnClickListener {
            // Abre la actividad de administrador
            val intent = Intent(this@MainActivity, AdminActivity::class.java)
            startActivity(intent)
        }
    }
}