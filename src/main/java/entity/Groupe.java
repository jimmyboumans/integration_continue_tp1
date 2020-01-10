package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Groupe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idGroupe;
	private String libelleGroupe;
	
	@OneToOne
	private ContratCadre contratCadre;
	

	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}

	public void setLibelleGroupe(String libelleGroupe) {
		this.libelleGroupe = libelleGroupe;
	}

	public void setContratCadre(ContratCadre contratCadre) {
		this.contratCadre = contratCadre;
	}

	public int getIdGroupe() {
		return idGroupe;
	}

	public String getLibelleGroupe() {
		return libelleGroupe;
	}
	
	public ContratCadre getContratCadre() {
		return contratCadre;
	}
}
