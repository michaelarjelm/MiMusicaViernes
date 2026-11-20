package com.example.mimusicaviernes

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun IngresarOnClick(view: View)
    {
        val edtCorreo=findViewById<EditText>(R.id.edtCorreo)
        val edtClave=findViewById<EditText>(R.id.edtClave)

        val correo = edtCorreo.text.toString()
        val clave = edtClave.text.toString()

        Toast.makeText(this,"Hola, $correo", Toast.LENGTH_LONG).show()

        val intent = Intent(this, ListaActivity::class.java)
        startActivity(intent)
    }

    fun txtRegistroOnClick(view: View)
    {
        val intent = Intent(this, RegistroActivity::class.java)
        startActivity(intent)
    }
}