package tests;

import dao.DBManager;

public class TesteConexao {
    public static void main(String[] args) {
        if (DBManager.getConnection() == null) {
            System.out.println("Erro ao estabelecer conexão!");
        } else {
            System.out.println("Conexão estabelecida com sucesso!");
        }
    }
}
