package br.com.zup.projeto;

public class ControleDeEntrada {
	
	    //Catraca
	public double entrada;
	public double saida;

		public ControleDeEntrada(double entrada, double saida, double tolerancia, double precoHora,
				double precoHoraAdicional) {
			super();
			this.entrada = entrada;
			this.saida = saida;
		}
		public double getEntrada() {
			return entrada;
		}
		
		public void setEntrada(double entrada) {
			this.entrada = entrada;
		}
		
		public double getSaida() {
			return saida;
		}
		
		public void setSaida(double saida) {
			this.saida = saida;
		}
		
		@Override
		public String toString () {
			String vagas = "";
			
			vagas += "Hora de Entrada = " + this.getEntrada();
			vagas += "\nHora de saída = " + this.getSaida();
			
			return vagas;
			
		}
	}
		
		
