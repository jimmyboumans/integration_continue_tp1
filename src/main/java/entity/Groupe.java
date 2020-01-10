package entity;

public class Groupe {

	private int idGroupe;
	private String libelleGroupe;
	
	public Groupe(int idGroupe, String libelleGroupe) { 
		this.idGroupe = idGroupe;
		this.libelleGroupe = libelleGroupe;
	}

	public int getIdGroupe() {
		return idGroupe;
	}

	public String getLibelleGroupe() {
		return libelleGroupe;
	}
}
