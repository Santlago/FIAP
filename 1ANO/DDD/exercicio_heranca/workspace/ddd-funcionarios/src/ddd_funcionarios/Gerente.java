package ddd_funcionarios;

public class Gerente extends Funcionario {

	//atributos
	private double gratificacao;
	
	//getters e setters
	public double getGratificacao() {
		return calculaBonificação(1000);
	}
	
	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
}
