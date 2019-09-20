package com.loiane.cursojava.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {
		
		System.out.println(soma(1,2));
		System.out.println(soma2(1,2,5));
		
		int[] vetor = {1,2,3,5,4,6};

		System.out.println(soma3(vetor));
		
		System.out.println(soma4(1,2,3,5,4,6));
	}
	
	static int soma(int a, int b) {
		return a+b;
	}
	
	static int soma2(int a, int b, int c) {
		return a+b+c;
	}
	
	static int soma3(int[] vetor) {
		
		int total = 0;
		
		for(int i =0; i < vetor.length; i++) {
			
			total += vetor[i];
		}
		
		return total;
	}
	
    static int soma4(Integer... vetor) {
		
		int total = 0;
		
		for(int i =0; i < vetor.length; i++) {
			
			total += vetor[i];
		}
		
		return total;
	}

}
