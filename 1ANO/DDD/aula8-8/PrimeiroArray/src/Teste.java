import java.util.Scanner;
import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        
        // int idadeUm= 37;
        // int idadeDois = 18;
        // int idadeTres = 21;

        int idade [] = new int [3];

        // idade [0] = 37;
        // idade [1] = 18;
        // idade [2] = 21;


        for(int i=0; i<3; i++) {
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idadena casa " + i));
        }


        // Scanner leitura = new Scanner(System.in);

        // for(int i=0; i<3; i++) {
        //     System.out.println("Digite um número: ");
        //     idade [i] = leitura.nextInt();
        // }

        // System.out.println(idade [0]);
        // System.out.println(idade [1]);
        // System.out.println(idade [2]);

        for(int i=0; i<3; i++) {
            System.out.println(idade[i]);
        }
    }
}
