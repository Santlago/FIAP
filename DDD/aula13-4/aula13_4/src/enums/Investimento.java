package enums;

public class Investimento {

	private double valor;
	private TipoInvestimentoEnum tipo;
	public double getValor() {
		return valor;
	}
	public void setValor (double valor) {
		this.valor = valor;
	}
	public TipoInvestimentoEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoInvestimentoEnum tipo) {
		this.tipo = tipo;
	}
	
	public double correcao() {
		if(tipo.equals(TipoInvestimentoEnum.POUPANCA))
			return valor * 1.03;
		else return valor * 1.04;
	}
}
