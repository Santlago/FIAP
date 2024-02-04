package Models;
import java.util.Scanner;

public class Alimentacao extends Despesa {

    // atributos
    private String nomeRestaurante;

    // métodos
    @Override
    public void calcularDespesa() {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite a quantidade de refeicoes: ");
        int qtd = num.nextInt();
        setValorTotal(qtd * 18);
    }

    @Override
    public void listarDespesa() {
        System.out.println("Despesa: Alimentação\nNome do restaurante" + this.nomeRestaurante + "\nDescrição da despesa: " + super.getDescricao() + "\nValor total: R$" + super.getValorTotal());
    }

    public void cadastrarDespesa() {
        Scanner text = new Scanner(System.in);
        System.out.println("Digite o nome do restaurante: ");
        this.nomeRestaurante = text.nextLine();
        super.cadastrarDespesa();
    }

    // getters e setters
    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    
}
