package br.com.fiap.biblioteca.dao;

import br.com.fiap.biblioteca.models.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDao {
    private Connection conexao = null;

    public EnderecoDao() {
        this.conexao = new GerenciadorBD().obterConexao();
    }


    /*insert into endereco(idEndereco, cep, rua, complemento, bairro, cidade, uf)
     values(1,"01310914","AV. PAULISTA", "4 ANDAR","BELA VISTA","SÃO PAULO", "SP"*/
    public void inserir(Endereco endereco)  {
        PreparedStatement comandoSql = null;
        try{
            String sql = "insert into endereco(idEndereco, cep, rua, complemento, bairro, cidade, uf)" +
                    " VALUES (?,?,?,?,?,?,?)";
            comandoSql = conexao.prepareStatement(sql);
            comandoSql.setInt(1,endereco.getId());
            comandoSql.setString(2, endereco.getCep());
            comandoSql.setString(3, endereco.getLogradouro()); //rua
            comandoSql.setString(4, endereco.getComplemento());
            comandoSql.setString(5, endereco.getBairro());
            comandoSql.setString(6, endereco.getLocalidade()); //cidade
            comandoSql.setString(7, endereco.getUf());

            comandoSql.executeUpdate();
            conexao.close();
            comandoSql.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alterar(Endereco endereco)  {
        PreparedStatement comandoSql = null;
        try{
            comandoSql = conexao.prepareStatement("update endereco set cep = ?, rua = ?, complemento = ?, " +
                    "bairro = ?, cidade = ?, uf = ? where idEndereco = ?");
            comandoSql.setString(1, endereco.getCep());
            comandoSql.setString(2, endereco.getLogradouro()); //rua
            comandoSql.setString(3, endereco.getComplemento());
            comandoSql.setString(4, endereco.getBairro());
            comandoSql.setString(5, endereco.getLocalidade()); //cidade
            comandoSql.setString(6, endereco.getUf());
            comandoSql.setInt(7,endereco.getId());
            comandoSql.executeUpdate();
            conexao.close();
            comandoSql.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void excluir(int id)  {
        PreparedStatement comandoSql = null;
        try{
            comandoSql = conexao.prepareStatement("delete from endereco where idEndereco = ?");
            comandoSql.setInt(1,id);
            comandoSql.executeUpdate();
            conexao.close();
            comandoSql.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Endereco buscarPorId(int id){
        Endereco endereco = new Endereco();
        PreparedStatement comandoSql = null;
        try{
            comandoSql = conexao.prepareStatement("Select * from endereco where idEndereco = ?");
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
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return endereco;
    }

    public List<Endereco> buscarTodosEnderecos(){
        List<Endereco> enderecos = new ArrayList<>();
        PreparedStatement comandoSql = null;
        try{
            comandoSql = conexao.prepareStatement("Select * from endereco ");
            ResultSet rs = comandoSql.executeQuery();
            while(rs.next()){
                Endereco endereco = new Endereco();
                endereco.setId(rs.getInt(1));
                endereco.setCep(rs.getString(2));
                endereco.setLogradouro(rs.getString(3));
                endereco.setComplemento(rs.getString(4));
                endereco.setBairro(rs.getString(5));
                endereco.setLocalidade(rs.getString(6));
                endereco.setUf(rs.getString(7));
                enderecos.add(endereco);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return enderecos;
    }
}
