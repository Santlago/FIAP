package ddd_funcionarios;

public class Vendedor extends Funcionario {

	//atributos
	private double comissao;
	
	//metodos
	public double calculaComissao(double valorVendido) {
		return getSalario() + valorVendido;
	}
	
	//getters e setters
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
