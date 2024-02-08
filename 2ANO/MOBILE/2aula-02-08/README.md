# 

<ul>
    <li>
        Função em java infere que é void se nao colocar nada
    </li>
    <li>
        Se precisar retornar algo precisa fazer o casting da função:
        <code>
            fun main(): String {
            println("Hello, world!!!")
            }
        </code>
    </li>
    <li>
        <code>val</code> nao pode ser mudada
    </li>
    <li>
        Funciona da mesma forma para variáves:
        <code>val string: String = ""</code></br>
        Porém não há necessidade de explicitar se você alocar o tipo da variavel:
        <code> val string2 = ""</code></br>
        Criar uma variável sem inicializá-la:
        <code> val string3: String</code>
    </li>
    <li>
        <code>var</code> variável que pode ser modificada
    </li>
    <li>
        Para passar parametros colocamos primeiro o nome e depois o tipo
        <code>
            fun soma(a: Int, b: Int): Int{
                return a + b
            }
        </code></br>
        Podemos também fazer a mesma função dessa forma:
        <code>
            fun soma2(a: Int, b: Int) = a + b
        </code></br>
        Também pode ser feito isso:
        <code>
            fun soma3(a: Int, b: Int) = "O resultado da soma é: ${a + b}"
        </code>
        <code>
            fun soma3(a: Int, b: Int) = "O resultado da soma é: ${soma(a, b)}"
        </code>
    </li>
    <li>
        Kotlin nao permite criar lista, entao temos que usar uma função do sistema e ela é imutavel
        <code>var lista = listOf("Gol", "Parati", "Brasilia")</code></br>
        Essa lista é mutavel
        <code>var listaMutavel = arrayListOf("Gol", "Parati", "Brasilia")</code></br>
        E depois voce pode adicionar mais itens:
        <code>listaMutavel.add("Fusca")</code></br>
        E remover:
        <code>listaMutavel.remove("Fusca")</code>
    </li>
    <li>
        Fazer uma função para percorrer a lista:
        <code>
            fun laco(a: List<'String'>) {
                for(i in a) {
                    println(i)
                }
                for(i in a.indices) {
                    println(a[i])
                }
            }
        </code>
    </li>
    <li>
        Forçar a "criação" de uma lista:
        <code>
            fun laco(a: Int) {
                for(i in 0..a) {
                    print(i)
                }
            }
        </code>
    </li>
    <li>
        Modificador para poder saber se o objeto esta nulo ou nao
        <code>var listaMutavel: List<'String'>? = arrayListOf("Gol", "Parati", "Brasilia")</code>
    </li>
    <li>
        Scoped functions
        <code>
            listaNullable?.let {
                laco(it)
            }
        </code>
    </li>
<ul>
