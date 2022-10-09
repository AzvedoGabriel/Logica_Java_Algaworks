package com.algaworks.curso.logicajava.diferente;


public class DivisorDeTres {

	public static void main(String[] args) {
		
		int divisores = 0;
		int inicio = 0;
		
		Integer[] numeros = new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		while (inicio < numeros.length) {
			divisores = numeros[inicio] % 3;
			
			if(divisores == 0) {
				System.out.println("\t");
				System.out.println("Esse numero � divis�vel por 3: " + numeros[inicio]);
				
			} else {
				System.out.println("\t");
				System.out.println("Esses numeros n�o s�o divis�veis por 3: " + numeros[inicio]);
				
			}
		inicio ++;
		}

	}
}
