package br.com.zup.projeto;
<<<<<<< HEAD
import java.util.Calendar;
import java.util.Scanner;


public class Estacionamento {
		
		Carro carro = new Carro(carroComum, carroIdoso, carroDf);
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 1);
		calendario.set(Calendar.HOUR_OF_DAY, 10);
		calendario.set(Calendar.MINUTE, 20);
		
		carro.setCarroComum (calendario.getTime());
		System.out.println("O carro entrou as " + carro.getEntrada());
		
		Calendar calendario2 = Calendar.getInstance();
		calendario2.set(Calendar.DAY_OF_MONTH, 1);
		calendario2.set(Calendar.HOUR_OF_DAY, 10);
		calendario2.set(Calendar.MINUTE, 36);
		carro.setSaida(calendario2.getTime());
		System.out.println("O carro saiu as " + carro.getSaida());
		
		ControleDeEntrada controle = new ControleDeEntrada();
		long tempo = (long)ControleDeEntrada.CalcularTempoParado(carro.getEntrada(),
				carro.getSaida());
		
		System.out.println("O carro ficou " + tempo + " minutos");
		double valorPago = ControleDeEntrada.valorAPagar(tempo);
		System.out.println("Foi pago o valor de " + valorPago);
		
		
		Moto moto = new Moto();
		Scanner sc = new Scanner(System.in);
		System.out.println("Que dia voce entrou? ");
		byte dia = sc.nextByte();
		System.out.println("Que hora voce entrou? ");
		byte hora = sc.nextByte();
		System.out.println("Que min voce entrou? ");
		byte min = sc.nextByte();
		
		Calendar calendarioMoto = Calendar.getInstance();
		calendarioMoto.set(Calendar.DAY_OF_MONTH, dia);
		calendarioMoto.set(Calendar.HOUR_OF_DAY, hora);
		calendarioMoto.set(Calendar.MINUTE, min);
		
		moto.setEntrada(calendarioMoto.getTime());
		System.out.println("A moto entrou as " + moto.getEntrada());
		
		System.out.println("Que dia voce saiu? ");
		dia = sc.nextByte();
		System.out.println("Que hora voce saiu? ");
		hora = sc.nextByte();
		System.out.println("Que min voce saiu? ");
		min = sc.nextByte();
		
		calendarioMoto.set(Calendar.DAY_OF_MONTH, dia);
		calendarioMoto.set(Calendar.HOUR_OF_DAY, hora);
		calendarioMoto.set(Calendar.MINUTE, min);
		
		moto.setSaida(calendarioMoto.getTime());
		System.out.println("A moto saiu as " + moto.getSaida());
		
		tempo = (long)ControleDeEntrada.calcularTempoParado(moto.getEntrada(), 
				moto.getSaida());
		System.out.println("A Moto ficou " + tempo + " minutos");
		valorPago = ControleDeEntrada.(tempo);
		System.out.println("Foi pago o valor de " + valorPago);

		
		
		sc.close();
	}
}
