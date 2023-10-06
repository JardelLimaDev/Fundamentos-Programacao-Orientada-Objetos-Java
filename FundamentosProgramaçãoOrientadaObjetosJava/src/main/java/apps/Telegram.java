package apps;

import pilaresProgramação.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConexaoInternet();
		System.out.println("Envando mensagem pelo TELEGRAM");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo TELEGRAM");
	}

	
}
