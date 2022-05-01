package br.com.ioasys.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<View>(R.id.button)
        button.setOnClickListener { rollDice() }
        rollDice()
    }

    private fun rollDice(){
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImg: ImageView = findViewById(R.id.imageView)
        val rollImg = when(diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else ->  R.drawable.dice_6
        }
        diceImg.setImageResource(rollImg)
        diceImg.contentDescription = diceRoll.toString()
    }
}

class Dice(private val numSides: Int){
    fun roll(): Int{
        return (1..numSides).random()
    }
}