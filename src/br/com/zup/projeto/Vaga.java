package br.com.zup.projeto;
import java.util.Scanner;
public class Vaga extends Estacionamento {
	Scanner scan = new Scanner(System.in);
	int vagas = scan.nextInt();
	int idosos = (vagas * 5) / 100;
	int deficiente = (vagas * 5) / 100;
	int motos = 5;
	
	public Vaga(int vagas, int entrada, int saída) {
		super(vagas, entrada, saída);
	}

	public int getIdosos() {
		return idosos;
	}

	public void setIdosos(int idosos) {
		this.idosos = idosos;
	}

	public int getDeficiente() {
		return deficiente;
	}

	public void setDeficiente(int deficiente) {
		this.deficiente = deficiente;
	}

	public int getMotos() {
		return motos;
	}

	public void setMotos(int motos) {
		this.motos = motos;
	}
	@Override
	public String toString() {

		String modelo = "";
		modelo += "Vagas ->" + super.getVagas();
		modelo +="\nEntrada -> " + super.getEntrada();
		modelo += "\nSaída ->" + super.getSaída();
		modelo += "\nIdosos -> " + this.getIdosos();
		modelo += "\nDeficientes -> " + this.getDeficiente();
		modelo += "\nVagas Motos -> "+ this.getMotos();
		return  modelo;


	}
}