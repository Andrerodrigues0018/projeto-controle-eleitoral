package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="mesario")
public class Mesario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mesario_id", updatable = true, nullable = true)
	private Long mesario_id;	
	
	@Column(name="mesario_nome")
	private String mesario_nome;
	@Column(name="mesario_titulo")
	private String mesario_titulo;
	@Column(name="mesario_senha")
	private String mesario_senha;

	public Mesario(){
	}

	public long getId() {
		return mesario_id;
	}

	public void setId(long mesario_id) {
		this.mesario_id = mesario_id;
	}

	public String getNome() {
		return mesario_nome;
	}

	public void setNome(String mesario_nome) {
		this.mesario_nome = mesario_nome;
	}

	public String getTitulo() {
		return mesario_titulo;
	}

	public void setTitulo(String mesario_titulo) {
		this.mesario_titulo = mesario_titulo;
	}

	public String getSenha() {
		return mesario_senha;
	}

	public void setSenha(String mesario_senha) {
		this.mesario_senha = mesario_senha;
	}
	
}
