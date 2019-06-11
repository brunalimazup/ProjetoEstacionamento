package br.com.zup.projeto;

import java.util.Date;
//import java.sql.Date;

public class Veiculo {


	private Date entrada;
	private static Date saida;

	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public static Date getSaida() {
		return saida;
	}
	public void setSaida(Date date) {

		this.saida = (Date) date;

		this.saida = date;





	}
}