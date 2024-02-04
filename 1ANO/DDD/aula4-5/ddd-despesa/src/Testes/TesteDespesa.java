package Testes;
import java.util.Scanner;

import Models.Alimentacao;

public class TesteDespesa {

    public static void main(String[] args) {
        
        Alimentacao a = new Alimentacao();
        a.cadastrarDespesa();

        Alimentacao a1 = new Alimentacao();
        Scanner texto = new Scanner(System.in);
        System.out.println("Digitea descricao da despesa: ");
        a1.cadastrarDespesa(texto.nextLine());
    }
}