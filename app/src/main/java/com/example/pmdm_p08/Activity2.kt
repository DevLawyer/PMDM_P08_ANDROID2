package com.example.pmdm_p08

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val btnBack: Button = findViewById(R.id.btnBack2)
        val seekBar: SeekBar = findViewById(R.id.seekBar)
        btnBack.setOnClickListener {
            val texto = seekBar.getProgress()
            val home = Intent()
            home.putExtra("value2", texto)
            setResult(Activity.RESULT_OK, home)
            finish()
        }
    }
}