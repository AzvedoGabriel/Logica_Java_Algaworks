package com.algawroks.curso.logicajava.lista.tarefa.envio.email;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class EnviandoEmail {

	public static void main(String[] args) throws EmailException, IOException {
		
		Scanner scan = new Scanner(System.in);
		
		String terminaLoop = "x";
		String atividadeDoDia = "";
		int info = 0;
		ArrayList<String> linhas = new ArrayList<String>();
		
		System.out.println("Tarefas do dia!!");
		
		System.out.println("Digite abaixo, Para encerrar o programa digite x");
		
		while(atividadeDoDia.equals(terminaLoop) == false) {
			
			System.out.print("Atividade do dia " + info +": ");
			atividadeDoDia = scan.nextLine();
			linhas.add(atividadeDoDia);
			info++;
			
		} 
		
		String tarefas = "";
		
		for (int i = 0; i < linhas.size(); i++) {
			tarefas += linhas.get(i) + "\n"; 
		}

		String mensagem = "Suas tarefas: \n" + tarefas; 
		
		System.out.print("Digite seu email: ");
		String emailPara = scan.nextLine();
		
		InformacaoEnvio.enviar(emailPara,"Sua lista de tarefas", mensagem);
		
		System.out.println("Email enviado...");
		scan.close();
	}
}

