package ddd_funcionarios;

public class Vendedor extends Funcionario {

	//atributos
	private double comissao;
	
	//metodos
	public double calculoComissao(double valorVendido ) {
		return 0;
	}
	
	//getters e setters
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
