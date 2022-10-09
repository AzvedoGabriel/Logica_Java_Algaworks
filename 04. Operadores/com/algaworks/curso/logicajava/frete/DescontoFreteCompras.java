package com.algaworks.curso.logicajava.frete;

import java.util.Scanner;

public class DescontoFreteCompras {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valorProduto,jurosSimples = 0.5;
		double valorFinalDoProduto;
		double valorFrete = 15;
		double resultadoJuros = 0;
		int opcaoPagamentos,pagamentoOpcaoAVista = 0;
		System.out.println("Bem vindos, Acima de R$ 100,00 Frete Gr�tis e Acima de R$ 250,00 ter� juros de 5% parcelado.");
		System.out.println();
		
		System.out.print("Informe o valor do produto: ");
		valorProduto = scan.nextDouble();
		
		boolean semFrete = valorProduto >=100;
		
		if (semFrete) {
			System.out.println("O frete ser� Gratis!!");
		} else {
			System.out.println("O frete ser� de R$: " + valorFrete);
		}
		
		System.out.print("Informe a Op��o de pagamento - [1 = A vista / 2 = Parcelado]: ");
		opcaoPagamentos = scan.nextInt();
		
		if (opcaoPagamentos == 1) {
			System.out.print("Pagamento a vista, Selecione as op��es [1 = Boleto / 2 = Debito / 3 = Pix / 4 = Dinheiro]: ");
			pagamentoOpcaoAVista = scan.nextInt();
		} else if (opcaoPagamentos == 2) {
			System.out.println("O pagamento Ser� Parcelado no Cart�o de Cr�dito!");
			
			System.out.println("O valor da compra foi de R$: " + valorProduto);
		}
		
		boolean pagamentoAcimaDoEsperado = valorProduto > 250;
		
		if(pagamentoAcimaDoEsperado && opcaoPagamentos == 2) {
			System.out.println("O valor entrar� com juros");
			
			resultadoJuros = (valorProduto * (jurosSimples / 100));
		}
		
		if(pagamentoOpcaoAVista == 1) {
			System.out.println("O Pagamento ser� realizado via Boleto");
		} else if (pagamentoOpcaoAVista == 2) {
			System.out.println("o pagamento ser� realizado via Cart�o de Debito");
		}else if (pagamentoOpcaoAVista == 3) {
			System.out.println("O pagamento ser� realizado via Pix");
		}else if (pagamentoOpcaoAVista == 4) {
			System.out.println("O pagamento ser� realizado por Dinheiro");
		}
		
		valorFinalDoProduto = valorProduto + valorFrete;
		
		if (opcaoPagamentos == 1) {
			System.out.println("A compra no total deu R$: " + valorFinalDoProduto);
		} else if(pagamentoAcimaDoEsperado) {
			System.out.println("Pagamento realizado no cart�o de cr�dito, o total da compra deu R$: " + valorProduto + "," + 
		"Com juros de: " + resultadoJuros + "% ao m�s");
		}
		
		scan.close();
	}

}
