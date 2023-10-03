package lanchonete;

public class Estabelecimento {
	public static void main(String[] args) {
		
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estar disponiveis
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitamninaLiquidificador();
		cozinheiro.selecionarIgredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararVitamina();
		
		//ações que estabelecimento precisa ter ciencia 
		cozinheiro.adicionarSucoBalcao();
		cozinheiro.adicionarLancheBalcao();
		cozinheiro.adicionarComboBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estar disponiveis
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		
		//ações que somente o pacote cozinha precisa
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		//ações que somente o pacote cozinha precisa
		atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria mas o estabelecimento 
		//não definiu normas de atendimento
		cliente.pegarPedidoBalcao();
		
		//ação sigilosa 
		cliente.consultaSaldoAplicativo();
		
		//já pensou os clientes ouvindo que o gas esta acabando
		cozinheiro.pedirTrocarGas(almoxarife);
		cozinheiro.pedirTrocarGas(atendente);

		
	}
}
