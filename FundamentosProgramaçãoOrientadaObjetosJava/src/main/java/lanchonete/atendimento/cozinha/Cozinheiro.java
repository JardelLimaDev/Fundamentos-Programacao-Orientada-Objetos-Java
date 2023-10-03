package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	//pode ser default 
	public void adicionarLancheBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL");
	}
	//pode ser default 
		public void adicionarSucoBalcao() {
			System.out.println("ADICIONANDO SUCO");
	}
	//pode ser default 
		public void adicionarComboBalcao() {
			adicionarLancheBalcao();
			adicionarSucoBalcao();
	}
	
		private void prepararLanche() {
			System.out.println("PREPARANDO LANCHE TIPO");
	}
		private void prepararVitamina() {
			System.out.println("PREPARANDO VITAMINA");
	}	
		
		private void prepararCombo() {
			prepararLanche();
			prepararVitamina();
	}	
		private void selecionarIgredientesLanche() {
			System.out.println("SELECIONANDO PÃO, ALFACE, TOMATE, CARNE, OVO");
	}
		private void selecionarIgredientesVitamina() {
			System.out.println("SELECIONANDO FRUTA, LEITE, AÇUCAR");
	}	
		
		private void lavarIngredientes() {
			System.out.println("LAVANDO INGREDIENTES");
	}
		private void baterVitamninaLiquidificador() {
			System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
	}
		public void fritarIngredientesLanche() {
			System.out.println("FRITANDO CARNE, OVO");
	}

		private void pedirTrocarGas(Almoxarife meuAmigo) {
			meuAmigo.trocarGas();
	}
		private void pedirIngredientes(Almoxarife almoxarife) {
			almoxarife.entregarIngredientes();
	}	
				
		
}
