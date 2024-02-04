package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Pessoa;

/*
create table PESSOA(
   IDPESSOA numeric(38,0) not null primary key,
   NOME varchar2(40) not null,
   ENDERECO varchar2(50),
   CPF varchar2(11),
   TELEFONE varchar2(20)
);
* */
public class PessoaDAO {

    private Connection conexao;

    public void inserir(Pessoa pessoa)  {
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSQL = null;
        try {
            comandoSQL = conexao.prepareStatement("insert into pessoa (idPessoa ,nome, endereco, cpf, telefone) " +
                    "values(?,?,?,?,?)");
            comandoSQL.setInt(1, pessoa.getId());
            comandoSQL.setString(2, pessoa.getNome());
            comandoSQL.setString(3, pessoa.getEndereco());
            comandoSQL.setString(4, pessoa.getCpf());
            comandoSQL.setString(5, pessoa.getTelefone());

            comandoSQL.executeUpdate();
            conexao.close();
            comandoSQL.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void alterar(Pessoa pessoa)  {
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSQL = null;
        try {
            comandoSQL = conexao.prepareStatement("update pessoa set  nome = ?, endereco = ?, cpf = ?," +
                    "telefone = ? where idPessoa = ?");
            comandoSQL.setString(1, pessoa.getNome());
            comandoSQL.setString(2, pessoa.getEndereco());
            comandoSQL.setString(3, pessoa.getCpf());
            comandoSQL.setString(4, pessoa.getTelefone());
            comandoSQL.setInt(5, pessoa.getId());

            comandoSQL.executeUpdate();
            conexao.close();
            comandoSQL.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void excluir(Pessoa pessoa)  {

        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSQL = null;
        try {
            comandoSQL = conexao.prepareStatement("delete from pessoa where idPessoa = ?");
            comandoSQL.setInt(1, pessoa.getId());

            comandoSQL.executeUpdate();
            conexao.close();
            comandoSQL.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Pessoa buscarPorId(int id){
        Pessoa p = new Pessoa();
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSQL = null;
        try {
            comandoSQL = conexao.prepareStatement("select * from pessoa where  idPessoa = ?");
            comandoSQL.setInt(1, id);
            ResultSet rs =  comandoSQL.executeQuery();
            if (rs.next())
            {
                p.setId(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setEndereco(rs.getString(3));
                p.setCpf(rs.getString(4));
                p.setTelefone(rs.getString(5));
            }
            conexao.close();
            comandoSQL.close();

        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return p;
    }


    public ArrayList<Pessoa> buscarTudo(){

        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        conexao = GerenciadorBD.obterConexao();
        PreparedStatement comandoSQL = null;
        try {
            comandoSQL = conexao.prepareStatement("select * from pessoa order by nome");
            ResultSet rs =  comandoSQL.executeQuery();
            while (rs.next())
            {
                Pessoa p = new Pessoa();
                p.setId(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setEndereco(rs.getString(3));
                p.setCpf(rs.getString(4));
                p.setTelefone(rs.getString(5));

                listaPessoas.add(p);
            }
            conexao.close();
            comandoSQL.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listaPessoas;
    }


}
