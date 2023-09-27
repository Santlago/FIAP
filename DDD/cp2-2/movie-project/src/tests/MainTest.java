package tests;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Filme;
import models.FilmeOmdb;

public class MainTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=da68d1f1";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, BodyHandlers.ofString());
            String json = response.body();
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            FilmeOmdb meufilmeOmdb = gson.fromJson(json, FilmeOmdb.class);
            Filme meuFilme = new Filme(meufilmeOmdb);
            System.out.println(meuFilme);
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Aconteceu um erro!");
            System.out.println(e.getMessage());
        } catch (com.google.gson.JsonSyntaxException e) {
            System.out.println("Aconteceu um erro de sintaxe no JSON!");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço! ");
        }
    }
}
