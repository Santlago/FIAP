package tests;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.sql.SQLException;
import java.util.Scanner;

import com.google.gson.Gson;

import dao.EnderecoDao;
import entity.Endereco;

public class TestePrincipal {
    public static void main(String[] args) throws SQLException, IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        EnderecoDao dao = new EnderecoDao();
        
        // Menu principal
        while (true) {
            System.out.println("""
                1 - Adicionar endereço
                2 - Excluir
                0 - SAIR
                """);
            var opcao = leitura.nextLine();
            switch (opcao) {
                case "1":
                    // Conexao API Correios
                    System.out.println("Digite o CEP: ");
                    var cep = leitura.nextLine();
            
                    String url = "http://viacep.com.br/ws/" + cep + "/json/";
            
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
            
                    HttpResponse<String> response = client
                        .send(request, BodyHandlers.ofString());
            
                    var json = response.body();
                            
                    // Tratando dados
                    Gson gson = new Gson();
            
                    Endereco endereco = gson.fromJson(json, Endereco.class);
                    
                    // Conexão banco de dados
                    System.out.println("Digite o número: ");
                    endereco.setNumero(leitura.nextLine());
            
                    try {
                        dao.inserir(endereco);
                        System.out.println("Endereço cadastrado com sucesso!");
                    } catch (SQLException e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    System.out.println("Digite o número do endereço que deseja excluir: ");
                    var numDig = leitura.nextLine();
                    try {
                        dao.excluir(numDig);
                        System.out.println("Endereço excluído com sucesso!");
                    } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Opção inválida! ");
            }
        }        
    }
}