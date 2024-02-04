package Testes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExcecao extends Throwable {
    
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        double valor;
        String opcao = "n";

        do{
            try{
                System.out.println("Digite o valor numérico: ");
                valor = numero.nextDouble();
            } catch (InputMismatchException e) {
                opcao = "s";
                System.out.println("Valor informado não é um número");
                e.printStackTrace();
            }
        } while (opcao.equals("s"));
    }
}
