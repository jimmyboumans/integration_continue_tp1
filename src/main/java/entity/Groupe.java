package entity;

public class Groupe {

	private int idGroupe;
	private String libelleGroupe;
	private ContratCadre contratCadre;
	
	public Groupe(int idGroupe, String libelleGroupe, ContratCadre contratCadre) { 
		this.idGroupe = idGroupe;
		this.libelleGroupe = libelleGroupe;
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
