package dddencapsulamento2;

import java.util.Scanner;

public class TestaTriangulo {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Digite o nome do lado x: ");
		triangulo.setX(numero.nextInt());
		System.out.println("Digite o nome do lado y: ");
		triangulo.setY(numero.nextInt());
		System.out.println("Digite o nome do lado z: ");
		triangulo.setZ(numero.nextInt());
		
		System.out.println(triangulo.valida());
	}
}
