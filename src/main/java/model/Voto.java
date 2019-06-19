package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="voto")
public class Voto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "voto_id", updatable = true, nullable = true)
	private Long voto_id;
	@Column(name="eleitor_id")
	private String eleitor_id;
	@Column(name="candidato_id")
	private String candidato_id;

	public Voto(){
	}

	public long getVotoId() {
		return voto_id;
	}

	public void setVotoId(long voto_id) {
		this.voto_id = voto_id;
	}

	public String getEleitorId() {
		return eleitor_id;
	}

	public void setEleitorId(String eleitor_id) {
		this.eleitor_id = eleitor_id;
	}

	public String getCandidatoId() {
		return candidato_id;
	}

	public void setCandidatoId(String candidato_id) {
		this.candidato_id = candidato_id;
	}

	
}
