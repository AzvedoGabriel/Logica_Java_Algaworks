package com.algaworks.curso.logicajava.lista.de.tarefa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefasDiaria {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		String terminaLoop = "x";
		String atividadeDoDia = "";
		int i = 0;
		ArrayList<String> linhas = new ArrayList<String>();
		
		System.out.println("Tarefas do dia!!");
		
		System.out.println("Digite abaixo, Para encerrar o programa digite x");
		
		while(atividadeDoDia.equals(terminaLoop) == false) {
			
			System.out.print("Atividade do dia " + i +": ");
			atividadeDoDia = scan.nextLine();
			linhas.add(atividadeDoDia);
			i++;
			
		} 
		
		scan.close();
		System.out.println("Fim da aplica��o");
		
		Path listaDoDia = Paths.get("C:\\Users\\User\\Desktop\\Tarefa do Dia\\listaDodia.TXT");
		Files.write (listaDoDia, linhas);
	}

}
