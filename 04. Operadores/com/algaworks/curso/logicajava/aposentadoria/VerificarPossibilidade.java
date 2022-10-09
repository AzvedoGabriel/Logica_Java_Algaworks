package com.algaworks.curso.logicajava.aposentadoria;

import java.util.Scanner;

public class VerificarPossibilidade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idade, contribuicao;
		
		int calculoIdade, calculoContribuicao;
		
		System.out.println("Por favor,informe a idade da pessoa:");
		idade = scan.nextInt();
		
		System.out.println("Por favor, informe o tempo de contribui��o: ");
		contribuicao = scan.nextInt();
		
		boolean  idadeMinimaAposentar = idade >= 55;
		
		boolean tempoMinimoContribuicao = contribuicao >= 25;
		
		if(idadeMinimaAposentar && tempoMinimoContribuicao) {
			System.out.println("Voc� contribuiu para previd�ncia, Pode dar entrada para sua aposentadoria");
		} else {
			System.out.println("Voc� ainda n�o pode aposentar");
		}
		
		calculoIdade = 55 - idade;
		calculoContribuicao = 25 - contribuicao;
		
		if(!idadeMinimaAposentar) {
			System.out.println("Ainda falta: " + calculoIdade + " ano(s) Para contribuir para previd�ncia");
			
		} else if (!tempoMinimoContribuicao) {
			System.out.println("Ainda falta: " + calculoContribuicao + " ano(s) para contribuir para previd�ncia");
		} else if (!idadeMinimaAposentar && !tempoMinimoContribuicao) {
			System.out.println("Falta um total de: " + calculoIdade + "," + " ano(s) e: " + calculoContribuicao + ", " + " Para contribuir para previd�ncia ");
		}
		
		scan.close();
	}

}
