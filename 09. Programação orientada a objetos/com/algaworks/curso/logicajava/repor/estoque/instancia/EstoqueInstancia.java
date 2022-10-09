package com.algaworks.curso.logicajava.repor.estoque.instancia;

import java.util.Scanner;

public class EstoqueInstancia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Produto produto = new Produto();
		produto.nomeProduto = "";
		produto.produtosGuardadosEmEstoque = 0;
		
		produto.pegarProduto(scan);
		
		produto.pegaEstoque(scan);
		
		produto.exibirProduto();
		
		produto.reposicaoEstoque();
	}

}
