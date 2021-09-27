package com.example.week2_day2_2in1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var clMain: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val phraseButton = findViewById<Button>(R.id.phrase)
        val numbersButton = findViewById<Button>(R.id.numbers)
        clMain = findViewById<ConstraintLayout>(R.id.clMain)


        phraseButton.setOnClickListener{
            startActivity(Intent(this, PhraseGame::class.java))
        }

        numbersButton.setOnClickListener{
            startActivity(Intent(this, NumbersGame::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.numbers_game -> {
                startActivity(Intent(this, NumbersGame::class.java))
                return true
            }
            R.id.phrase_game -> {
                startActivity(Intent(this, PhraseGame::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}