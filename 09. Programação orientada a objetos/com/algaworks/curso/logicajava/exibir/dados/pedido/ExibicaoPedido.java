package com.algaworks.curso.logicajava.exibir.dados.pedido;

import java.util.Scanner;
public class ExibicaoPedido {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pedido pedido = new Pedido();
		pedido.codigo = "";
		pedido.desconto = 0.0;
		pedido.subtotal = 0.0;
		
		System.out.print("Por gentileza informe o c�digo da mesa: ");
		pedido.codigo = scan.nextLine();
		
		System.out.println("Valores acima de R$ 150,00 tem desconto");
		
		System.out.print("Informe o valor gasto R$ ");
		pedido.subtotal = scan.nextDouble();
		
		if(pedido.temDesconto()) {
			pedido.desconto = pedido.subtotal * 0.10;
			
			System.out.println("O pedido N�: " + pedido.getCodigo() + " O valor do subtotal da conta deu: " + pedido.getSubtotal() + 
					" Com desconto fica um total de R$ " + pedido.getTotal());
			
		} else {
			
			System.out.println("N�o ter� desconto");
			System.out.println("O pedido N�: " + pedido.getCodigo() + " O valor final da conta deu: " + pedido.getSubtotal());
			
		}
		
		scan.close();
	}

}

