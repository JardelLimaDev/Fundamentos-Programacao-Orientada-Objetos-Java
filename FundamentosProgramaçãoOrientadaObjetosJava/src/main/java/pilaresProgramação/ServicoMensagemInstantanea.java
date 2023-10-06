package pilaresProgramação;

public abstract class ServicoMensagemInstantanea {
	
	public void enviarMensagem() {
		//primeiro confirma de esta conectado com a internet
		validarConectadoInternet();
		System.out.println("Enviando Mensagem");
		//depois de enviada, salva o historico da mensagem 
		salvarHistoricoMenssagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	//metodos provados, visiveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se esta conectado com a internet");
	}
	private void salvarHistoricoMenssagem() {
		System.out.println("Salvando Historico mensagem");
	}
	
	
}
