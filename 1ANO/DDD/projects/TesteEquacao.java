import java.util.Scanner;

public class TesteEquacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ent = new Scanner(System.in);
		Equacao eq = new Equacao();
		System.out.println("Digite o valor de a: ");
		eq.a = ent.nextInt();
		System.out.println("Digite o valor de b: ");
		eq.b = ent.nextInt();
		System.out.println("Digite o valor de c: ");
		eq.c = ent.nextInt();
		
		eq.calcDelta();
		System.out.print("Delta: " + eq.delta);
	}

}
