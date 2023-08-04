package models;

public class Dvd extends Produto {

    private int anoLancamento;

    @Override
    public double doTotal() {
        return this.getPreco() * this.getQuantidade();
    }

    @Override
    public boolean validar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validar'");
    }

    public String doExibir(){
        return super.doExibir();
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }


    
}
