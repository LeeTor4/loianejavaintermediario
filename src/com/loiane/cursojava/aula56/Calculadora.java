package com.loiane.cursojava.aula56;

public class Calculadora {
	
	enum Operacao{
		
		ADICAO("+") {
			@Override
			public double calcular(double x, double y) {
				return x+y;
			}
		}, SUBTRACAO("-") {
			@Override
			public double calcular(double x, double y) {
				return x-y;
			}
		}, MULTIPLICACAO("*") {
			@Override
			public double calcular(double x, double y) {
				return x*y;
			}
		}, DIVICAO("/") {
			@Override
			public double calcular(double x, double y) {
				return x/y;
			}
		};
		String operador;		
		private Operacao(String operador) {
			
			this.operador = operador;
		}
		
		
		public abstract double calcular(double x, double y);
		
		@Override
		public String toString() {
			
			return this.operador;
		}
	}

	public static void main(String[] args) {
		
		double v1 = 40;
		double v2 = 20;
		
		for(Operacao op :  Operacao.values()) {
			
			System.out.print(v1 + " ");
			System.out.print(op.operador + " ");
			System.out.print(v2 + " = ");
			System.out.println(op.calcular(v1, v2));
		}
		
		System.out.println();
		Operacao op1 = Operacao.valueOf(Operacao.class, "DIVICAO");
		
		System.out.println("Simbolo " +  op1);
	}

}
