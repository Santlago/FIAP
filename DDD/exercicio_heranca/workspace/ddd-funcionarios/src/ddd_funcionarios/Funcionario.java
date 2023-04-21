package ddd_funcionarios;

public class Funcionario {

	//atributos
	protected String nome;
	protected double salario;
	
	//metodos
	public double calculaBonificação() {
		return this.salario + 1000;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
