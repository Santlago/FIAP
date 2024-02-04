package dao;

import entity.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnderecoDao {
    private Connection conexao;
    public void inserir(Endereco endereco) throws SQLException {
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSql = null;
        String sql = "insert into endereco (idEndereco,cep,rua, complemento, bairro,cidade," +
                "uf,numero) values(?,?,?,?,?,?,?,?)";
        comandoSql = conexao.prepareStatement(sql);
        comandoSql.setInt(1, endereco.getId());
        comandoSql.setString(2, endereco.getCep());
        comandoSql.setString(3, endereco.getLogradouro());
        comandoSql.setString(4, endereco.getComplemento());
        comandoSql.setString(5, endereco.getBairro());
        comandoSql.setString(6, endereco.getLocalidade());
        comandoSql.setString(7, endereco.getUf());
        comandoSql.setString(8, endereco.getNumero());
        comandoSql.executeUpdate();
        conexao.close();
        comandoSql.close();
    }

    public void alterar(Endereco endereco){
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSql = null;
        String sql = "update endereco set cep = ?,rua = ?, complemento = ?, bairro = ?,cidade = ?, " +
                "uf = ?,numero = ? where idEndereco = ?";
        try {
            comandoSql = conexao.prepareStatement(sql);
            comandoSql.setString(1, endereco.getCep());
            comandoSql.setString(2, endereco.getLogradouro());
            comandoSql.setString(3, endereco.getComplemento());
            comandoSql.setString(4, endereco.getBairro());
            comandoSql.setString(5, endereco.getLocalidade());
            comandoSql.setString(6, endereco.getUf());
            comandoSql.setString(7, endereco.getNumero());
            comandoSql.setInt(8, endereco.getId());
            comandoSql.executeUpdate();
            conexao.close();
            comandoSql.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void excluir(int id){
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSql = null;
        String sql = "delete from endereco where idEndereco = ?";
        try{
            comandoSql=conexao.prepareStatement(sql);
            comandoSql.setInt(1,id);
            comandoSql.executeUpdate();
            conexao.close();
            comandoSql.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public Endereco buscarPorId(int id){
        Endereco endereco = new Endereco();
        PreparedStatement comandoSql = null;
        conexao = GerenciadorBD.obterConexao();
        try{
            String sql = "Select * from endereco where idendereco = ?";
            comandoSql = conexao.prepareStatement(sql);
            comandoSql.setInt(1,id);
            ResultSet rs = comandoSql.executeQuery();
            if(rs.next()){
                endereco.setId(rs.getInt(1));
                endereco.setCep(rs.getString(2));
                endereco.setLogradouro(rs.getString(3));
                endereco.setComplemento(rs.getString(4));
                endereco.setBairro(rs.getString(5));
                endereco.setLocalidade(rs.getString(6));
                endereco.setUf(rs.getString(7));
                endereco.setNumero(rs.getString(8));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return endereco;
    }

}
