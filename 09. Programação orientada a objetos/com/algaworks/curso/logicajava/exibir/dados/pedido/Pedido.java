package com.algaworks.curso.logicajava.exibir.dados.pedido;

public class Pedido {
	
	String codigo;
	
	double subtotal;
	
	double desconto;
	
	public boolean temDesconto () {
		
		return subtotal >= 150;
		
	}
	public double getTotal() {
		
		return subtotal - desconto;
		
	}

	public void setTotal(double total) {

	}
	
	public String getCodigo() {
		
		return codigo;
		
	}

	public void setCodigo(String codigo) {
		
		this.codigo = codigo;
		
	}

	public double getSubtotal() {
		
		return subtotal;
		
	}

	public void setSubtotal(double subtotal) {
		
		this.subtotal = subtotal;
		
	}

	public double getDesconto() {
		
		return desconto;
		
	}

	public void setDesconto(double desconto) {
		
		this.desconto = desconto;
	}

	
}
