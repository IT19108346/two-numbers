package com.example.twofloat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edtNumber1:EditText
    lateinit var edtNumber2:EditText
    lateinit var resultTex : TextView
    lateinit var add : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber1 = findViewById(R.id.etNumber1)
        edtNumber2 = findViewById(R.id.etNumber2)
        resultTex = findViewById(R.id.txResult)
        add = findViewById(R.id.btnAdd)

        add.setOnClickListener{
            val n1 = edtNumber1.text.toString().toDouble()
            val n2 =edtNumber2.text.toString().toDouble()
            var result =  n1 +n2
             resultTex.text = result.toString()
        }

    }
}