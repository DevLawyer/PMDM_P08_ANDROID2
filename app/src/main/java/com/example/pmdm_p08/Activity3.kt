package com.example.pmdm_p08

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.Switch

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val btnBack: Button = findViewById(R.id.btnBack3)
        val switch: Switch = findViewById(R.id.switch1)
        btnBack.setOnClickListener {
            var texto = ""
            if(switch.isChecked) {
                texto = "Activo"
            } else {
                texto = "Inactivo"
            }
            val home = Intent()
            home.putExtra("value3", texto)
            setResult(Activity.RESULT_OK, home)
            finish()
        }
    }
}