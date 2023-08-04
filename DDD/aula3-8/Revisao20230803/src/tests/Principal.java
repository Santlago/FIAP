package tests;

import java.util.Scanner;

import models.Cd;
import models.Dvd;
import models.GerenciadorRegistros;
import models.Produto;

public class Principal {
    public static void main(String[] args) {

        Cd p = new Cd();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o título: ");
        p.setTitulo(entrada.nextLine());
        System.out.println("Digite o gênero: ");
        p.setGenero(entrada.nextLine());
        System.out.println("Digite o artista: ");
        p.setArtista(entrada.nextLine());  
        System.out.println("Digite o preço: ");
        p.setPreco(entrada.nextDouble());
        System.out.println("Digite o quantidade: ");
        p.setQuantidade(entrada.nextInt());  
        
        System.out.println(p.doExibir());
        GerenciadorRegistros gr = new GerenciadorRegistros();
        gr.add(p);

        Dvd dvd = new Dvd();
        dvd.setTitulo("Deb e Loide");
        dvd.setGenero("Comédia");
        dvd.setPreco(11);
        dvd.setQuantidade(1);
        dvd.setAnoLancamento(1985);
        dvd.doExibir();
        dvd.doTotal();
    }
}
