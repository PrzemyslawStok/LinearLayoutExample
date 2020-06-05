package com.e.linearlayoutexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.setText("Kolejny napis")

        text1.setBackgroundColor(Color.WHITE)
        text2.setBackgroundColor(Color.CYAN)

        var kolory = true
        var liczbaKlikniec = 1

        button0.setOnClickListener {
            if(kolory) {
                text1.setBackgroundColor(Color.CYAN)
                text2.setBackgroundColor(Color.WHITE)
            }else{
                text1.setBackgroundColor(Color.WHITE)
                text2.setBackgroundColor(Color.CYAN)
            }

            kolory = !kolory
        }
    }
}
