package br.com.zup.projeto;

public class Carro extends Veiculo{

	
	boolean carroComum;
	boolean carroIdoso;
	boolean carroDf;
	public Carro(boolean carroComum, boolean carroIdoso, boolean carroDf) {
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
}
	

