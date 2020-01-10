package entity;

public class Article { 
	private int idArticle;
	private String refArticle;
	private String libelleArticle;
	private double prixArticle;
	private TypeArticle typeArticle;
	
	public Article(int idArticle, String refArticle, String libelleArticle, double prixArticle, TypeArticle typeArticle) {
		this.idArticle = idArticle;
		this.refArticle = refArticle;
		this.libelleArticle = libelleArticle;
		this.prixArticle = prixArticle;
		this.typeArticle = typeArticle;
	}
	public int getIdArticle() {
		return idArticle;
	}
	public String getRefArticle() {
		return refArticle;
	}
	public String getLibelleArticle() {
		return libelleArticle;
	}
	public double getPrixArticle() {
		return prixArticle;
	}
	public TypeArticle getTypeArticle() {
		return typeArticle;
	}
}
