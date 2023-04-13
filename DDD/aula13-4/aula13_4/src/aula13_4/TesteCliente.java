package aula13_4;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		
		Scanner texto = new Scanner(System.in);
		Scanner numero = new Scanner(System.in);
		
		Cliente cli = new Cliente();
		
		System.out.println("Digite o codigo do cliente");
		cli.setCodigo(numero.nextInt());
		
		System.out.println("Digite o nome do Cliente");
		cli.setNome(texto.nextLine());
		
		System.out.println("Cliente: " + cli.getCodigo() + "\nNome: " + cli.getNome());
	}
}