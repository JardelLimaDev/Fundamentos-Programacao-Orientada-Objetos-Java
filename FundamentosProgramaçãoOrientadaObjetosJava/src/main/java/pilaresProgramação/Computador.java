package pilaresProgramação;

import apps.FacebookMessenger;
import apps.MSNMenssenger;
import apps.Telegram;

public class Computador {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea pc = null;
		/*
		 * NÃO SABE QUAL APP 
		 * MAS QUALQUER UM DEVERA ENVIAR E RECEBER MENSAGEM
		 */
		
		String appEscolhido = "msn";
		
		if (appEscolhido.equals("msn")) {
			pc = new MSNMenssenger();
		}else if (appEscolhido.equals("face")) {
			pc = new FacebookMessenger();
		}else if (appEscolhido.equals("telegram")) {
			pc = new Telegram();
		}
		
		pc.enviarMensagem();
		pc.receberMensagem();
		
	}
	
}
