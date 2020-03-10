package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TypeArticle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTypeArticle;
	private String libelleTypeArticle;  	
	
	public TypeArticle(int idTypeArticle, String libelleTypeArticle) {
		super();
		this.idTypeArticle = idTypeArticle;
		this.libelleTypeArticle = libelleTypeArticle;
	}

	public int getIdTypeArticle() {
		return idTypeArticle;
	}

	public void setIdTypeArticle(int idTypeArticle) {
		this.idTypeArticle = idTypeArticle;
	}

	public String getLibelleTypeArticle() {
		return libelleTypeArticle;
	}

	public void setLibelleTypeArticle(String libelleTypeArticle) {
		this.libelleTypeArticle = libelleTypeArticle;
	} 

}
