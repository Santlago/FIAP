package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entity.Endereco;

public class EnderecoDao {
    
    private Connection conexao;
    public void inserir(Endereco endereco) throws SQLException{
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSql = null;

        String sql = "insert into endereco (idEndereco, cep, rua, complemento, bairro, cidade, uf, numero) values(?,?,?,?,?,?,?)";
        comandoSql = conexao.prepareStatement(sql);
        comandoSql.setInt(1, endereco.getId());
        comandoSql.setString(2, endereco.getCep());
        comandoSql.setString(3, endereco.getLogradouro());
        comandoSql.setString(4, endereco.getComplemento());
        comandoSql.setString(5, endereco.getBairro());
        comandoSql.setString(6, endereco.getCidade());
        comandoSql.setString(7, endereco.getUf());
        comandoSql.setString(8, endereco.getNumero());  // Corrected index

        comandoSql.executeUpdate();

        conexao.close();
        comandoSql.close();
    }
}