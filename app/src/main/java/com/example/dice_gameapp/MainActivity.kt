package com.example.dice_gameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var rollBtn:Button
    lateinit var diceImg:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollBtn=findViewById(R.id.roll_btn)
        diceImg= findViewById(R.id.dice_img)
        rollBtn.setOnClickListener(){
            var randomNum:Int = (1..6).random()
            var image = when(randomNum){
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                else -> R.drawable.dice6
            }
            diceImg.setImageResource(image)
        }
    }
}
