package br.com.zup.testeprojeto;

import java.util.Scanner;

import br.com.zup.projeto.Carro;
import br.com.zup.projeto.Moto;

public class TesteCarro {

	public static void definicaoDosVeiculos () {
	
		Scanner scan = new Scanner(System.in);

		System.out.println("\nO seu veículo é carro ou moto?");
		String resString = scan.next();

		if (resString.equalsIgnoreCase("carro")) {
			criarCarro();
		} else {
			criarMoto();
		}
	}

	public static Moto criarMoto() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a placa da sua moto?" );
		String placa = scan.next();
		
		System.out.println("\nQual o modelo da sua moto" );
		String modelo = scan.next();
		
		System.out.println("\nQual a cor da sua moto?" );
		String cor = scan.next();

		Moto motos = new Moto(modelo, placa, cor);
		
		System.out.println(motos);
		System.out.println("Autorizado a entrada!");
		String resposta = scan.next();
		return null;
	}

	public static Carro criarCarro() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nQual o tipo de veículo? \nIdoso\nDeficiente\nOu Comum?");
		String resposta = scan.next();
		
		System.out.println("\nQual a placa do seu veiculo?" );
		String placa = scan.next();
		
		System.out.println("\nQual o modelo do seu veiculo?" );
		String modelo = scan.next();
		
		System.out.println("\nQual a cor do seu veiculo?" );
		String cor = scan.next();


		if (resposta.equalsIgnoreCase("Comum")) {
			Carro carroComum = new Carro(modelo, placa, cor, true, false, false);
			System.out.println(carroComum);
			return carroComum;

		} else if (resposta.equalsIgnoreCase("Idoso")) {
			Carro carroIdoso = new Carro(modelo, placa, cor, false, true, false);
			System.out.println(carroIdoso);
			return carroIdoso;
		} else if (resposta.equalsIgnoreCase("Deficiente")) {
			Carro carroDeficiente = new Carro(modelo, placa, cor, false, false, true);
			System.out.println(carroDeficiente);
			return carroDeficiente;
		} else {
			System.out.println("Veiculo não autorizado!");
			return null;
		}
	}
}
