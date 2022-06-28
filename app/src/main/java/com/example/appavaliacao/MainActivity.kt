package com.example.appavaliacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.annotation.IntegerRes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
    }

    private fun rollDice() {
            val randomInt = (1..6).random()
            val diceImage: ImageView = findViewById(R.id.dice_image)

            val txt: EditText = findViewById(R.id.num)
            val numInt = Integer.parseInt((txt.text).toString())


            val drawableResource = when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage.setImageResource(drawableResource)

            if (numInt == randomInt) {
                Toast.makeText(this, "You win!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "You lose!", Toast.LENGTH_SHORT).show()
            }
    }
}