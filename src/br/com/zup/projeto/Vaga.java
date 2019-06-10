package br.com.zup.projeto;

import java.util.ArrayList;
import java.util.List;

public class Vaga {

	private double vagas;
	private double vagasIdoso;
	private double vagasDeficientes;
	private double vagasMotos;
	private double vagasComum;

	List<Vaga> listaDeVagas = new ArrayList<Vaga>();

	public Vaga(double vagas, double vagasIdoso, double vagasDeficientes, double vagasMotos, double vagasComum) {
		super();
		this.vagas = vagas;
		this.vagasIdoso = vagasIdoso;
		this.vagasDeficientes = vagasDeficientes;
		this.vagasMotos = vagasMotos;
		this.vagasComum = vagasComum;
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

	public double getVagasComum() {
		return vagasComum;
	}

	public void setVagasComum(double vagasComum) {
		this.vagasComum = vagasComum;
	}

	public List<Vaga> listaDeVagas(List<Vaga> vagas, double vagaIdoso, double vagaDeficiente, double vagaMoto,
			double VagaComum) {
		for (int i = 0; i < vagaIdoso; i++) {
			
			
		}
		return null;
	}

	@Override
	public String toString() {
		String vaga = "";

		vaga += "Total de Vagas = " + this.getVagas();
		vaga += "\nVagas idoso = " + this.getVagasIdoso();
		vaga += "\nVagas deficiente = " + this.getVagasDeficientes();
		vaga += "\nVagas de moto = " + this.getVagasMotos();
		vaga += "\nVagas comuns = " + this.getVagasComum();

		return vaga;

	}
}