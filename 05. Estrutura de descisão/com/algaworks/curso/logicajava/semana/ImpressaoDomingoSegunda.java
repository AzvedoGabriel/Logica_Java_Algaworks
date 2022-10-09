package com.algaworks.curso.logicajava.semana;

import java.util.Scanner;

public class ImpressaoDomingoSegunda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dia;
		
		System.out.print("Informe a semana que deseja Marcar, Entre 2 a 6: ");
		dia = scan.nextInt();
		
		switch(dia) {
		
		case 1:
			System.out.println("N�o fazemos consultas no domingo");
			break;
		case 2: 
			System.out.println("Tudo certo, Sua consulta ser� marcada na segunda-Feira");
			break;
		case 3:
			System.out.println("Tudo certo, Sua consulta ser� marcada na ter�a-Feira");
			break;
		case 4: 
			System.out.println("Tudo certo, Sua consulta ser� marcada na quarta-Feira");
			break;
		case 5: 
			System.out.println("Tudo certo, Sua consulta ser� marcada na quinta-Feira");
			break;
		case 6:
			System.out.println("Tudo certo, Sua consulta ser� marcada na sexta-Feira");
			break;
		case 7: 
			System.out.println("N�o fazemos consultas no s�bado");
			break;
		default:
			System.err.println("Por favor digite digite uma op��o valida!!");
			System.exit(1);
		}
		
		System.out.println("Para proximas consulta recomenda-se rodar a aplica��o novamente.");
		
		scan.close();
	}

}
