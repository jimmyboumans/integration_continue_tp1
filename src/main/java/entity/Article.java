package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Article { 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idArticle;
	private String refArticle;
	private String libelleArticle;
	private double prixArticle;
	@OneToOne
	private TypeArticle typeArticle;
	
	public Article(int idArticle, String refArticle, String libelleArticle, double prixArticle) {
		this.idArticle = idArticle;
		this.refArticle = refArticle;
		this.libelleArticle = libelleArticle;
		this.prixArticle = prixArticle;
	}

	public int getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	public String getRefArticle() {
		return refArticle;
	}
	public void setRefArticle(String refArticle) {
		this.refArticle = refArticle;
	}
	public String getLibelleArticle() {
		return libelleArticle;
	}
	public void setLibelleArticle(String libelleArticle) {
		this.libelleArticle = libelleArticle;
	}
	public double getPrixArticle() {
		return prixArticle;
	}
	public void setPrixArticle(double prixArticle) {
		this.prixArticle = prixArticle;
	}
	public TypeArticle getTypeArticle() {
		return typeArticle;
	}
	public void setTypeArticle(TypeArticle typeArticle) {
		this.typeArticle = typeArticle;
	}	
}
