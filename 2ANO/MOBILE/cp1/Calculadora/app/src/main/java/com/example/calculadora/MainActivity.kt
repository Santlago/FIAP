 package com.example.calculadora

 import android.os.Bundle
 import android.widget.Button
 import android.widget.TextView
 import androidx.appcompat.app.AppCompatActivity
 import kotlin.math.absoluteValue

 class MainActivity : AppCompatActivity() {

     private lateinit var calculoTextView: TextView
     private lateinit var resultadoTextView: TextView
     private var numerosDigitados = ""

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         calculoTextView = findViewById(R.id.calculo)
         resultadoTextView = findViewById(R.id.resultado)

         // Definir listeners de clique para os botões numéricos
         val numeros = listOf(
             findViewById<Button>(R.id.um),
             findViewById<Button>(R.id.dois),
             findViewById<Button>(R.id.tres),
             findViewById<Button>(R.id.quatro),
             findViewById<Button>(R.id.cinco),
             findViewById<Button>(R.id.seis),
             findViewById<Button>(R.id.sete),
             findViewById<Button>(R.id.oito),
             findViewById<Button>(R.id.nove),
             findViewById<Button>(R.id.zero)
         )

         numeros.forEach { button ->
             button.setOnClickListener {
                 adicionarNumero(button.text.toString())
             }
         }

         // Definir listeners de clique para os botões de operadores
         val operadores = listOf(
             findViewById<Button>(R.id.adicao),
             findViewById<Button>(R.id.substracao),
             findViewById<Button>(R.id.multiplicacao),
             findViewById<Button>(R.id.divisao)
         )

         operadores.forEach { button ->
             button.setOnClickListener {
                 adicionarOperador(button.text.toString())
             }
         }

         // Definir listener de clique para o botão CE (limpar)
         findViewById<Button>(R.id.ce).setOnClickListener {
             limparExpressao()
         }

         // Definir listener de clique para o botão igual
         findViewById<Button>(R.id.igual).setOnClickListener {
             calcularResultado()
         }

         // Definir listener de clique para o botão de sinal positivo/negativo
         findViewById<Button>(R.id.sinal).setOnClickListener {
             inverterSinal()
         }

         // Definir listener de clique para o botão de porcentagem
         findViewById<Button>(R.id.porcentagem).setOnClickListener {
             calcularPorcentagem()
         }

         // Definir listener de clique para o botão de vírgula
         findViewById<Button>(R.id.virgula).setOnClickListener {
             adicionarVirgula()
         }
     }

     private fun adicionarNumero(numero: String) {
         numerosDigitados += numero
         calculoTextView.text = numerosDigitados
     }

     private fun adicionarOperador(operador: String) {
         if (numerosDigitados.isNotEmpty()) {
             numerosDigitados += operador
             calculoTextView.text = numerosDigitados
         }
     }

     private fun limparExpressao() {
         numerosDigitados = ""
         calculoTextView.text = ""
         resultadoTextView.text = ""
     }

     private fun calcularResultado() {
         try {
             val resultado = avaliarExpressao(numerosDigitados)
             resultadoTextView.text = resultado.toString()
         } catch (e: Exception) {
             resultadoTextView.text = "Erro"
         }
     }

     private fun inverterSinal() {
         if (numerosDigitados.isNotEmpty() && numerosDigitados.first() != '-') {
             numerosDigitados = "-$numerosDigitados"
         } else if (numerosDigitados.isNotEmpty() && numerosDigitados.first() == '-') {
             numerosDigitados = numerosDigitados.substring(1)
         }
         calculoTextView.text = numerosDigitados
     }

     private fun calcularPorcentagem() {
         if (numerosDigitados.isNotEmpty()) {
             val numero = numerosDigitados.toDouble()
             val porcentagem = numero / 100.0
             numerosDigitados = porcentagem.toString()
             calculoTextView.text = numerosDigitados
         }
     }

     private fun adicionarVirgula() {
         if (!numerosDigitados.contains(".")) {
             numerosDigitados += "."
             calculoTextView.text = numerosDigitados
         }
     }

     private fun avaliarExpressao(expressao: String): Double {
         val numeros = mutableListOf<Double>()
         val operadores = mutableListOf<Char>()
         var numero = StringBuilder()

         for (caractere in expressao) {
             if (caractere in '0'..'9' || caractere == '.') {
                 numero.append(caractere)
             } else {
                 if (numero.isNotEmpty()) {
                     numeros.add(numero.toString().toDouble())
                     numero = StringBuilder()
                 }
                 operadores.add(caractere)
             }
         }
         if (numero.isNotEmpty()) {
             numeros.add(numero.toString().toDouble())
         }

         calcularMultiplicacaoEDivisao(numeros, operadores)
         calcularSomaESubtracao(numeros, operadores)

         return numeros.first()
     }


     private fun calcularMultiplicacaoEDivisao(numeros: MutableList<Double>, operadores: MutableList<Char>) {
         calcularMultiplicacao(numeros, operadores)
         calcularDivisao(numeros, operadores)
     }

     private fun calcularMultiplicacao(numeros: MutableList<Double>, operadores: MutableList<Char>) {
         var indice = 0
         while (indice < operadores.size) {
             val op = operadores[indice]
             if (op == '*') {
                 val numero1 = numeros[indice]
                 val numero2 = numeros[indice + 1]
                 val resultado = numero1 * numero2
                 // Substituir o primeiro número pelo resultado da multiplicação
                 numeros[indice] = resultado
                 // Remover o operador após a multiplicação
                 operadores.removeAt(indice)
             } else {
                 indice++
             }
         }
     }



     private fun calcularDivisao(numeros: MutableList<Double>, operadores: MutableList<Char>) {
         var indice = 0
         while (indice < operadores.size) {
             val op = operadores[indice]
             if (op == '/') {
                 val numero1 = numeros[indice]
                 val numero2 = numeros[indice + 1]
                 val resultado = numero1 / numero2
                 // Substituir o primeiro número pelo resultado
                 numeros[indice] = resultado
                 // Remover o operador e o segundo número
                 operadores.removeAt(indice)
                 numeros.removeAt(indice + 1)
             } else {
                 indice++
             }
         }
     }



     private fun calcularSomaESubtracao(numeros: MutableList<Double>, operadores: MutableList<Char>) {
         var i = 0
         while (i < operadores.size) {
             if (operadores[i] == '+' || operadores[i] == '-') {
                 val operador = operadores[i]
                 val num1 = numeros[i]
                 val num2 = numeros[i + 1]
                 val resultado = if (operador == '+') num1 + num2 else num1 - num2
                 numeros[i] = resultado
                 numeros.removeAt(i + 1)
                 operadores.removeAt(i)
             } else {
                 i++
             }
         }
     }

 }
