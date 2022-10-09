package com.algaworks.curso.logicajava.tres;

public class EncontrarDivisor {

	public static void main(String[] args) {
		
		int divisores = 0,inicio;
		
		Integer[] numeros = new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };
		
		
		for (inicio = 0; inicio < numeros.length; inicio++) {
			divisores = numeros[inicio] % 3;
			
			if(divisores == 0) {
				System.out.println("\t");
				System.out.println("Esse numero � divis�vel por 3: " + numeros[inicio]);
				
			} else {
				System.out.println("\t");
				System.out.println("Esses numeros n�o s�o divis�veis por 3: " + numeros[inicio]);
			}
			
		}
		
	}

}
