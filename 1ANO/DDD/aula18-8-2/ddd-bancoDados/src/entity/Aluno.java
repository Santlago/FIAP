package br.com.fiap.bancoDados.entity;

public class Aluno {

    private int id;
    private String nome;
    private String cpf;
    private Endereco endereco;

    public int getId() {
        return id;
    }

    public String toString(){
        return "==========================================\n" +
                "Dados do Aluno:" +
                "\nId:" + id +
                "\nNome:" + nome +
                "\nCpf:" + cpf +
                "\nEndereço:\n" + endereco.getLogradouro() +
                ", numero:" + endereco.getNumero() +
                "\nBairro:" + endereco.getBairro() +
                "\nCidade:" + endereco.getLocalidade() +
                "\nEstado:" + endereco.getUf() +
                "\n==========================================\n" ;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
