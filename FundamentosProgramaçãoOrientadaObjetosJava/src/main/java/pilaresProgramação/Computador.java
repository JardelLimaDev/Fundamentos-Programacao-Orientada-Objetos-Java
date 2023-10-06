package pilaresProgramação;

public class Computador {
	public static void main(String[] args) {
		MSNMenssenger msn = new MSNMenssenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger face = new FacebookMessenger();
		face.enviarMensagem();
		face.receberMensagem();
		
		Telegram tel = new Telegram();
		tel.enviarMensagem();
		tel.receberMensagem();
		
	}
	
}
