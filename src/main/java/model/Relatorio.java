package model;

public class Relatorio {
	
	private String candidata;
	private String qtdeVotos;
	private int classificacao;

	public Relatorio() {
	}
	
	public String getCandidato() {
		return candidata;
	}
	public void setCandidato(String candidata) {
		this.candidata = candidata;
	}
	public String getQtdeVotos() {
		return qtdeVotos;
	}
	public void setQtdeVotos(String qtdeVotos) {
		this.qtdeVotos = qtdeVotos;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	
}