package br.com.zup.projeto;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.HOUR, scan.nextInt());
		calendario.set(Calendar.MINUTE, scan.nextInt());

		String corCarro = scan.next();
		System.out.println("Qual a cor do Carro?");
		String placaCarro = scan.next();
		System.out.println("Qual a placa do carro?");
		String modeloCarro = scan.next();
		System.out.println("Qual o modelo do Carro?");

		Veiculo carro = new Veiculo(corCarro,placaCarro,modeloCarro,null,null);

		String corMoto = scan.next();
		System.out.println("Qual a cor da moto?");
		String placaMoto = scan.next();
		System.out.println("Qual a placa da moto?");
		String modeloMoto = scan.next();
		System.out.println("Qual o modelo da moto?");


		Veiculo moto = new Veiculo( corMoto , placaMoto, modeloMoto,null, null);
		carro.setEntrada(calendario.getTime());
		System.out.println("O carro entrou as " + carro.getEntrada());

		Calendar calendario2 = Calendar.getInstance();
		calendario2.set(Calendar.HOUR, scan.nextInt());
		calendario2.set(Calendar.MINUTE, scan.nextInt());
		carro.setSaida(calendario2.getTime());
		System.out.println("O carro saiu as " + carro.getSaida());

		ControleDeEntrada controle = new ControleDeEntrada();
		long tempo = (long)ControleDeEntrada.CalcularTempoParado(carro.getEntrada(),
				Carro.getSaida());

		System.out.println("O carro ficou " + tempo + " minutos");
		double valorPago = ControleDeEntrada.valorAPagar(tempo);
		System.out.println("Foi pago o valor de " + valorPago);

		Calendar calendarioMoto = Calendar.getInstance();
		calendarioMoto.set(Calendar.HOUR,scan.nextInt());
		calendarioMoto.set(Calendar.MINUTE, scan.nextInt());

		moto.setEntrada((Date) calendarioMoto.getTime());
		System.out.println("A moto entrou as " + moto.getEntrada());


		calendarioMoto.set(Calendar.HOUR,scan.nextInt());
		calendarioMoto.set(Calendar.MINUTE,scan.nextInt());

		moto.setSaida(calendarioMoto.getTime());
		System.out.println("A moto saiu as " + moto.getSaida());

		tempo = (long)ControleDeEntrada.CalcularTempoParado(moto.getEntrada(), 
				moto.getSaida());
		System.out.println("A Moto ficou " + tempo + " minutos");

		valorPago = ControleDeEntrada.CalcularTempoParado(null,null);
		System.out.println("Foi pago o valor de " + valorPago);
		scan.close();
	}
	double totalDeVagas = digiteDouble ("Quantas vagas deseja ter em seu estacionamento? ");
	double vagaMoto = digiteDouble ("Quantas vagas de moto você deseja ter ? ");
	public static double digiteDouble(String string) {
		System.out.println(string);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();




	}

}
