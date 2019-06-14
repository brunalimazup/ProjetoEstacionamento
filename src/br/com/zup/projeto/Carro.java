package br.com.zup.projeto;

public class Carro extends Veiculo {

	boolean carroComum;
	boolean carroIdoso;
	boolean carroDf;

	public Carro(String modelo, String placa, String cor, boolean carroComum, boolean carroIdoso, boolean carroDf) {
		super(modelo, placa, cor);
		this.carroComum = carroComum;
		this.carroIdoso = carroIdoso;
		this.carroDf = carroDf;
	}

	public boolean isCarroComum() {
		return carroComum;
	}

	public void setCarroComum(boolean carroComum) {
		this.carroComum = carroComum;
	}

	public boolean isCarroIdoso() {
		return carroIdoso;
	}

	public void setCarroIdoso(boolean carroIdoso) {
		this.carroIdoso = carroIdoso;
	}

	public boolean isCarroDf() {
		return carroDf;
	}

	public void setCarroDf(boolean carroDf) {
		this.carroDf = carroDf;
	}
	@Override
	public String toString() {
		String vaga = "";

		vaga += "A placa do veiculo -> " + super.getPlaca();
		vaga += "\nO modelo do veiculo ->  = " + super.getModelo();
		vaga += "\nA cor do veiculo é -> = " + super.getCor();

		return vaga;
		}
}
