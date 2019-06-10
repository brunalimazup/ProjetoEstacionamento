package br.com.zup.testeprojeto;
import  java.util.Scanner;
import br.com.zup.projeto.Estacionamento;

public class TesteEstacionamento {
	
	double totalDeVagas = digiteDouble ("Quantas vagas deseja ter em seu estacionamento? ");
	double vagaMoto = digiteDouble ("Quantas vagas de moto você deseja ter ? ");
	
	public static double digiteDouble(String string) {
		System.out.println(string);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
		
	}

}
