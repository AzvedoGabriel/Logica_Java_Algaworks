package com.algaworks.curso.logicajava.desconto;

import java.util.Scanner;

public class VendasDescontoProduto {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantidade,tipoEscolha = 0;
		
		double desconto = 0, valor, subTotal = 0;
		
		double desconT = 0;
		double valorT  = 0;
		
		System.out.print("Digite o valor do produto: ");
		valor = scan.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		quantidade = scan.nextInt();
	
		 boolean armazem = quantidade < 10;
		
		System.out.print("Escolha a forma de pagamento - Digite [1 = A vista / 2 = Parcelado]: ");
		int formaPagamento = scan.nextInt();
		
		boolean Pagamentos = formaPagamento == (1);
		
		if (Pagamentos) {
			System.out.print("Pagamento a vista, escolha as op��es [ 1 = Boleto / 2 = Debito / 3 = Pix / 4 = Dinheiro]: ");
			tipoEscolha = scan.nextInt();
		}
		
		if (quantidade >= 10) {
			
			System.out.print("Pagamento com Desconto");
			System.out.println();
			desconto = 10;	
		} else {
			System.out.println("Pagamento sem desconto");
		}
		
		subTotal = valor * quantidade;
		
		desconT = (subTotal * desconto) / 100;
		
		valorT = subTotal - desconT;
				
		if(tipoEscolha == 1) {
			System.out.println("O Pagamento ser� realizado via Boleto");
		} else if (tipoEscolha == 2) {
			System.out.println("o pagamento ser� realizado via Cart�o de Debito");
		}else if (tipoEscolha == 3) {
			System.out.println("O pagamento ser� realizado via Pix");
		}else if (tipoEscolha == 4) {
			System.out.println("O pagamento ser� realizado por Dinheiro");
		} else if (Pagamentos == false) {
			System.out.println("O pagamento ser� realizado no cart�o de Credito");
		}
		
		if (quantidade < 10) {
			System.out.println("O valor Total da compra deu R$:" + subTotal + "," + " Quantindade que foi comprada: " + quantidade);
		
		}else {
			System.out.println("O valor total da compra deu R$:" + subTotal + "," +" com desconto ser� de R$:" + valorT + "," 
		+ " e o desconto foi R$: " + desconT);
		}
		
		scan.close();
	}
}
