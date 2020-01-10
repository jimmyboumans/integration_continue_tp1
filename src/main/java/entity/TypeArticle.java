package entity;

public class TypeArticle {
	
	private int idTypeArticle;
	private String libelleTypeArticle;
	
	public TypeArticle(int idTypeArticle, String libelleTypeArticle) {
		super();
		this.idTypeArticle = idTypeArticle;
		this.libelleTypeArticle = libelleTypeArticle;
	}

	public int getidTypeArticle() {
		return idTypeArticle;
	}

	public String getlibelleTypeArticle() {
		return libelleTypeArticle;
	}

}
