package com.example.pmdm_p08

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val btnBack: Button = findViewById(R.id.btnBack4)
        val textView1: TextView = findViewById(R.id.textValue1)
        val textView2: TextView = findViewById(R.id.textValue2)
        val textView3: TextView = findViewById(R.id.textValue3)

        val value1 = getIntent().getExtras()?.getCharSequence("value1") as String
        val value2 = getIntent().getIntExtra("value2", 0)!!
        val value3 = getIntent().getExtras()?.getCharSequence("value3") as String

        textView1.setText(value1)
        textView2.setText(value2.toString())
        textView3.setText(value3)

        btnBack.setOnClickListener {
            finish()
        }
    }
}