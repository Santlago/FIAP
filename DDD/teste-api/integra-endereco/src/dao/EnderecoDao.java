package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Endereco;

public class EnderecoDao {

    // attributes
    private Connection conexao;

    // methods
    public void inserir(Endereco endereco) throws SQLException {
        conexao = DBManager.getConnection();
        PreparedStatement comandoSql = null;
        String sql = "insert into endereco (cep, rua, numero, bairro, cidade, uf)"
            + "values (?, ?, ?, ?, ?, ?)";
        comandoSql = conexao.prepareStatement(sql);
        comandoSql.setString(1, endereco.getCep());
        comandoSql.setString(2, endereco.getRua());
        comandoSql.setString(3, endereco.getNumero());
        comandoSql.setString(4, endereco.getBairro());
        comandoSql.setString(5, endereco.getCidade());
        comandoSql.setString(6, endereco.getUf());
        comandoSql.executeUpdate();
        conexao.close();
        comandoSql.close();
    }
}
