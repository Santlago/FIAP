package com.caiosilva.jankenpo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.caiosilva.jankenpo.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private val listOfImages = arrayListOf(R.drawable.papel, R.drawable.pedra, R.drawable.tesoura)
    private val options = listOf("papel", "pedra", "tesoura")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewPapel.setOnClickListener {
            println("Clicou no papel")
            Toast.makeText(this, chooseWinner(0, onOptionSelected()), Toast.LENGTH_LONG).show()
        }
        binding.imageViewPedra.setOnClickListener {
            println("Clicou na pedra")
            Toast.makeText(this, chooseWinner(1, onOptionSelected()), Toast.LENGTH_LONG).show()
        }
        binding.imageViewTesoura.setOnClickListener {
            println("Clicou na tesoura")
            Toast.makeText(this, chooseWinner(2, onOptionSelected()), Toast.LENGTH_LONG).show()
        }
    }

    private fun onOptionSelected(): Int {
        val appChoice: Int = Random.nextInt(3) //vai escolher numero de 0-2 (0, 1, 2)
        binding.imageViewAppChoice.setImageDrawable(getDrawable(listOfImages[appChoice]))
        println(appChoice)
        return appChoice
    }

    private fun chooseWinner(playerChoice: Int, appChoice: Int): String {
        val result = listOf(
            listOf(
                getString(R.string.player_draw, options[playerChoice]),
                getString(R.string.player_wins, options[playerChoice]),
                getString(R.string.player_looses, options[playerChoice])
            ),
            listOf(
                getString(R.string.player_looses, options[playerChoice]),
                getString(R.string.player_draw, options[playerChoice]),
                getString(R.string.player_wins, options[playerChoice])
            ),
            listOf(
                getString(R.string.player_wins, options[playerChoice]),
                getString(R.string.player_looses, options[playerChoice]),
                getString(R.string.player_draw, options[playerChoice])
            )
        )

        println(result[playerChoice][appChoice])
        return result[playerChoice][appChoice]
    }
}
