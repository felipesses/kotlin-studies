package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btn_roll)
        val btnCountUp: Button = findViewById(R.id.btn_count_up)

        btnRoll.setOnClickListener{
            rollDice()
        }

        btnCountUp.setOnClickListener{
            countUp()
        }

    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            var number: Int = resultText.text.toString().toInt()
            if (number < 6) {
                number++
                resultText.text = number.toString()
            }
        }

    }
}