package com.uan.eyesjeanshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_waiting_section.*

class WaitingSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waiting_section)

        buttonBuy.setOnClickListener {
            val continueButton = Intent (this, MainActivity::class.java)
            finish()
            startActivity(continueButton)
        }


    }
}
