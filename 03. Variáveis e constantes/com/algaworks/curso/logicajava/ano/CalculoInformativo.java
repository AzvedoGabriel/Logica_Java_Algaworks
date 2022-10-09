package com.algaworks.curso.logicajava.ano;

import java.util.Scanner;

public class CalculoInformativo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner info = new Scanner(System.in);
		
		int nota = 0;
		
		String nome;
		
		System.out.print("Informe o nome do aluno: ");
		nome = info.nextLine();
		
		System.out.print("Informe a nota do aluno: ");
		nota = info.nextInt();
		
		boolean resultado = nota >= 70;
		
		if(resultado) {
			
			System.out.print("O aluno: " + nome + " est� aprovado");
			
		}else {
		
			System.out.print("O aluno: " + nome + " est� reprovado");
		}
	}

}
