package br.com.zup.projeto;
import br.com.zup.projeto.Estacionamento;
import br.com.zup.projeto.Vaga;
import br.com.zup.projeto.Veiculo;
import java.util.Scanner;

public class TesteEstacionamento {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		
		double saida = scan1.nextDouble();
		double entrada = scan1.nextDouble();
		
		int idosos = (vagas * 5) / 100;
		int deficiente = (vagas * 5) / 100;
		
		
		Estacionamento estacionamento = new Estacionamento(vagas, entrada,saida);
	
		System.out.println("Qual o total de vagas do estacionamento ? ");
		int vagas = scan1.nextInt();
		
		System.out.println("Qual o total de vagas para moto? ");
		int motos = scan1.nextInt();
		 
		Vagas 
			
	}
}
