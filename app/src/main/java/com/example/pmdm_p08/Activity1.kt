package com.example.pmdm_p08

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val btnBack:Button = findViewById(R.id.btnBack1)
        val editText:EditText = findViewById(R.id.editText)
        btnBack.setOnClickListener {
            val texto: String = editText.text.toString()
            val home = Intent()
            home.putExtra("value1", texto)
            setResult(Activity.RESULT_OK, home)
            finish()
        }
    }
}