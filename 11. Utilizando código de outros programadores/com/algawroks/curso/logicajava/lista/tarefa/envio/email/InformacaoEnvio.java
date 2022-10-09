package com.algawroks.curso.logicajava.lista.tarefa.envio.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class InformacaoEnvio {

	static void enviar(String emailPara, String assunto, String mensagem) throws EmailException {

		Email email = new SimpleEmail();
		email.setHostName("smtp.office365.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("biel_10_20@hotmail.com", "gaga15963214789@B"));
		email.setFrom("Exercício Lógica <biel_10_20@hotmail.com>");
		email.setSubject(assunto);
		email.setMsg(mensagem);
		email.addTo(emailPara);
		email.setStartTLSEnabled(true);
		email.setDebug(true);
		email.send();
	}

}
