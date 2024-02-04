import java.util.Scanner;

public class projetoaula {

		public static void main(String[] args) {
			
			// Todo Auto-generated method stub
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite seu nome: ");
			String nome = entrada.nextLine();
			System.out.println("Bem vindo(a) " + nome);
			
			System.out.println("Digite sua idade: ");
			String idade = entrada.nextLine();
			int id = Integer.parseInt(idade);
			System.out.println("Voce tem " + idade + " anos");
			
		}
}
