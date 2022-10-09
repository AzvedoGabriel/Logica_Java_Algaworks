package com.algaworks.curso.logicajava.repor.estoque.instancia;

import java.util.Scanner;

public class Produto {
	
	String nomeProduto;
	
	int produtosGuardadosEmEstoque;
	
	String pegarProduto(Scanner scan) {
		
		System.out.print("Digite o nome do produto: ");
		nomeProduto = scan.nextLine();
		return nomeProduto;
	}
	
	int pegaEstoque(Scanner scan) {
		
		System.out.println("Digite quantos produtos tem em estoque: ");
		
		produtosGuardadosEmEstoque = scan.nextInt();
		
		return produtosGuardadosEmEstoque;
		
	}
	
	void exibirProduto() {
		System.out.println("O produto " + nomeProduto);
	}
	
	boolean reposicaoEstoque () {
		
		boolean necessidadeEstoque;
		
		necessidadeEstoque = produtosGuardadosEmEstoque < 10;
		
		if (necessidadeEstoque) {
			
			System.out.println("Existe necessidade de repor o estoque ela est� abaixo de 10 produtos");
			
		} else {
			System.out.println("N�o existe necessidade o estoque est� igual ou acima a 10 produtos");
		}
		
		return necessidadeEstoque;
	}
}
