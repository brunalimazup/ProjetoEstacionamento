package br.com.zup.projeto;
public class Vaga {

	private int vagas;
	private int vagasIdoso;
	private int vagasDeficientes;
	private int vagasMotos;
	private int vagasComuns;

	public Vaga(int vagas, int vagasIdoso, int vagasDeficientes, int vagasMotos, int vagasComuns) {
		super();
		this.vagas = vagas;
		this.vagasIdoso = vagasIdoso;
		this.vagasDeficientes = vagasDeficientes;
		this.vagasMotos = vagasMotos;
		this.vagasComuns = vagasComuns;
	}

	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	public int getVagasIdoso() {
		return vagasIdoso;
	}
	public void setVagasIdoso(int vagasIdoso) {
		this.vagasIdoso = vagasIdoso;
	}
	public int getVagasDeficientes() {
		return vagasDeficientes;
	}
	public void setVagasDeficientes(int vagasDeficientes) {
		this.vagasDeficientes = vagasDeficientes;
	}
	public int getVagasMotos() {
		return vagasMotos;
	}
	public void setVagasMotos(int vagasMotos) {
		this.vagasMotos = vagasMotos;
	}
	public int getVagasComuns() {
		return vagasComuns;
	}
	public void setVagasCom(int vagasComum) {
		this.vagasComuns = vagasComum;
	}

	public String toString() {
		String vaga = "";

		vaga += "Total de Vagas = " + this.getVagas();
		vaga += "\nVagas idoso = " + this.getVagasIdoso();
		vaga += "\nVagas deficiente = " + this.getVagasDeficientes();
		vaga += "\nVagas de moto = " + this.getVagasMotos();
		vaga += "\nVagas comuns = " + this.getVagasComuns();

		return vaga;

	}
}