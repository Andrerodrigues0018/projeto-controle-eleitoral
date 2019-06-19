package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="eleitor")
public class Eleitor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "eleitor_id", updatable = true, nullable = true)
	private Long eleitor_id;	
	
	@Column(name="eleitor_nome")
	private String eleitor_nome;
	@Column(name="eleitor_titulo")
	private String eleitor_titulo;
	@Column(name="eleitor_senha")
	private String eleitor_senha;

	public Eleitor(){
	}

	public long getId() {
		return eleitor_id;
	}

	public void setId(long eleitor_id) {
		this.eleitor_id = eleitor_id;
	}

	public String getNome() {
		return eleitor_nome;
	}

	public void setNome(String eleitor_nome) {
		this.eleitor_nome = eleitor_nome;
	}

	public String getTitulo() {
		return eleitor_titulo;
	}

	public void setTitulo(String eleitor_titulo) {
		this.eleitor_titulo = eleitor_titulo;
	}

	public String getSenha() {
		return eleitor_senha;
	}

	public void setSenha(String eleitor_senha) {
		this.eleitor_senha = eleitor_senha;
	}
	
}
