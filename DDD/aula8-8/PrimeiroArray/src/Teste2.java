import java.util.Scanner;

public class Teste2 {
    
    public static void main(String[] args) {
        
        String nome [] = new String[4];

        Scanner leitura = new Scanner(System.in);

        for(int i=0; i<4; i++) {
            System.out.println("Digite um nome: ");
            nome [i] = leitura.nextLine();
        }

        for(int i=0; i<4; i++) {
            System.out.println(i+1 + "º nome: " + nome[i]);
        }
    }
}
