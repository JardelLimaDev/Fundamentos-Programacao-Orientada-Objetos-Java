package pilaresProgramação;

public class Computador {
	public static void main(String[] args) {
		MSNMenssenger msn = new MSNMenssenger();
		System.out.println("MSN");
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger face = new FacebookMessenger();
		System.out.println("FACEBOOK");
		face.enviarMensagem();
		face.receberMensagem();
		
		Telegram tel = new Telegram();
		System.out.println("TELEGRAM");
		tel.enviarMensagem();
		tel.receberMensagem();
		
	}
	
}
