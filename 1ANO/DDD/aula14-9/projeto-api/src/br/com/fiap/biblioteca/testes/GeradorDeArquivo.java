package br.com.fiap.biblioteca.testes;

import br.com.fiap.biblioteca.models.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void gravaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter file = new FileWriter(endereco.getCep() + ".json");
        file.write(gson.toJson(endereco));
        file.close();
    }
}
