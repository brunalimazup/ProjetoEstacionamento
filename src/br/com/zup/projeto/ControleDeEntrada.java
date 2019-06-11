package br.com.zup.projeto;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class ControleDeEntrada {

	public static double CalcularTempoParado(Date entrada, Date saida) {
		double minutos = 0;
		long milseg = saida.getTime() - entrada.getTime();
		double seg   = milseg/1000.0;
		minutos = seg/60.0;
		return minutos;
	}

	public static double valorAPagar(double minutos) {
		double valorAPagar = 0;

		if(minutos <= 15) {
			valorAPagar = 0;
		}else if(minutos > 15 && minutos <= 60) {
			valorAPagar = 10;
		}else { 
			valorAPagar = 10;
			double horas = transformarMinHora(minutos);
			horas = horas - 1;
			valorAPagar = valorAPagar + horas * 5;
		}
		return valorAPagar;
	}

	public static long transformarMinHora(double minutos) {
		double horas = minutos/60;


			Calendar calendario = Calendar.getInstance();
			calendario.set(Calendar.DAY_OF_MONTH, 1);
			calendario.set(Calendar.HOUR_OF_DAY, 10);
			calendario.set(Calendar.MINUTE, 20);

			Veiculo carro = new Veiculo();
			carro.setEntrada(calendario.getTime());
			System.out.println("O carro entrou as " + carro.getEntrada());

			Calendar calendario2 = Calendar.getInstance();
			calendario2.set(Calendar.DAY_OF_MONTH, 1);
			calendario2.set(Calendar.HOUR_OF_DAY, 10);
			calendario2.set(Calendar.MINUTE, 36);
			carro.setSaida(calendario2.getTime());
			System.out.println("O carro saiu as " + carro.getSaida());

			ControleDeEntrada controle = new ControleDeEntrada();
			long tempo = (long)ControleDeEntrada.CalcularTempoParado(carro.getEntrada(),
					Carro.getSaida());

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

			moto.setEntrada((Date) calendarioMoto.getTime());
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

			tempo = (long)ControleDeEntrada.CalcularTempoParado(moto.getEntrada(), 
					moto.getSaida());
			System.out.println("A Moto ficou " + tempo + " minutos");
			Date entrada;
			Date saida;
			valorPago = ControleDeEntrada.CalcularTempoParado(entrada, saida);
			System.out.println("Foi pago o valor de " + valorPago);



			sc.close();
			
			return (long) horas;
		}	
	}

