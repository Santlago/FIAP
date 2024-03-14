package com.caiosilva.jankenpo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.caiosilva.jankenpo.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private val options = listOf("1", "2", "3", "4", "5")
    private val options2 = listOf("Par", "Impar")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView1.setOnClickListener {
            println("Número 1")
            Toast.makeText(this, chooseWinner(0, onOptionSelected()), Toast.LENGTH_LONG).show()
        }

        binding.textView2.setOnClickListener {
            println("Número 2")
            Toast.makeText(this, chooseWinner(1, onOptionSelected()), Toast.LENGTH_LONG).show()
        }

        binding.textView3.setOnClickListener {
            println("cNúmero 3")
            Toast.makeText(this, chooseWinner(2, onOptionSelected()), Toast.LENGTH_LONG).show()
        }

        binding.textView4.setOnClickListener {
            println("Número 4")
            Toast.makeText(this, chooseWinner(2, onOptionSelected()), Toast.LENGTH_LONG).show()
        }

        binding.textView5.setOnClickListener {
            println("Número 5")
            Toast.makeText(this, chooseWinner(2, onOptionSelected()), Toast.LENGTH_LONG).show()
        }
    }

    private fun onOptionSelected(): Int {
        val appChoice: Int = Random.nextInt(4)
        binding.textViewAppChoice.setText(appChoice)

        return appChoice
    }

    private fun chooseWinner(playerChoice: Int, appChoice: Int): String {
        val result = listOf(
            listOf(
                getString(R.string.players_draw, options[playerChoice]),
                getString(R.string.player_wins, options[playerChoice]),
                getString(R.string.player_loses, options[playerChoice])
            ),
            listOf(
                getString(R.string.player_loses, options[playerChoice]),
                getString(R.string.players_draw, options[playerChoice]),
                getString(R.string.player_wins, options[playerChoice])
            ),
            listOf(
                getString(R.string.player_wins, options[playerChoice]),
                getString(R.string.player_loses, options[playerChoice]),
                getString(R.string.players_draw, options[playerChoice])
            )
        )

        return result[playerChoice][appChoice]
    }
}
