package com.algaworks.curso.logicajava.bonus;

import java.util.Scanner;

public class BonusFuncionarioMes {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double metaFaturamentoAnual, faturamentoReal, mediaSalarialFuncionario;
		
		double calculoBonusSalarial;
		
		double bonusMetaMenor, calculoPorcentagemSalarial,valorSalarialComBonus;
		
		System.out.print("Por favor informe a meta de faturamento anual da empressa R$ ");
		metaFaturamentoAnual = scan.nextDouble();
		
		System.out.print("Por favor informe o faturamento real da empresa no ultimo ano R$ ");
		faturamentoReal = scan.nextDouble();
		
		System.out.print("Por favor informe a media salarial do funcionario(a,e) R$ ");
		mediaSalarialFuncionario = scan.nextDouble();
		
		calculoBonusSalarial = mediaSalarialFuncionario * 2;
		
		boolean bonusSalarialFuncionario = faturamentoReal >= metaFaturamentoAnual;
		
		bonusMetaMenor = (metaFaturamentoAnual * 0.8);
		
		boolean calculoMeta = (faturamentoReal < metaFaturamentoAnual) && (faturamentoReal >= bonusMetaMenor);
		
		calculoPorcentagemSalarial = (mediaSalarialFuncionario * 0.8);
		
		if (bonusSalarialFuncionario) {
			System.out.println("Os funcionarios ganharam um bônus que sera igual a media salarial deles baseada no ano passado.");
			
			System.out.print("O salario seria de R$ " + calculoBonusSalarial);
			
		} else if (calculoMeta) {
			
			System.out.println("Os funcionarios ganham um bonus de 80% na media salarial deles baseada no ano passado.");
			
			System.out.println("O Bonus foi de: " + calculoPorcentagemSalarial);
			
			valorSalarialComBonus = calculoPorcentagemSalarial + mediaSalarialFuncionario;
			
			System.out.println("O salario sera de R$ " + valorSalarialComBonus);
			
		} else if(!bonusSalarialFuncionario) {
			System.out.print("O Funcionario não teria o Bonus, Faturamento foi abaixo do esperado, Salario permanece R$ " + mediaSalarialFuncionario);
		}
		scan.close();
	}

}
