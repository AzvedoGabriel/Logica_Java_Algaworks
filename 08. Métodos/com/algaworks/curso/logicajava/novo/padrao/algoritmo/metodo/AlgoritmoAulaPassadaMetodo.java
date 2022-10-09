package com.algaworks.curso.logicajava.novo.padrao.algoritmo.metodo;

import java.util.Scanner;

public class AlgoritmoAulaPassadaMetodo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avan�ado"};
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);

		System.out.print("O curso que voc� deseja � o: ");
		Integer posicaoCursoEscolhido = scan.nextInt();
		
		posicaoEscolha(posicaoCursoEscolhido, cursos);
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cart�o", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo: ");	
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);

		System.out.print("Sua forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = scan.nextInt();
		
		posicaoEscolha(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);
		
		scan.close();
	}
	
	static void posicaoEscolha(Integer posicao,String [] vetor) {
		Boolean posicaoValida = posicao >= 0 && posicao < vetor.length; 
		if (!posicaoValida) {
			posicaoInvalidada();
		}
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
	}
	
	static void imprimirTraco() {
		System.out.println("________________________________");
	}
	
	static void posicaoInvalidada() {
		System.err.println("Posi��o inv�lida, Renicie a aplica��o!");
		System.exit(1);
	}
}
