package tests;

import java.sql.SQLException;

import dao.EnderecoDao;
import entity.Endereco;

public class TestePrincipal {
    public static void main(String[] args) throws SQLException {

        Endereco endereco = new Endereco();
        EnderecoDao dao = new EnderecoDao();

        endereco.setId(2);
        endereco.setCep("08557505");
        endereco.setRua("Av. dos santos");
        endereco.setNumero("4324");
        endereco.setBairro("Vila Márcia");
        endereco.setCidade("Suzano");
        endereco.setUf("SP");

        try {
            dao.inserir(endereco);
            System.out.println("Endereço cadastrado com sucesso!");
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
