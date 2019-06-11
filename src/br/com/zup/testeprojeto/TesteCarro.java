package br.com.zup.testeprojeto;
import java.util.Scanner;

import br.com.zup.projeto.Carro;
public class TesteCarro {

	public static void main(String[] args) {
	
//	System.out.println("Informe o tipo de carro: ");
	boolean carroComum;
	boolean carroIdoso;
	boolean carroDf;

 
	criarCarro();
		
		
		
	}
	public static void criarCarro() {
		Scanner scan = new Scanner(System.in);
		System.out.println("O seu carro é Comum?");
		String resposta = scan.next();
	
		if(resposta.equalsIgnoreCase("Sim")) {
			Carro carro1 = new Carro(true, false, false);
		}else if (resposta.equalsIgnoreCase("não")) {
			System.out.println("é de idoso?");
			 String resposta2 = scan.next();
		    if (resposta2.equalsIgnoreCase("Sim")) {
				Carro carro2 = new Carro(false, true, false);
		    }else { 
		    	System.out.println("Seu carro é de Deficiente?");
		        String resposta3 = scan.next();
				Carro carro3 = new Carro(false, false, true);

		    }
	
	}

}
