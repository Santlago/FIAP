package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorBD {
    public static Connection obterConexao(){
        Connection conexao = null;
        try{
            conexao = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
                    "rm552270","030604");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conexao;
    }
}