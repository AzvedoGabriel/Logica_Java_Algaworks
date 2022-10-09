package com.algaworks.curso.logicajava.mostrando.lista.tarefa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ListaTarefaMostrar {

	public static void main(String[] args) throws IOException {
		
		Path listaDoDia = Paths.get("C:\\Users\\User\\Desktop\\Tarefa do Dia\\listaDodia.TXT");
		
		List<String>linhas = Files.readAllLines(listaDoDia);
		
		for (int i = 0; i < linhas.size(); i++) {
			
			String tarefaDia = linhas.get(i);
			
			System.out.println("Tarefa do dia " + i + ": " + tarefaDia);
		}
	}

}
