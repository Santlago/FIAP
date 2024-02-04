package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    // methods
    public static Connection getConnection() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(
                "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", 
                "rm552270", 
                "030604");
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return conexao;
    }
}
