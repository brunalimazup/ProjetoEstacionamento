package br.com.zup.projeto;

public class ControleDeEntrada {
	
	    //Catraca
	public double entrada;
	public double saida;
		public double tolerancia = 15;
		public double precoHora = 15.00;
		public double precoHoraAdicional = 5.00;
		
		public ControleDeEntrada(double entrada, double saida, double tolerancia, double precoHora,
				double precoHoraAdicional) {
			super();
			this.entrada = entrada;
			this.saida = saida;
			this.tolerancia = tolerancia;
			this.precoHora = precoHora;
			this.precoHoraAdicional = precoHoraAdicional;
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
		
		public double getTolerancia() {
			return tolerancia;
		}
		
		public void setTolerancia(double tolerancia) {
			this.tolerancia = tolerancia;
		}
		
		public double getPrecoHora() {
			return precoHora;
		}
		
		public void setPrecoHora(double precoHora) {
			this.precoHora = precoHora;
		}
		
		public double getPrecoHoraAdicional() {
			return precoHoraAdicional;
		}
		
		public void setPrecoHoraAdicional(double precoHoraAdicional) {
			this.precoHoraAdicional = precoHoraAdicional;
		}
		
		@Override
		public String toString () {
			String vagas = "";
			
			vagas += "Hora de Entrada = " + this.getEntrada();
			vagas += "\nHora de saída = " + this.getSaida();
			vagas += "\nMinutos de Tolerancia = " + this.getTolerancia();
			vagas += "\nPreço da hora = " + this.getPrecoHora();
			vagas += "\nValor Adicional após 1 Hora = " + this.getPrecoHoraAdicional();
			
			return vagas;
			
		}
	}
		
		
