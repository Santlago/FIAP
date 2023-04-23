package ddd_funcionarios;

public class Testa {

	public static void main(String[] args) {
		
		Vendedor paulo = new Vendedor();
		paulo.setNome("Paulo");
		paulo.setSalario(1000);
		System.out.println(paulo.getSalario());
		System.out.println(paulo.calculaBonificação());
		System.out.println("teste");
	}
}
