package br.com.zup.projeto;
import java.util.Date;


public class Veiculo {

	private String placa;
	private String cor;
	private String modelo;
	private Date entrada = null;
	private static  Date saida = null;
	
	public Veiculo(String cor, String placa,String modelo, Date entrada, Date saida) {
		this.cor = cor;
		this.placa = placa;
		this.modelo = modelo;
		this.entrada = entrada;
		this.saida = saida;
		
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public static Date getSaida() {
		return saida;
	}
	public void setSaida(Date saida) {
		this.saida = saida;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	





	}
