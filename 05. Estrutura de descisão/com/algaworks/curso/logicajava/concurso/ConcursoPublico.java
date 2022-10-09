package com.algaworks.curso.logicajava.concurso;

import java.util.Scanner;

public class ConcursoPublico {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int notaDoCandidatoDaProvaPortugues, notaDaProvaDoCandidatoMatematica, calculoNota, calculoFaltaNotaMatematica, calculoFaltaNotaPortugues;
	
		int notaTotalProvas = 60;
	
		System.out.println("Bom dia / Boa tarde / Boa noite!!");
		
		System.out.println("Por favor insira a nota de Portugu�s do candidato: ");
		notaDoCandidatoDaProvaPortugues = scan.nextInt();
		
		System.out.println("Por favor insira a nota de Matem�tica do candidato: ");
		notaDaProvaDoCandidatoMatematica = scan.nextInt();
		
		System.out.println("A nota do candidato n�o pode ser menor que 60 nas duas provas e "
				+ "ter uma nota minima ou acima de 150 pontos para conquistar a vaga e Para fechar a prova s�o 200 pontos !!!");
		System.out.println();
		
		calculoNota = notaDoCandidatoDaProvaPortugues + notaDaProvaDoCandidatoMatematica;
		
		boolean notaMinimaParaVaga = calculoNota >= 150;
		
		boolean notaMinimaParaProvaMat = (notaDaProvaDoCandidatoMatematica >=60) ;	
		
		boolean notaMinimaEMaximaParaProvaDePort = (notaDoCandidatoDaProvaPortugues >=60);
		
		boolean notaExcedida = calculoNota > 200;
		
		if (notaMinimaParaProvaMat && notaMinimaParaVaga && notaMinimaEMaximaParaProvaDePort && !notaExcedida) {
			
			System.out.println("Parabens ele atingiu a nota necessaria para ser aprovado");
			System.out.println("A nota foi de: " + calculoNota +" pontos");
			
		}
		
		if (!notaMinimaEMaximaParaProvaDePort ) {
			
			calculoFaltaNotaPortugues =  notaTotalProvas - notaDoCandidatoDaProvaPortugues;
			System.out.println("Voc� n�o atingiu a nota minima na prova de Portugu�s, falto: " + calculoFaltaNotaPortugues + " ponto(s) para 60");
			
		} else if (!notaMinimaParaProvaMat) {
			
			calculoFaltaNotaMatematica = notaTotalProvas - notaDaProvaDoCandidatoMatematica;
			System.out.println("Voc� n�o atingiu a nota minima na prova de Matem�tica, falto: " + calculoFaltaNotaMatematica + " ponto(s) para 60");
			
		} else if (!notaMinimaParaVaga  && notaMinimaParaProvaMat && notaMinimaEMaximaParaProvaDePort) {
			
			System.out.println("Voc� atingiu as notas necessarias nas duas provas - " + notaDaProvaDoCandidatoMatematica + " pontos" + " e " + notaDoCandidatoDaProvaPortugues + " pontos" + "," + 
					"\npor�m no valor total (soma das duas notas) voc� atingiu abaixo do esperado - " + calculoNota + " pontos e precisar est� acima de - " + 150 + " pontos" );
			
		}else if ((notaMinimaParaProvaMat && notaDaProvaDoCandidatoMatematica > 100) || (notaMinimaEMaximaParaProvaDePort && notaDoCandidatoDaProvaPortugues > 100)) {
			System.out.println("Nota Invalida, renicie a aplica��o e calcule novamente a nota!!");
			System.out.println("Pontua��o m�xima nas Provas � de 100 pontos");
		}
		
		boolean completouAProva = (notaDaProvaDoCandidatoMatematica == 100) && (notaDoCandidatoDaProvaPortugues == 100);
		
		if (completouAProva) {
			System.out.println("Parabens voc� completou a prova com a Pontua��o total de: " + calculoNota);
			
		}
		
		scan.close();
	}

}
