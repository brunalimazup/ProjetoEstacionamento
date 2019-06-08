package br.com.zup.projeto;

import java.util.Scanner;
import br.com.zup.projeto.Vaga;

public class TesteEstacionamento {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	double entrada = digiteDouble ("Informe o seu horário de entrada: ");
	double saida = digiteDouble ("Informe o seu horário de saida: ");
	double tolerancia = 15;
	 double precoHora = 15.00;
	double precoHoraAdicional = 5.00;
		double totalDeVagas = digiteDouble ("Quantas vagas deseja ter em seu estacionamento? ");
        double porcentagem = 5;
		double vagaDeficiente;
		double vagaIdoso;
		double vagaMoto = digiteDouble ("Quantas vagas de moto você deseja ter ? ");

		vagaDeficiente = (totalDeVagas*porcentagem)/100;
		vagaIdoso = (totalDeVagas*porcentagem)/100;

		Vaga vagas = new Vaga(totalDeVagas, vagaIdoso, vagaDeficiente, vagaMoto);
		System.out.println(vagas);
		
		ControleDeEntrada entrada = new ControleDeEntrada(entrada, saida, tolerancia, precoHora, precoHoraAdicional)
		 }

	public static double digiteDouble(String string) {
		System.out.println(string);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
