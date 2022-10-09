package com.algaworks.curso.logicajava.repor.estoque.info;

import java.util.Scanner;

public class ReposicaoInformacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int produtosGuardadosEmEstoque;
		String nomeProduto;
		
		nomeProduto = pegarProduto(scan);
		
		produtosGuardadosEmEstoque = pegaEstoque(scan);
		
		exibirProduto(nomeProduto);
		
		reposicaoEstoque(produtosGuardadosEmEstoque);
		
		scan.close();
	}
	
	private static void exibirProduto(String nomeProduto) {
		System.out.println("O produto " + nomeProduto);
	}
	
	private static int pegaEstoque(Scanner scan) {
		
		int produtosGuardadosEmEstoque;
		
		System.out.println("Digite quantos produtos tem em estoque: ");
		
		produtosGuardadosEmEstoque = scan.nextInt();
		
		return produtosGuardadosEmEstoque;
	}
	
	private static String pegarProduto(Scanner scan) {
		String nomeProduto;
		System.out.println("Digite o nome do produto: ");
		nomeProduto = scan.nextLine();
		return nomeProduto;
	}
	
	static boolean reposicaoEstoque (int quantidadeEstoque) {
		
		boolean necessidadeEstoque;
		
		necessidadeEstoque = quantidadeEstoque < 10;
		
		if (necessidadeEstoque) {
			
			System.out.println("Existe necessidade de repor o estoque ela est� abaixo de 10 produtos");
			
		} else {
			System.out.println("N�o existe necessidade o estoque est� igual ou acima a 10 produtos");
		}
		
		return necessidadeEstoque;
	}
	
}
