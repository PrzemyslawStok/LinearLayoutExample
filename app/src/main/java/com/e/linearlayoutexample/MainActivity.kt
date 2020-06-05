package com.e.linearlayoutexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var liczbaKlikniec = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.setBackgroundColor(Color.WHITE)
        text2.setBackgroundColor(Color.CYAN)

        var kolory = true

        wyswietl()

        button0.setOnClickListener {

            liczbaKlikniec++
            wyswietl()

            if(kolory) {
                text1.setBackgroundColor(Color.CYAN)
                text2.setBackgroundColor(Color.WHITE)
            }else{
                text1.setBackgroundColor(Color.WHITE)
                text2.setBackgroundColor(Color.CYAN)
            }

            kolory = !kolory
        }

        resetButton.setOnClickListener {
            liczbaKlikniec = 0;

            wyswietl()
        }
    }

    fun wyswietl(){
        text1.setText("Liczba kliknięć ${liczbaKlikniec}")
        text2.setText("Liczba kliknięć ${liczbaKlikniec+1}")
    }
}
