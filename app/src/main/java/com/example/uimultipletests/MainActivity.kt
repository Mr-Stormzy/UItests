package com.example.uimultipletests

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var textview:TextView
    lateinit var btnWeb:Button
    lateinit var btnCalc:Button
    lateinit var btnPopup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview = findViewById(R.id.txtview)
        btnWeb = findViewById(R.id.homebtn)
        btnCalc = findViewById(R.id.btnadd)
        btnPopup = findViewById(R.id.exitbtn)

        btnWeb.setOnClickListener {
            var move = Intent(this, WebsiteActivity::class.java)
            startActivity(move)
        }
        btnCalc.setOnClickListener {
            var calc = Intent(this, CalculatorActivity:: class.java)
            startActivity(calc)
        }
        btnPopup.setOnClickListener {
            var alert = AlertDialog.Builder(this)
            alert.setTitle("Exiting App")
            alert.setMessage("Are you sure you want to exit?")
            alert.setNegativeButton("No", null)
            alert.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                finish()
            })
            alert.create().show()
        }
    }
}