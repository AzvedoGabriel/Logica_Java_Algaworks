package com.algaworks.curso.logicajava.usando.biblioteca.curso;

import console.Interacao;

public class BibliotecaExercicio {

	public static void main(String[] args) {
		Interacao interacao = new Interacao();
		
		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");;
		
		Double valorPassadoPeloCliente = interacao.lerDecimal("Digite quantidade passada pelo cliente: ");;
		
		Double trocoPassar = valorPassadoPeloCliente - valorProduto;
		
		interacao.imprimir("Troco: " + trocoPassar);
		
		interacao.fechar();

	}

}
