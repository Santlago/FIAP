package tests;

import java.sql.SQLException;
import java.util.Scanner;

import dao.EnderecoDao;
import entity.Endereco;

public class Teste {
    
    public static void main(String[] args) throws SQLException {
        
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);
        Endereco end = new Endereco();
        EnderecoDao dao = new EnderecoDao();

        System.out.println("CEP: ");
        end.setCep(leitorTexto.nextLine());
        System.out.println("Rua/avenida: ");
        end.setLogradouro(leitorTexto.nextLine());
        System.out.println("Complemento (se houver): ");
        end.setComplemento(leitorTexto.nextLine());
        System.out.println("Cidade: ");
        end.setCidade(leitorTexto.nextLine());
        System.out.println("Bairro: ");
        end.setBairro(leitorTexto.nextLine());
        System.out.println("Estado (UF) : ");
        end.setUf(leitorTexto.nextLine());
        System.out.println("Id: ");
        end.setId(leitorNumerico.nextInt());
        System.out.println("Número: ");
        end.setNumero(leitorTexto.nextLine());

        // Insert into database
        try {
            dao.inserir(end);
            System.out.println("Deu certo");
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Deu errado");
        }
        System.out.println(end);
    }
}
