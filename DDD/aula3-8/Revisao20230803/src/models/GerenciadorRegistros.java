package models;

public class GerenciadorRegistros {
    
    private static int totalItens;

    public void add(Produto prod){
        totalItens += prod.getQuantidade();
    }

    public String countFormatted(){
        return "Total de itens registrados: " + totalItens;
    }
}
