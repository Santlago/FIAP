fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    val concessionaria = Concessionaria()
    val concessionariaMotos = ConcessionariaMotos()

    println(concessionaria.dadosCadastrais.endereco)

    concessionariaMotos.venderMoto()
}
