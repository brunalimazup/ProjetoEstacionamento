package br.com.zup.projeto;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class ControleDeEntrada {

	public static double CalcularTempoParado(Date entrada, Date saida) {
		double minutos = 0;
		long milseg = entrada.getTime() - saida.getTime();
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


			return (long) horas;
		}	
	}

