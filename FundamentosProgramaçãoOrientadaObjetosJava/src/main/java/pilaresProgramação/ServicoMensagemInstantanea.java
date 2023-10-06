package pilaresProgramação;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//somente classes filhas conhecem esse metodo
	protected void validarConexaoInternet() {
		System.out.println("Conectado com a internet!");
	}

}
