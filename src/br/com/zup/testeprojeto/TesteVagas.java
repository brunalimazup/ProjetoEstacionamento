package br.com.zup.testeprojeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.zup.projeto.Vaga;

public class TesteVagas {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		double totalDeVagas = 0;
		double porcentagem = 5;
		double vagaDeficiente = 0;
		double vagaIdoso = 0;
		double vagaMoto = 0;
		double vagaComum = 0;

		System.out.println("Qual o total de vagas do seu estacionamento?");
		totalDeVagas = scan.nextDouble();

		System.out.println("Qual o total de vagas de moto do seu estaciomento?");
		vagaMoto = scan.nextDouble();


		vagaDeficiente = (totalDeVagas*porcentagem)/100;
		vagaIdoso = (totalDeVagas*porcentagem)/100;
		vagaComum = (totalDeVagas - vagaMoto - vagaIdoso - vagaDeficiente);

		Vaga vagas = new Vaga(totalDeVagas, vagaIdoso, vagaDeficiente, vagaMoto, vagaComum);
		System.out.println(vagas);
		
		  List <Vaga> listaDeVagas = new ArrayList <Vaga> ();
		  listaDeVagas.add
		    System.out.println(listaDeVagas);
	}
}
