package br.com.zup.testeprojeto;

import java.util.Scanner;

import br.com.zup.projeto.Carro;
import br.com.zup.projeto.Moto;

public class TesteCarro {

	public static void main(String[] args) {

	
//	System.out.println("Informe o tipo de carro: ");
	boolean carroComum;
	boolean carroIdoso;
	boolean carroDf;

 
	criarCarro();
		

		Scanner scan = new Scanner(System.in);

		
		System.out.println("O seu veículo é carro ou moto?");
		String resString = scan.next();
		
		if(resString.equalsIgnoreCase("carro")) {
			criarCarro();
		}else {
			criarMoto();
		}
	}

	public static Moto criarMoto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Autorizado a entrada!");
		String resposta = scan.next();
		return null;
		} 

	public static Carro criarCarro() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o tipo de veículo? \nIdoso\nDeficiente\nOu Comum?");
		String resposta = scan.next();

		if (resposta.equalsIgnoreCase("Comum")) {
			Carro carro = new Carro(resposta, resposta, null, null, resposta, true, false, false);
			return carro;
		} else if (resposta.equalsIgnoreCase("Idoso")) {
			Carro carro = new Carro(false, true, false);
			return carro;
		}else if (resposta.equalsIgnoreCase("Deficiente")) {
			Carro carro = new Carro(false, false, true);
			return carro;
		}else {
			System.out.println("Veiculo não autorizado!");
			return null;
		}
	}
}
