package lanchonete.area.cliente;

public class Cliente {
	
	public void escolherLanche() {
		System.out.println("ESCOLHENDO LANCHE");
	}
	public void fazerPedido() {
		System.out.println("FAZENDO O PEDIDO");
	}
	public void pagarConta() {
		consultaSaldoAplicativo();
		System.out.println("PAGANDO CONTA");
	}
	private void consultaSaldoAplicativo() {
		System.out.println("CONSULTANDO SALDO NO APLICATIVO");
	}

}
