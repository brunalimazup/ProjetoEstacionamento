package br.com.zup.testeprojeto;
import java.util.Date;

import br.com.zup.projeto.ControleDeEntrada;
import br.com.zup.projeto.Estacionamento;


public class App {

	public static void main(String[] args) {
		
		TesteVagas.vagasDoEstacionamento();
		TesteCarro.definicaoDosVeiculos();
		Estacionamento.perguntarHorarioEntrada();
		Estacionamento.perguntarHorarioSaida();
		double minutos;
		ControleDeEntrada.calcularTempoParado(minutos);
		

	}
}
