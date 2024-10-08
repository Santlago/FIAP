package entity;

import com.google.gson.annotations.SerializedName;

public class Endereco {
    
    // attributes
    private String cep;
    @SerializedName("logradouro")
    private String rua;
    private String numero;
    private String bairro;
    @SerializedName("localidade")
    private String cidade;
    private String uf;

    // constructors
    

    public String toString(){
        return "Endereço:" +
                "\nCEP:" + cep +
                "\nRua:" + rua +
                "\nNúmero:" + numero +
                "\nBairro:" + bairro +
                "\nCidade:" + cidade +
                "\nUF:" + uf;
    }

    // getters and setters
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    
}
