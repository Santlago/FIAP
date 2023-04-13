package enums;

import java.util.Scanner;

public class TesteInvestimento {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		Investimento inv = new Investimento();
		System.out.println("Digite o valor: ");
		inv.setValor(numero.nextDouble());
		
		System.out.println("Selecione o tipo de investimento: "
				+ "\nDigite [1] para poupança"
				+ "\nDigite [2] para renda fixa"
				+ "\nQual o tipo de investimento desejado: ");
		int escolha = numero.nextInt();
		if (escolha == 1)
			inv.setTipo(TipoInvestimentoEnum.POUPANCA);
		else 
			inv.setTipo(TipoInvestimentoEnum.RENDA_FIXA);
		
		System.out.println("Correcao será por " + inv.getTipo().toString() + "\nValor corrigido: " + inv.correcao());
	}
}
