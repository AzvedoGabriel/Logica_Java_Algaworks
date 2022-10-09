package com.algaworks.curso.logicajava.imprimir;

import java.util.Scanner;

public class NomeConsole {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner pessoa = new Scanner(System.in);
		
		String nome, sobrenome;
		
		String nome1, sobrenome2;
		
		System.out.print("Vendedor informe o seu nome : ");
		nome = pessoa.nextLine();
		
		System.out.print("Vendedor informe o seu sobrenome : ");
		sobrenome = pessoa.nextLine();
		
		System.out.print("Informe o nome do seu cliente: ");
		nome1 = pessoa.nextLine();
		
		System.out.print("Informe o sobrenome do seu cliente: ");
		sobrenome2 = pessoa.nextLine();
		
		
		System.out.println("Muito prazer: " + nome1 + " " + sobrenome2 +","+ " Sou o vendedor: " + nome + " " + sobrenome +","+
				" Vou lhe orientar para  a melhor escolha do produto");

	}

}
