package com.example.taskfive

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var ageperon:TextInputEditText
    lateinit var button:Button
    lateinit var birthtext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ageperon=findViewById(R.id.age)
        button=findViewById(R.id.btn)
        birthtext=findViewById(R.id.txtbirth)
        button.setOnClickListener {
           calBirth()
        }


    }
    fun calBirth(){
        var birth=2024- Integer.parseInt(ageperon.text.toString())
        birthtext.text=birth.toString()
    }
}