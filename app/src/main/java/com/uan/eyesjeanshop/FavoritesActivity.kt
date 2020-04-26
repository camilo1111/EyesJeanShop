package com.uan.eyesjeanshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_favorites.*

class FavoritesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)

        ListViewFavPro.setOnItemClickListener { _, item, _, _ ->
            val text = item as TextView

            when(text.text.toString()){

                "Producto 1"-> {val started = Intent(this, DetailProductActivity::class.java)
                    startActivity(started)
                }
                "Producto 4"-> {val started = Intent(this, DetailProductActivity::class.java)
                    startActivity(started)
                }
                "Producto 5"-> {val started = Intent(this, DetailProductActivity::class.java)
                    startActivity(started)
                }
                "Producto 6"-> {val started = Intent(this, DetailProductActivity::class.java)
                    startActivity(started)
                }
                "Producto 5"-> {val started = Intent(this, DetailProductActivity::class.java)
                    startActivity(started)
                }
                "Producto 6"-> {val started = Intent(this, DetailProductActivity::class.java)
                    startActivity(started)
                }
            }
        }
    }
}
