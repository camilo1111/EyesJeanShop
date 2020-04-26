package com.uan.eyesjeanshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_history.*

class HistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        ListViewHistory.setOnItemClickListener { _, item, _, _ ->
            val text = item as TextView

            when(text.text.toString()){

                "Buy 1"-> {val started = Intent(this, DetailBuyActivity::class.java)
                    startActivity(started)
                }
                "Buy 2"-> {val started = Intent(this, DetailBuyActivity::class.java)
                    startActivity(started)
                }
                "Buy 3"-> {val started = Intent(this, DetailBuyActivity::class.java)
                    startActivity(started)
                }
                "Buy 4"-> {val started = Intent(this, DetailBuyActivity::class.java)
                    startActivity(started)
                }
                "Buy 5"-> {val started = Intent(this, DetailBuyActivity::class.java)
                    startActivity(started)
                }
                "Buy 6"-> {val started = Intent(this, DetailBuyActivity::class.java)
                    startActivity(started)
                }
            }
        }

    }
}
