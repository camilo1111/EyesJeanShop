package com.uan.eyesjeanshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detail_product.*


class DetailProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_product)



        buttonFav.setOnClickListener{
            val continueButton = Intent (this, MainActivity::class.java)
            finish()
            startActivity(continueButton)
        }

        buttonBuy.setOnClickListener{
            val continueButton = Intent (this, MainActivity::class.java)
            finish()
            startActivity(continueButton)
        }
        buttonCal.setOnClickListener {
            textViewValue.setText("20.000$")

        }
    }
}
