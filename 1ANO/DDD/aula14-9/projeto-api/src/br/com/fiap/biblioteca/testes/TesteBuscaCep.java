package br.com.fiap.biblioteca.testes;

import java.util.Scanner;

import br.com.fiap.biblioteca.models.Endereco;
import br.com.fiap.biblioteca.services.ViaCepService;

public class TesteBuscaCep {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner ent = new Scanner(System.in);
        ViaCepService consulta = new ViaCepService();
        Endereco meuEndereco = new Endereco();

        System.out.println("CEP: ");
        var cep = leitor.nextLine();
        try {
            meuEndereco = consulta.buscaEndereco(cep);
            System.out.println(meuEndereco.toString());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
