package entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idClient;
	private String nomSocieteClient;
	@ManyToMany
	private List<Article> listeAchatArticle;
	@OneToOne
	private Groupe groupe;
	
	
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getNomSocieteClient() {
		return nomSocieteClient;
	}
	public void setNomSocieteClient(String nomSocieteClient) {
		this.nomSocieteClient = nomSocieteClient;
	}
	public List<Article> getListeAchatArticle() {
		return listeAchatArticle;
	}
	public void setListeAchatArticle(List<Article> listeAchatArticle) {
		this.listeAchatArticle = listeAchatArticle;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
	
}
