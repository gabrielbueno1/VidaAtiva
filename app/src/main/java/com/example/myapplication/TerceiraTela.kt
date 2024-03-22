package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TerceiraTela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira_tela)

        val mainLayout = findViewById<View>(R.id.main)

        findViewById<View>(R.id.botao_voltar).setOnClickListener {
            val intent = Intent(this, SecundaTela::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.botaoAvancar).setOnClickListener {
            val intent = Intent(this, QuartaTela::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(mainLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
