package entity;

public class Veiculo {

    private int id;
    private String renavam;
    private String placa;
    private String modelo;
    private int ano;
    private Pessoa proprietario;

    @Override
    public String toString() {
        String mensagem ="Dados do Veículo"
                + "\nRenavam: " + renavam
                + "\nPlaca: " + placa
                + "\nModelo: " + modelo
                + "\nAno" + ano
                + "\n" + proprietario.toString()
                + "*********************************";
        return mensagem;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRenavam() {
        return renavam;
    }
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public Pessoa getProprietario() {
        return proprietario;
    }
    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

}
