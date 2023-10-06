package pilaresProgramação;

public class MSNMenssenger {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo MSN");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo MSN");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando Conexão com Internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando Historico Mensagem");
	}
}
