package Enum;

public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo", 11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
	PIAUI ("PI", "Piaui", 13),
	MARANHAO ("MA", "Maranhão", 14),
	CEARA ("CE", "Ceara", 15)
	
	;
	
	private String nome;
	private String sigla;
	private int codigoIBGE;
	
	private EstadoBrasileiro(String sigla, String nome, int codigoIBGE) {
		this.sigla = sigla;
		this.nome = nome;
		this.codigoIBGE = codigoIBGE;
	}
	
	public int getCodigoIBGE() {
		return codigoIBGE;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
