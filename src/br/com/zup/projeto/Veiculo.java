package br.com.zup.projeto;

public class Veiculo {

	String modelo;
	String placa;
	String cor;

	public Veiculo(String modelo, String placa, String cor) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
