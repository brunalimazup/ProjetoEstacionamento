package br.com.zup.projeto;

public class Veiculo extends Estacionamento {
	private boolean moto;
	private boolean carro;
	public Veiculo(int vagas, int entrada, int saída, boolean moto, boolean carro) {
		super(vagas, entrada, saída);
		this.moto = moto;
		this.carro = carro;
	}
	public boolean getMoto() {
		return moto;
	}
	public void setMoto(boolean moto) {
		this.moto = moto;
	}
	public boolean getCarro() {
		return carro;
	}
	public void setCarro(boolean carro) {
		this.carro = carro;
	}
	@Override
	public String toString() {
	
	String modelo = "";
	modelo += "Vagas ->" + super.getVagas();
	modelo +="\nEntrada -> " + super.getEntrada();
	modelo += "\nSaída ->" + super.getSaída();
	modelo += "\n Moto -> "+ this.getMoto();
	modelo += "\nCarro -> " + this.getCarro();
	return modelo;
	
}
}