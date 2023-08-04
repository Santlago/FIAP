package models;

public class Cd extends Produto{
    
    // attributes
    private String artista;

    // methods
    public String doExibir(){
        return "\n" + super.doExibir() 
            + "\nArtista: " + this.artista
            + "\nPreço: " + doTotal();
    }
    @Override
    public double doTotal() {
        return super.getPreco() * super.getQuantidade();
    }

    @Override
    public boolean validar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validar'");
    }
    
    // getters and setters
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
}
