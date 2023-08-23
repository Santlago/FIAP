package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.Pessoa;


public class PessoaDao {
    private Connection conexao;
    
    public void inserir(Pessoa pessoa) throws SQLException {
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSql = null;
        String sql = "INSERT INTO Pessoa (pessoa_id, nome, cpf, email, telefone, endereco, idade, genero) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
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

    public void alterar(Pessoa pessoa) {
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSql = null;
        String sql = "UPDATE Pessoa SET nome = ?, cpf = ?, email = ?, telefone = ?, " +
                "endereco = ?, idade = ?, genero = ? WHERE pessoa_id = ?";
        try {
            comandoSql = conexao.prepareStatement(sql);
            comandoSql.setString(1, pessoa.getNome());
            comandoSql.setString(2, pessoa.getCpf());
            comandoSql.setString(3, pessoa.getEmail());
            comandoSql.setString(4, pessoa.getTelefone());
            comandoSql.setString(5, pessoa.getEndereco());
            comandoSql.setInt(6, pessoa.getIdade());
            comandoSql.setString(7, pessoa.getGenero());
            comandoSql.setInt(8, pessoa.getId());
            comandoSql.executeUpdate();
            conexao.close();
            comandoSql.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void excluir(int id) {
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSql = null;
        String sql = "DELETE FROM Pessoa WHERE pessoa_id = ?";
        try {
            comandoSql = conexao.prepareStatement(sql);
            comandoSql.setInt(1, id);
            comandoSql.executeUpdate();
            conexao.close();
            comandoSql.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Pessoa buscarPorId(int id) throws SQLException {
        Pessoa pessoa = new Pessoa();
        PreparedStatement comandoSql = null;
        conexao = GerenciadorBD.obterConexao();
        try {
            String sql = "SELECT * FROM Pessoa WHERE pessoa_id = ?";
            comandoSql = conexao.prepareStatement(sql);
            comandoSql.setInt(1, id);
            ResultSet rs = comandoSql.executeQuery();
            if (rs.next()) {
                pessoa.setId(rs.getInt("pessoa_id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setCpf(rs.getString("cpf"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setTelefone(rs.getString("telefone"));
                pessoa.setEndereco(rs.getString("endereco"));
                pessoa.setIdade(rs.getInt("idade"));
                pessoa.setGenero(rs.getString("genero"));
            }
            comandoSql.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pessoa;
    }

    public List<Pessoa> buscarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        PreparedStatement comandoSql = null;
        conexao = GerenciadorBD.obterConexao();
        try {
            String sql = "SELECT * FROM Pessoa";
            comandoSql = conexao.prepareStatement(sql);
            ResultSet rs = comandoSql.executeQuery();
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("pessoa_id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setCpf(rs.getString("cpf"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setTelefone(rs.getString("telefone"));
                pessoa.setEndereco(rs.getString("endereco"));
                pessoa.setIdade(rs.getInt("idade"));
                pessoa.setGenero(rs.getString("genero"));
                pessoas.add(pessoa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pessoas;
    }
}
