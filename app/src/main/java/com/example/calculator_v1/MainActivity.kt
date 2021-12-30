package com.example.calculator_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val e1=findViewById<EditText>(R.id.et1)
        val e2=findViewById<EditText>(R.id.et2)
        val tres=findViewById<TextView>(R.id.tview1)
        val add=findViewById<Button>(R.id.b1)
        val sub=findViewById<Button>(R.id.b2)
        val mul=findViewById<Button>(R.id.b4)
        val div=findViewById<Button>(R.id.b3)
        add.setOnClickListener(View.OnClickListener {
            val r1=(e1.text.toString().toFloat())+(e2.text.toString().toFloat())
            tres.text=r1.toString()
        })
        sub.setOnClickListener(View.OnClickListener {
            val r1=(e1.text.toString().toFloat())-(e2.text.toString().toFloat())
            tres.text=r1.toString()
        })
        mul.setOnClickListener(View.OnClickListener {
            val r1=(e1.text.toString().toFloat())*(e2.text.toString().toFloat())
            tres.text=r1.toString()
        })
        div.setOnClickListener(View.OnClickListener {
            val r1=(e1.text.toString().toFloat())/(e2.text.toString().toFloat())
            tres.text=r1.toString()
        })
    }



}