package br.com.fiap.biblioteca.testes;

import br.com.fiap.biblioteca.dao.EnderecoDao;
import br.com.fiap.biblioteca.models.Endereco;

import java.util.Scanner;

public class TestaInsercao {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Endereco endereco = new Endereco();
        EnderecoDao dao = new EnderecoDao();

        System.out.println("Digite o cep do endereco: ");
        endereco.setCep(ent.nextLine());
        System.out.println("Digite o nome da rua: ");
        endereco.setLogradouro(ent.nextLine());
        System.out.println("Digite o complemento do endereco: ");
        endereco.setComplemento(ent.nextLine());
        System.out.println("Digite o bairro do endereco: ");
        endereco.setBairro(ent.nextLine());
        System.out.println("Digite a cidade:");
        endereco.setLocalidade(ent.nextLine());
        System.out.println("Digite o estado:");
        endereco.setUf(ent.nextLine());
        System.out.println("Digite o código do endereco: ");
        endereco.setId(ent.nextInt());
        dao.inserir(endereco);
        System.out.println("Endereço adicionado com sucesso!");


    }
}
