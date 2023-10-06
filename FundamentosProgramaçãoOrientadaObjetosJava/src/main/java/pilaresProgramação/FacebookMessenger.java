package pilaresProgramação;

public class FacebookMessenger {
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo Facebook");
		salvarHistoricoMenssagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando se esta conectado com a internet");
	}
	private void salvarHistoricoMenssagem() {
		System.out.println("Salvando Historico mensagem");
	}
	
	
}
