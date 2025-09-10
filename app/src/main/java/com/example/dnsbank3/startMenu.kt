package com.example.dnsbank3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class startMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val centralRegion : Button = findViewById(R.id.buttonCentralRegion)
        val northEastRegion : Button = findViewById(R.id.buttonNortheastRegion)
        val northRegion : Button = findViewById(R.id.buttonNorthRegion)
        val southernRegion : Button = findViewById(R.id.buttonSouthRegion)

        centralRegion.setOnClickListener {
            val intent = Intent(this, com.example.dnsbank3.centralRegion::class.java)
            startActivity(intent)
            Log.d("startMenu", "Button Clicked, Starting centralRegion")
        }
        northEastRegion.setOnClickListener {
            val intent = Intent(this, com.example.dnsbank3.northEastRegion::class.java)
            startActivity(intent)
            Log.d("startMenu", "Button Clicked, Starting northEastRegion")
        }
        northRegion.setOnClickListener {
            val intent = Intent(this, com.example.dnsbank3.northRegion::class.java)
            startActivity(intent)
            Log.d("startMenu", "Button Clicked, Starting northRegion")
        }
        southernRegion.setOnClickListener {
            val intent = Intent(this, com.example.dnsbank3.southernRegion::class.java)
            startActivity(intent)
            Log.d("startMenu", "Button Clicked, Starting southernRegion")
        }






    }
}