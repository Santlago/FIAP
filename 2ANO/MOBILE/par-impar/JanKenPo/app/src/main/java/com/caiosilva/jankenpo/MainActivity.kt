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


        var opcaoSelecionada = ""
        var numeroSelecionado = ""

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonViewPar.setOnClickListener {
            println("Par")
            opcaoSelecionada = "Par"
            val result = chooseWinner(numeroSelecionado, opcaoSelecionada)
            numeroSelecionado = result.first
            opcaoSelecionada = result.second
        }
        binding.buttonViewImpar.setOnClickListener {
            println("Impar")
            opcaoSelecionada = "Impar"
            val result = chooseWinner(numeroSelecionado, opcaoSelecionada)
            numeroSelecionado = result.first
            opcaoSelecionada = result.second
        }

        binding.textView1.setOnClickListener {
            println("Número 1")
            numeroSelecionado = "1"
            val result = chooseWinner(numeroSelecionado, opcaoSelecionada)
            numeroSelecionado = result.first
            opcaoSelecionada = result.second
//            Toast.makeText(this, chooseWinner(0, onOptionSelected()), Toast.LENGTH_LONG).show()
        }

        binding.textView2.setOnClickListener {
            println("Número 2")
            numeroSelecionado = "2"
            val result = chooseWinner(numeroSelecionado, opcaoSelecionada)
            numeroSelecionado = result.first
            opcaoSelecionada = result.second
//            Toast.makeText(this, chooseWinner(1, onOptionSelected()), Toast.LENGTH_LONG).show()
        }

        binding.textView3.setOnClickListener {
            println("Número 3")
            numeroSelecionado = "3"
            val result = chooseWinner(numeroSelecionado, opcaoSelecionada)
            numeroSelecionado = result.first
            opcaoSelecionada = result.second
//            Toast.makeText(this, chooseWinner(2, onOptionSelected()), Toast.LENGTH_LONG).show()
        }

        binding.textView4.setOnClickListener {
            println("Número 4")
            numeroSelecionado = "4"
            val result = chooseWinner(numeroSelecionado, opcaoSelecionada)
            numeroSelecionado = result.first
            opcaoSelecionada = result.second
//            Toast.makeText(this, chooseWinner(3, onOptionSelected()), Toast.LENGTH_LONG).show()
        }

        binding.textView5.setOnClickListener {
            println("Número 5")
            numeroSelecionado = "5"
            val result = chooseWinner(numeroSelecionado, opcaoSelecionada)
            numeroSelecionado = result.first
            opcaoSelecionada = result.second
//            Toast.makeText(this, chooseWinner(4, onOptionSelected()), Toast.LENGTH_LONG).show()
        }

    }

    fun chooseWinner(numeroSelecionado: String, opcaoSelecionada: String): Pair<String, String> {
        if (numeroSelecionado != "" && opcaoSelecionada != "") {
            val sistema = onOptionSelected() // Assuming this function returns the system's choice
            val sistemaInt = sistema.toInt()
            val numeroSelecionadoInt = numeroSelecionado.toInt()

            val resultado = if ((sistemaInt + numeroSelecionadoInt) % 2 == 0 && opcaoSelecionada == "Par" ||
                (sistemaInt + numeroSelecionadoInt) % 2 == 1 && opcaoSelecionada == "Impar") {
                "Você ganhou!"
            } else {
                "Você perdeu!"
            }

            Toast.makeText(this, resultado, Toast.LENGTH_LONG).show()
            return Pair("", "")
        }
        return Pair(numeroSelecionado, opcaoSelecionada)
    }

    private fun onOptionSelected(): String {
        val appChoice: Int = Random.nextInt(4)
        println(appChoice)
        binding.textViewAppChoice.text = options[appChoice]
        return options[appChoice]
    }

}
