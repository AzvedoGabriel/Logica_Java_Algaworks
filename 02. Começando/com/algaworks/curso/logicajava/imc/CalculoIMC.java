package com.algaworks.curso.logicajava.imc;

import java.util.Scanner;

public class CalculoIMC {

	private static final Scanner pessoa = new Scanner(System.in);
	public static void main(String[] args) {

		
		double peso, altura;
		
		String nome;
		
		double IMC;
		
		System.out.print("Informe o nome do paciente: ");
		nome = pessoa.nextLine();
		
		System.out.print("Digite a altura do paciente: ");
		altura = pessoa.nextDouble();
		
		System.out.print("Digite o peso do paciente: ");
		peso = pessoa.nextDouble();
		
		IMC = peso / (altura * altura);
		
		System.out.println("O paciente " + nome + " tem o imc: " + IMC);
	
		
	}

}
