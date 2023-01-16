package com.example.diceroll

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.button1)
        rollButton.setOnClickListener {
            // val show = Toast.makeText(this,"Button clicked ",Toast.LENGTH_SHORT).show()
            rollDiceone()
        }

        val rollButton2 = findViewById<Button>(R.id.button2)
        rollButton2.setOnClickListener {
            // val show = Toast.makeText(this,"Button clicked ",Toast.LENGTH_SHORT).show()
            rollDiceTwo()
        }




    }

    private fun rollDiceone() {
        val diceObject = Diceone(6)
        val roll = diceObject.roll()
        val displayResult: TextView = findViewById(R.id.textView1)
        displayResult.text = roll.toString()
    }

    private fun rollDiceTwo() {
        val diceobject = DiceTwo(19)
        val roll = diceobject.roll()
        val displayresult :TextView = findViewById(R.id.textView2)
        displayresult.text = roll.toString()
    }
}

class Diceone(private val numberSides: Int) {
    fun roll(): Int {
        return (1..numberSides).random()
    }
}

class DiceTwo (private val numberSides: Int) {
    fun roll(): Int{
        return (1..numberSides).random()
    }
}