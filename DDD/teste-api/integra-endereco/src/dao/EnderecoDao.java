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
        String sql = "insert into endereco (id, cep, rua, numero, bairro, cidade, uf)"
            + "values (?, ?, ?, ?, ?, ?, ?)";
        comandoSql = conexao.prepareStatement(sql);
        comandoSql.setInt(1, endereco.getId());
        comandoSql.setString(2, endereco.getCep());
        comandoSql.setString(3, endereco.getRua());
        comandoSql.setString(4, endereco.getNumero());
        comandoSql.setString(5, endereco.getBairro());
        comandoSql.setString(6, endereco.getCep());
        comandoSql.setString(7, endereco.getUf());
        comandoSql.executeUpdate();
        conexao.close();
        comandoSql.close();
    }
}
