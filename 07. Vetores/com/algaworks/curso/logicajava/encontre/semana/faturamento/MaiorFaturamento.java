package com.algaworks.curso.logicajava.encontre.semana.faturamento;

public class MaiorFaturamento {

	public static void main(String[] args) {
		double[] semanaUm = new double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		double[] semanaDois = new double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		double[] semanaTres = new double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		double[] semanaQuatro = new double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		double[][] mes = new double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		double[] semana;
		
		double faturamentoSemanaTotal = 0.0, faturamentoSemanal;
		
		int semanaMaiorValor = 0, i;
		
		for (i = 0; i < mes.length; i++ ) {
			semana = mes[i];
			
			faturamentoSemanal = 0.0;
			
			for (int x = 0; x < semana.length; x++) {
				faturamentoSemanal += semana[x];
			}
			
			boolean faturamentoMaior = faturamentoSemanal > faturamentoSemanaTotal;
			
			if (faturamentoMaior) {
				faturamentoSemanaTotal = faturamentoSemanal;
				semanaMaiorValor = i + 1;
				
			}
		}
		
		System.out.println("Semana " + semanaMaiorValor + " conseguiu faturar maior que : " + faturamentoSemanaTotal + ".");
	}

}
