package com.prueba.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val Boton : Button = findViewById(R.id.Boton)

        Boton.setOnClickListener(){
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}