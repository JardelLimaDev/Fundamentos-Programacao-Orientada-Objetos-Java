package lanchonete;

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
	
		public void prepararLanche() {
			System.out.println("PREPARANDO LANCHE TIPO");
	}
		public void prepararVitamina() {
			System.out.println("PREPARANDO VITAMINA");
	}	
		
		public void prepararCombo() {
			prepararLanche();
			prepararVitamina();
	}	
		public void selecionarIgredientesLanche() {
			System.out.println("SELECIONANDO PÃO, ALFACE, TOMATE, CARNE, OVO");
	}
		public void selecionarIgredientesVitamina() {
			System.out.println("SELECIONANDO FRUTA, LEITE, AÇUCAR");
	}	
		
		public void lavarIngredientes() {
			System.out.println("LAVANDO INGREDIENTES");
	}
		public void baterVitamninaLiquidificador() {
			System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
	}
		public void fritarIngredientesLanche() {
			System.out.println("FRITANDO CARNE, OVO");
	}
		public void pedirTrocarGas(Atendente meuAmigo) {
			meuAmigo.trocarGas();
	}
		public void pedirTrocarGas(Almoxarife meuAmigo) {
			meuAmigo.trocarGas();
	}
		public void pedirIngredientes(Almoxarife almoxarife) {
			almoxarife.entregarIngredientes();
	}	
				
		
}
