package entity;

public class Article {

	private int idArticle;
	private String refArticle;
	private String libelleArticle;
	private double prixArticle;
	public Article(int idArticle, String refArticle, String libelleArticle, double prixArticle) {
		super();
		this.idArticle = idArticle;
		this.refArticle = refArticle;
		this.libelleArticle = libelleArticle;
		this.prixArticle = prixArticle;
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
	
}
