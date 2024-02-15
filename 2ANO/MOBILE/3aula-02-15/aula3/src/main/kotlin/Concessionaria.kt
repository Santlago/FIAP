open class Concessionaria {

    var dadosCadastrais = DadosCadastrais("Savol", null)

    fun venderVeiculo() {
        println("Vendendo@veículo".removeSpecialChars())
    }

    fun atualizarDados(nome: String, endereco: String, telefone: String) {
        dadosCadastrais = DadosCadastrais(nome, endereco, telefone)
    }
}