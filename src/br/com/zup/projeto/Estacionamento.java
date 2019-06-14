package br.com.zup.projeto;
import java.util.Scanner;
import java.util.Calendar;

public class Estacionamento {

	public static Calendar perguntarHorarioEntrada() {

		Calendar calendarioHorarioEntrada = Calendar.getInstance();

		calendarioHorarioEntrada.set(Calendar.HOUR_OF_DAY,Integer.parseInt(digiteString("\nHorario de Entrada do veiculo ->")));

		calendarioHorarioEntrada.set(Calendar.MINUTE, Integer.parseInt(digiteString("\nOs minutos -> ")));

		calendarioHorarioEntrada.set(Calendar.SECOND, Integer.parseInt(digiteString("\nOs segundos -> ")));
		
		
		System.out.println("\nO horario que você entrou foi -> " + calendarioHorarioEntrada.getTime());
		return calendarioHorarioEntrada;
	}

	public static Calendar perguntarHorarioSaida() {

		Calendar calendarioHorarioSaida = Calendar.getInstance();

		calendarioHorarioSaida.set(Calendar.HOUR_OF_DAY, Integer.parseInt(digiteString("\nHorario de Saida do veiculo -> ")));

		calendarioHorarioSaida.set(Calendar.MINUTE, Integer.parseInt(digiteString("\nOs minutos -> ")));

		calendarioHorarioSaida.set(Calendar.SECOND, Integer.parseInt(digiteString("\nOs segundos -> ")));

		
		System.out.println("\nO horario que você saiu foi -> " + calendarioHorarioSaida.getTime());
		return calendarioHorarioSaida;

	}

	public static String digiteString(String string) {
		System.out.println(string);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}