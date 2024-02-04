package br.com.fiap.biblioteca.testes;

import br.com.fiap.biblioteca.dao.EnderecoDao;
import br.com.fiap.biblioteca.models.Endereco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaBusca {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Endereco endereco = new Endereco();
        EnderecoDao dao = new EnderecoDao();

        System.out.println("Digite o id do endereco: ");
        int id = ent.nextInt();
        endereco = dao.buscarPorId(id);
        System.out.println(endereco);

        List<Endereco> listaEnderecos = new ArrayList<Endereco>();
        String dados = "";
        listaEnderecos = dao.buscarTodosEnderecos();
        for (Endereco endereco2 : listaEnderecos) {
            dados += "======================\n";
            dados += "Id: " + endereco2.getId() + "\n";
            dados += "Endereço: " + endereco2.getLogradouro() + "\n";
            dados += "Complemento: " + endereco2.getComplemento() + "\n";
            dados += "CEP: " + endereco2.getCep() + "\n";
            dados += "Bairro: " + endereco2.getBairro() + "\n";
            dados += "Cidade: " + endereco2.getLocalidade() + "\n";
            dados += "Estado: " + endereco2.getUf() + "\n";
            dados += "======================\n";
        }
        System.out.println(dados);
    }

}
