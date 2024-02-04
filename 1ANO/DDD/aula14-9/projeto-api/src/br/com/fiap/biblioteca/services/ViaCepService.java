package br.com.fiap.biblioteca.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import br.com.fiap.biblioteca.models.Endereco;

public class ViaCepService {
    
    public Endereco buscaEndereco(String cep) {
        try {
            String endereco = "https://viacep.com.br/ws/" + cep + "/json";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            // TODO: handle exception
            throw new RuntimeException();
        }
    }
}
