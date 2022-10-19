package com.example.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var chkAndro: CheckBox = findViewById<CheckBox>(R.id.chkAndro)
        var chkMicro: CheckBox = findViewById<CheckBox>(R.id.chkMicro)
        var btnAffich: Button = findViewById<Button>(R.id.btnAffich)
        var radSpecialityType: RadioGroup = findViewById<RadioGroup>(R.id.radSpecialityType)
        var radDSI: RadioButton= findViewById<RadioButton>(R.id.radDSI)
        var radRSI: RadioButton= findViewById<RadioButton>(R.id.radRSI)
        var radSEM: RadioButton= findViewById<RadioButton>(R.id.radSEM)
        btnAffich.setOnClickListener{
            var msg = ""
            val option = "club "
            if (chkAndro.isChecked) msg = option + "Androide "
            if (chkMicro.isChecked) msg = msg + "Microsft  "
            val radioId = radSpecialityType.checkedRadioButtonId
            if (radSEM.id == radioId) msg = msg + "Spécialité SEM"
            if (radRSI.isChecked) msg = msg + "Spécialité RSI"
            if (radDSI.isChecked) msg = msg + "Spécialité DSI"
            Toast.makeText(applicationContext, msg, Toast.LENGTH_LONG).show()

        }


    }
}