package com.algaworks.curso.logicajava.calculo.multiplicacao;

import java.util.Scanner;

public class EquacaoMulti {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bom dia / Boa Tarde / Boa noite");
		System.out.println();
		System.out.println("Digite um n�mero que deseja multiplica at� 10: ");
		int guardaNumero = scan.nextInt();
		
		
		imprimirTabuada(guardaNumero, 0);
		scan.close();
	}
	
	static double imprimirTabuada (int numeroMultiplicando, int multiplicadorReal) {
		int resultado = numeroMultiplicando * multiplicadorReal;
		
		System.out.println("O resultado da multiplica��o: " + numeroMultiplicando + "x" + multiplicadorReal + " = " + resultado);
		
		if(multiplicadorReal < 10) {
			++multiplicadorReal;
			imprimirTabuada(numeroMultiplicando, multiplicadorReal);
		}
			return resultado;
	}

}
