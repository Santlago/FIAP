//    Breno Lemes Santiago RM: 552270
//    Felipe Guedes Gonçalves RM: 550906
//    Luiz Fellipe Soares de Sousa Lucena RM: 551365
//    Nina Rebello Francisco RM: 99509
//    Vitória Maria de Camargo RM: 552344

package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.calculadora.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

 class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculo = binding.calculo

        binding.um.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }

        binding.dois.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }

        binding.tres.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }

        binding.quatro.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }

        binding.cinco.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }

        binding.seis.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }

        binding.sete.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }

        binding.oito.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }

        binding.nove.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }


        binding.divisao.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }

        binding.multiplicacao.setOnClickListener {
            calculo.text = "${calculo.text}*"
        }

        binding.subtracao.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }

        binding.adicao.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }

        binding.virgula.setOnClickListener {
            calculo.text = "${calculo.text}."
        }

        binding.zero.setOnClickListener {
            calculo.text = "${calculo.text}0"
        }

        binding.ce.setOnClickListener {
            calculo.text = ""
            binding.resultado.text = ""
        }

        binding.porcentagem.setOnClickListener {
            calculo.text = "${calculo.text}%"
        }

        binding.igual.setOnClickListener {
            val resultadoCalculado = Expression(calculo.text.toString()).calculate()

            if(resultadoCalculado.isNaN()){
                binding.resultado.text = "Erro"
            } else {
                binding.resultado.text = resultadoCalculado.toString()
            }

        }

        binding.sinal.setOnClickListener {
            val expressao = calculo.text.toString()
            if (expressao.isNotEmpty()) {
                calculo.text = if (expressao[0] == '-') {
                    expressao.substring(1)
                } else {
                    "-$expressao"
                }
            }
        }

    }
}