package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorBD {

    public static Connection obterConexao() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "PF1551", "fiap23");
            //banco utilizado: conexão:porta, usuário, senha
        } catch(SQLException erro) {
            erro.printStackTrace();
        }
        return conexao;
    }
}
