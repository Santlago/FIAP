package tests;

import dao.GerenciadorBD;

public class TesteConexao {
    public static void main(String[] args) {
        
        if(GerenciadorBD.obterConexao() == null){
            System.out.println("Erro ao estabelecer a conexão");
        }
        else {
            System.out.println("Conexão estabeleida com sucesso!");
        }
    }
}
