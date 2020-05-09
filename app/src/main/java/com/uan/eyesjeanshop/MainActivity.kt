package com.uan.eyesjeanshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listViewFilters.setOnItemClickListener { _, item, _, i_ ->
            val text = item as TextView

            when (text.text.toString()) {

                "All list" -> {
                    val started = Intent(this, ListProductActivity::class.java)
                    startActivity(started)
                }
                "Colors" -> {
                    val started = Intent(this, ListProductActivity::class.java)
                    startActivity(started)
                }
                "Category" -> {
                    val started = Intent(this, ListProductActivity::class.java)
                    startActivity(started)

                }
            }
        }

            buttonWs.setOnClickListener {
                val continueButton = Intent(this, WaitingSectionActivity::class.java)
                startActivity(continueButton)

            }

            buttonSH.setOnClickListener {
                val continueButton = Intent(this, HistoryActivity::class.java)
                startActivity(continueButton)

            }

            buttonFav.setOnClickListener {
                val continueButton = Intent(this, FavoritesActivity::class.java)
                startActivity(continueButton)

            }

            imageButtonSearch.setOnClickListener {
                val continueButton = Intent(this, ListProductActivity::class.java)
                startActivity(continueButton)
            }


        }
    }

