package pilaresProgramação;

public class Telegram {

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo Telegram");
		salvarHistoricoMenssagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando se esta conectado com a internet");
	}
	private void salvarHistoricoMenssagem() {
		System.out.println("Salvando Historico mensagem");
	}
}
