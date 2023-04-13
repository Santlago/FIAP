package model;

public class Aluno extends Pessoa{

	private String nomeMae;
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public String exibeAluno() {
		return getNome() + "você estudará no campus da cidade" + getCidade();
	}
}
