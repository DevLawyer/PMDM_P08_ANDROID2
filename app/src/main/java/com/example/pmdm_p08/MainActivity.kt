package com.example.pmdm_p08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    var value1: String = ""
    var value2 = 0
    var value3: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCerrar:Button = findViewById(R.id.btnClose)
        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)
        val activity1 = Intent(this, Activity1::class.java)
        val activity2 = Intent(this, Activity2::class.java)

        btnCerrar.setOnClickListener {
            finish()
            exitProcess(0)
        }

        btn1.setOnClickListener {
            startActivityForResult(activity1, 1)
        }

        btn2.setOnClickListener {
            startActivityForResult(activity2, 2)
        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        var textView:TextView = findViewById(R.id.textViewMain)

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                value1 = data?.getExtras()?.getCharSequence("value1") as String
                textView.setText(value1)
            }
        }

        if (requestCode == 2){
            if (resultCode == RESULT_OK) {
                value2 = data?.getIntExtra("value2", 0)!!
                textView.setText(value2.toString())
            }
        }

        if (requestCode == 3){
            if (resultCode == RESULT_OK) {
                value3 = data?.getExtras()?.getCharSequence("value3") as String
                textView.setText(value3)
            }
        }
    }

    fun btn3Action(view: View){
        val activity3 = Intent(this, Activity3::class.java)
        startActivityForResult(activity3, 3)
    }

    fun btn4Action(view:View){
        val activity4 = Intent(this, Activity4::class.java)
        activity4.putExtra("value1", value1)
        activity4.putExtra("value2", value2)
        activity4.putExtra("value3", value3)
        startActivity(activity4)
    }
}