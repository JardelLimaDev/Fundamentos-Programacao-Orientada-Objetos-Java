package lanchonete.atendimento.cozinha;

public class Almoxarife {
	
	private void controlarEntrada() {
		System.out.println("CONTROLANDO ENTRADA DE PRODUTOS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO SAIDA DE PRODUTOS");
	}
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO GAS");
	}
	
	
}
