package models;

public abstract class Produto implements IUtils{
    
    //attributes
    private String titulo;
    private String genero;
    private double preco;
    private int quantidade;

    // methods
    public String doExibir(){
        return "Título: " + this.titulo 
            + "\nGenero: " + this.genero
            + "\nPreco: " + this.preco
            + "\nQuantidade: " + this.quantidade;
    }

    public abstract double doTotal();

    // getters and setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
