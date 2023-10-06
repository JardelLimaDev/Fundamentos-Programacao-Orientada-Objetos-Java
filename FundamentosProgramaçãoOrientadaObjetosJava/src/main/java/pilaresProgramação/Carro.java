package pilaresProgramação;

public class Carro extends Veiculo {

	public void ligar() {
		conferirCambio();
		nivelCombustivel();
		System.out.println("CARRO LIGADO");
	}
	private void nivelCombustivel() {
		System.out.println("Conferindo nivel de gasolina");
	}
	private void conferirCambio() {
		System.out.println("Conferindo cambio em P");
	}
	
}
