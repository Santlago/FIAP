package model;

public class Professor extends Pessoa{

	private String cateiraTrabalho;
	private double valorHora;
	private String cargo;
	private int qtdHoras;
	
	// getters and setters
	public String getCateiraTrabalho() {
		return cateiraTrabalho;
	}
	public void setCateiraTrabalho(String cateiraTrabalho) {
		this.cateiraTrabalho = cateiraTrabalho;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getQtdHoras() {
		return qtdHoras;
	}
	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
}
