package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estar disponiveis
		
		
		//ações que estabelecimento precisa ter ciencia 
		cozinheiro.adicionarSucoBalcao();
		cozinheiro.adicionarLancheBalcao();
		cozinheiro.adicionarComboBalcao();
		
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
	
	}
}
