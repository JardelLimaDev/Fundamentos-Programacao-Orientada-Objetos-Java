package pilaresProgramação;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("65894");
		//jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("25228");
		z400.ligar();
		
		//ou z400
		Veiculo coringa = jeep;
		coringa.ligar();
		
		
		
	}
	
	
	
}
