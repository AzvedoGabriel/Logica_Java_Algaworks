package com.algaworks.curso.logicajava.simples;

import java.util.Scanner;

public class Calculadora {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int escolhaOperacao;
		
		double valorUmUsadoCalcular, numeroDoisUsadoCalcular, conta;
		
		System.out.println("Digite um n�mero que deseja calcular: ");
		valorUmUsadoCalcular = scan.nextDouble();
		
		System.out.println("Digite o segundo n�mero que deseja calcular: ");
		numeroDoisUsadoCalcular = scan.nextDouble();
		
		System.out.println("Digite qual op��o da opera��o a seguir [0 = Resto / 1 = Adi��o / 2 = Subtra��o / "
				+ "3 = Multiplica��o / 4 = Divis�o]: ");
		escolhaOperacao = scan.nextInt();
		
		if (escolhaOperacao == 1){
			
			conta = valorUmUsadoCalcular + numeroDoisUsadoCalcular;
			
			System.out.println("O resultado da Adi��o foi de: " + conta );
			
		} else if  (escolhaOperacao == 2) {
			
			conta = valorUmUsadoCalcular - numeroDoisUsadoCalcular;
			
			System.out.println("O resultado da Subtra��o foi de: " + conta);
			
		} else if (escolhaOperacao == 3) {
			
			conta = valorUmUsadoCalcular * numeroDoisUsadoCalcular;
			
			System.out.println("O Resultado da multiplica��o foi de: " + conta);
		} else if(escolhaOperacao == 4) {
			
			conta = valorUmUsadoCalcular / numeroDoisUsadoCalcular;
			
			System.out.println("O resultado da Divis�o foi de: " + conta);
			
		} else if (escolhaOperacao == 0) {
			
			conta = valorUmUsadoCalcular % numeroDoisUsadoCalcular;
			
			System.out.println("O resultado do Resto da divis�o foi de: " + conta);
			
		}
		System.out.println("Fim da Opera��o");
		scan.close();
	}

}
