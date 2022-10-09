package com.algaworks.curso.logicajava.tarefas.diarias.importante;

import java.util.Scanner;

public class CadastrandoTaferas {

	public static void main(String[] args) {
		String[] tarefasDoDia = new String[5];
		@SuppressWarnings("resource")
		
		Scanner scan = new Scanner (System.in);
		
		int contador = 0;
		
		System.out.println("Cadastramento das Tarefas!!");
		
		System.out.println("Informe as tarefas mais importantes!!");
		
		for(contador = 0; contador < tarefasDoDia.length; contador++) {
			System.out.print("Informe a " + (contador + 1) + "� tarefa: ");
			tarefasDoDia[contador] = scan.nextLine();
		}
		
		System.out.println();
		
		for (contador = 0; contador < tarefasDoDia.length; contador++) {
			System.out.println("As tarefas do dia s�o: " + tarefasDoDia[contador]);
		}
		
		System.out.println("Fim do codigo");
		
		scan.close();
	}

}
