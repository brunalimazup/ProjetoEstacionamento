package br.com.zup.projeto;

public class Vaga {
	
	private double vagas;
	private double vagasIdoso;
	private double vagasDeficientes;
	private double vagasMotos;

	public Vaga(double vagas, double vagasIdoso, double vagasDeficientes, double vagasMotos) {
		super();
		this.vagas = vagas;
		this.vagasIdoso = vagasIdoso;
		this.vagasDeficientes = vagasDeficientes;
		this.vagasMotos = vagasMotos;
	
	}
	public double getVagas() {
		return vagas;
	}
	public void setVagas(double vagas) {
		this.vagas = vagas;
	}
	public double getVagasIdoso() {
		return vagasIdoso;
	}
	public void setVagasIdoso(double vagasIdoso) {
		this.vagasIdoso = vagasIdoso;
	}
	public double getVagasDeficientes() {
		return vagasDeficientes;
	}
	public void setVagasDeficientes(double vagasDeficientes) {
		this.vagasDeficientes = vagasDeficientes;
	}
	public double getVagasMotos() {
		return vagasMotos;
	}
	public void setVagasMotos(double vagasMotos) {
		this.vagasMotos = vagasMotos;
	}
	
	@Override
	public String toString() {
	 String vaga = "";
	 
	 vaga += "Total de Vagas = " + this.getVagas();
	 vaga += "\nVagas idoso = " + this.getVagasIdoso();
	 vaga += "\nVagas deficiente = " + this.getVagasDeficientes();
	 vaga += "\nVagas de moto = " + this.getVagasMotos();
	 
	 return vaga;
	 
	}
	
	
}