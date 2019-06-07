package br.com.zup.projeto;

public class Estacionamento {
	
	private int vagas;
	private double entrada;
	private double saída;
	
	public Estacionamento(int vagas, double entrada, double saída) {
		this.vagas = vagas;
		this.entrada = entrada;
		this.saída = saída;
	}
	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	public double getEntrada() {
		return entrada;
	}
	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}
	public double getSaída() {
		return saída;
	}
	public void setSaída(double saída) {
		this.saída = saída;
	}
	

}
