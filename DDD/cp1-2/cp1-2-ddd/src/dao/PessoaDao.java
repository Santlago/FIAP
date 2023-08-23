package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Pessoa;

public class PessoaDao {
    
    private Connection conexao;

    public void inserir(Pessoa pessoa) throws SQLException {
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSql = null;
        String sql = "insert into endereco (pessoa_id, nome, cpf, email, telefone, endereco, idade, genero) values(?,?,?,?,?,?,?,?)";
        comandoSql = conexao.prepareStatement(sql);
        comandoSql.setInt(1, pessoa.getId());
        comandoSql.setString(2, pessoa.getNome());
        comandoSql.setString(3, pessoa.getCpf());
        comandoSql.setString(4, pessoa.getEmail());
        comandoSql.setString(5, pessoa.getTelefone());
        comandoSql.setString(6, pessoa.getEndereco());
        comandoSql.setInt(7, pessoa.getIdade());
        comandoSql.setString(8, pessoa.getGenero());
        comandoSql.executeUpdate();
        conexao.close();
        comandoSql.close();
    }

}
