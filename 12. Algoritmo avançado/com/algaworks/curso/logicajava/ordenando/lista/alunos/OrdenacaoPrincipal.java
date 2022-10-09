package com.algaworks.curso.logicajava.ordenando.lista.alunos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class OrdenacaoPrincipal {

	public static void main(String[] args) throws IOException {
		
		Path nomeAluno = Paths.get("C:\\Users\\User\\Desktop\\Tarefa do Dia\\Nomes.TXT");
		
		List<String>linhas = Files.readAllLines(nomeAluno);
		
		// For usado para Ordena��o utilizando Bubble Sort
		for (int i = 0; i < linhas.size(); i++) {
			
			for( int j = i+1; j<linhas.size(); j++) {
				
				if (linhas.get(i).compareTo(linhas.get(j)) > 0) {
					
					String aux = linhas.get(i);
					
					linhas.set(i,linhas.get(j));
					
					linhas.set(j,aux);
					
				}
				
			}
			
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Lista em ordem Alfabetica");
		
		// Exibi��o da Lista na tela
		for (int x = 0; x <linhas.size(); x++) {
			String nomeUsuario = linhas.get(x);
			
			System.out.println("Nomes " + x + ": " + nomeUsuario);
		}
	}
	
}
