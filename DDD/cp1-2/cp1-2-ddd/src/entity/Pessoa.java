package entity;

public class Pessoa {
    
    // attributes
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private int idade;
    private String genero;
    private int id;

    // methods
    public String toString(){
        return "Pessoa:" +
                "\nNome:" + nome +
                "\nCPF:" + cpf +
                "\nE-mail:" + email +
                "\nE-mail:" + telefone +
                "\nEndereço:" + endereco +
                "\nIdade:" + idade +
                "\nGênero:" + genero;
    }

    // getters and setters
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
