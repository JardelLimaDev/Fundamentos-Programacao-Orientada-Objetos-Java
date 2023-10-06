package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {
	public static void main(String[] args) {
		/*
			Impressora impressora = new Deskjet();
		
			impressora.imprimir();
		 */
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = em;
		Copiadora copiadora = em;
		Digitalizadora digitalizadora = em;
		
		impressora.imprimir();
		copiadora.copiar();
		digitalizadora.digitalizar();
		
		
	}
}	
