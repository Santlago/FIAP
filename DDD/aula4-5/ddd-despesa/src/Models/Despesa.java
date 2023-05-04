package Models;
import java.util.Scanner;

public abstract class Despesa {
    
    private String descricao;
    private double valorTotal;

    public void cadastrarDespesa() {
        Scanner text = new Scanner(System.in);
        System.out.println("Digite a descricao da despesa: ");
        descricao = text.nextLine();
        this.valorTotal = 0;
    }

    public void cadastrarDespesa(String despesa) {
        this.descricao = despesa;
        this.valorTotal = 0;
    }

    public abstract void calcularDespesa();

    public abstract void listarDespesa();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    

    
}
