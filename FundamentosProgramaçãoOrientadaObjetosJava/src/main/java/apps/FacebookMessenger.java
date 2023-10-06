package apps;

import pilaresProgramação.ServicoMensagemInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo FACE");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo FACE");
	}
	
	
}
