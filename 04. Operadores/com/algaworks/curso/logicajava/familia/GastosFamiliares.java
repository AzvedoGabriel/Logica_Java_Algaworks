package com.algaworks.curso.logicajava.familia;

import java.util.Scanner;

public class GastosFamiliares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valorContaLuz = 0.0, contaDeAgua = 0.0, valorContaTelefone = 0.0;
		
		double mensalidadeEscolaFilho = 0.0, faturaCartao = 0.0, gastosSupermercado = 0.0;
		
		double calculoTotalConta = 0.0, valorGastoMensal = 0.0, valorTotalMensal = 0.0;
		
		int escolhaPagarCalcular,tipoEscolhaPagamento = 0,opcaoPagamento = 0;
		
		System.out.println("Informe o valor da conta de Luz R$: ");
		valorContaLuz = scan.nextDouble();
		
		System.out.println("Informe o valor da conta de �gua R$: ");
		contaDeAgua = scan.nextDouble();
		
		System.out.println("Inform o valor da conta do Telefone R$: ");
		valorContaTelefone = scan.nextDouble();
		
		System.out.println("Informe a Mensalidade da escola do filho R$: ");
		mensalidadeEscolaFilho = scan.nextDouble();
		
		System.out.println("Informe a Fatura do cart�o R$: ");
		faturaCartao = scan.nextDouble();
		
		System.out.println("Informe o Gasto mensal com supermercado R$: ");
		gastosSupermercado = scan.nextDouble();
		
		valorGastoMensal += mensalidadeEscolaFilho + faturaCartao + gastosSupermercado;
		
		calculoTotalConta += valorContaLuz + contaDeAgua + valorContaTelefone;
		
		valorTotalMensal += calculoTotalConta + valorGastoMensal;
		
		System.out.println("Se Deseja apenas pagar, �gua, Luz e Telefone, Digite [1]. Se Deseja pagar Mensalidade, Fatura e Supermercado, "
				+ "Digite [2]. Se Deseja Pagar Todas, Digite [3]: ");
		escolhaPagarCalcular = scan.nextInt();
		
		if(escolhaPagarCalcular == 1) {
			System.out.println("O valor total das tr�s contas - �gua, Luz e Telefone deu um total de R$ " + calculoTotalConta);
		} else if (escolhaPagarCalcular == 2) {
			System.out.println("O valor total das tr�s contas - Mensalidade Escolar, Fatura do Cart�o e Gasto de Supermercado deu um total de R$: " + valorGastoMensal);
		} else if (escolhaPagarCalcular == 3) {
			System.out.println("O valor total das seis contas - �gua, Luz, Telefone, Mensalidade, Fatura do cart�o, Gasto de Supermecado deu um total de R$: " + valorTotalMensal);
		}
		
		System.out.println("Informe a op��o de pagamento - [1 = A vista / 2 = Credito] ");
		opcaoPagamento = scan.nextInt();
		
		boolean pagamentoEscolhido = opcaoPagamento == (1);
		
		if ((escolhaPagarCalcular == 1 && pagamentoEscolhido) ||(escolhaPagarCalcular == 2 && pagamentoEscolhido) || (escolhaPagarCalcular == 3 && pagamentoEscolhido)) {
			
			System.out.print("Pagamento a vista, escolha as op��es [ 1 = Boleto / 2 = Debito / 3 = Pix / 4 = Dinheiro]: ");
			tipoEscolhaPagamento = scan.nextInt();
		} else if (pagamentoEscolhido == false) {
			System.out.println("O pagamento Ser� realizado no cart�o de Credito");
		}
		
		
		if(tipoEscolhaPagamento == 1) {
			System.out.println("O Pagamento ser� realizado via Boleto");
		} else if (tipoEscolhaPagamento == 2) {
			System.out.println("o pagamento ser� realizado via Cart�o de Debito");
		}else if (tipoEscolhaPagamento == 3) {
			System.out.println("O pagamento ser� realizado via Pix");
		}else if (tipoEscolhaPagamento == 4) {
			System.out.println("O pagamento ser� realizado por Dinheiro");
		}	
		
		System.out.println("Se deseja Realizar uma nova consulta por favor renicie a aplica��o novamente!!");
		
		scan.close();
	}

}

