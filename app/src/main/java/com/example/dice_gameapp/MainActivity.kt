package com.example.dice_gameapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
class MainActivity : AppCompatActivity() {
    lateinit var rollBtn1:Button
    lateinit var rollBtn2:Button
    lateinit var diceImg1:ImageView
    lateinit var diceImg2:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollBtn1= findViewById(R.id.roll_btn1)
        rollBtn2= findViewById(R.id.roll_btn2)
        diceImg1= findViewById(R.id.dice_img1)
        diceImg2= findViewById(R.id.dice_img2)

        rollBtn1.setOnClickListener(){
            var randomNum:Int = (1..6).random()
            var image = when(randomNum){
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                else -> R.drawable.dice6
            }
            diceImg1.setImageResource(image)
        }

        rollBtn2.setOnClickListener(){
            var randomNum:Int = (1..6).random()
            var image = when(randomNum){
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                else -> R.drawable.dice6
            }
            diceImg2.setImageResource(image)
        }
    }
}
