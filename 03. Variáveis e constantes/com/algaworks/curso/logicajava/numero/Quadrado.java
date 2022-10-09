package com.algaworks.curso.logicajava.numero;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner valor = new Scanner(System.in);
		
		int numero, resultado;
		
		System.out.print("Digite o numero para calcular do quadrado");
		numero = valor.nextInt();
		
		resultado = numero * numero;
		
		System.out.println("O resultado da multiplica��o �: " + resultado);

	}

}
