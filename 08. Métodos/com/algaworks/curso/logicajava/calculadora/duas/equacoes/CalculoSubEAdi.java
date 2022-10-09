package com.algaworks.curso.logicajava.calculadora.duas.equacoes;

import java.util.Scanner;

public class CalculoSubEAdi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int operacaoEscolha;
		double numeroCalculadora1, numeroCalculadora2;
		
		double resultado;
		
		System.out.println("Calculadora de Adi��o ou Subtra��o");
		
		numeroCalculadora1 = pegaNumero(scan);
		
		imprimirTraco();
		
		numeroCalculadora2 = pegaNumero(scan);
		
		imprimirTraco();
		
		operacaoEscolha = escolhaAOperacaoParaCalcular(scan);
		
		imprimirTraco();
		
		resultado = realizarFinalInformacao(operacaoEscolha, numeroCalculadora1, numeroCalculadora2);
		
		System.out.println("O resultado da conta �: " + resultado);
		
		imprimirTraco();
		
		scan.close();
	}
	
	static int escolhaAOperacaoParaCalcular (Scanner scan) {
		
		String [] qualFormaCalcular = new String[] { "Adi��o", "Subtra��o"};
		
		System.out.println("Escolha a abaixo as op��es para fazer a Conta!!");
		
		for(int i = 0; i < qualFormaCalcular.length; i++) {
			System.out.println("[" + i + "] " + qualFormaCalcular[i]);
		}
		
		System.out.print("Informe o calculo que deseja Fazer : ");
		
		return scan.nextInt();
	} 
	
	static double pegaNumero (Scanner scan) {
		System.out.println("Informe o n�mero: ");
		return scan.nextDouble();
	}
	
	static double realizarFinalInformacao(int operacaoEscolha, double numeroCalculadora1, double numeroCalculadora2) {
		
		double resultado = 0.0;
		
		switch (operacaoEscolha) {
		case 0: 
			resultado = adicaoCalculo(numeroCalculadora1, numeroCalculadora2);
			break;
		case 1: 
			resultado = subtracaoCalculo(numeroCalculadora1, numeroCalculadora2);
			break;
		default: 
			System.err.println("Posi��o inv�lida!");
			System.exit(1);
		}
		
		return resultado;
	}
		
	
	static double adicaoCalculo (double numeroCalculadora1, double numeroCalculadora2) {
		
		double resultadoAdicao = numeroCalculadora1 + numeroCalculadora2;
		
		return resultadoAdicao;
	}
	
	static double subtracaoCalculo (double numeroCalculadora1, double numeroCalculadora2) {
		
		double resultadoSubtracao = numeroCalculadora1 + numeroCalculadora2;
		
		return resultadoSubtracao;
	}
	
	
	static void imprimirTraco() {
		System.out.println("---------------------------------------");
	}
}
