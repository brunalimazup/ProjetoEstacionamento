package br.com.zup.testeprojeto;
import java.util.Scanner;
import br.com.zup.projeto.Vaga;

public class TesteVagas {
	public static void vagasDoEstacionamento() {
		Scanner scan = new Scanner(System.in);

		int totalDeVagas = 0;
		int porcentagem = 5;
		int vagasDeficientes = 0;
		int vagasIdoso = 0;
		int vagasMotos = 0;
		int vagasComuns = 0;

		System.out.println("Qual o total de vagas do seu estacionamento?");
		totalDeVagas = scan.nextInt();

		System.out.println("Qual o total de vagas de moto do seu estaciomento?");
		vagasMotos = scan.nextInt();


		vagasDeficientes = (totalDeVagas*porcentagem)/100;
		vagasIdoso = (totalDeVagas*porcentagem)/100;
		vagasComuns = (totalDeVagas - vagasMotos - vagasIdoso - vagasDeficientes);

		Vaga vagas = new Vaga(totalDeVagas, vagasIdoso, vagasDeficientes, vagasMotos, vagasComuns);
		System.out.println(vagas);

	
	}
}
