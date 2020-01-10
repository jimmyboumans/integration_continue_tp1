package entity;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private int idClient;
	private String nomSocieteClient;
	private List<Article> listeAchatArticle;
	private Groupe groupe;
	
	public Client(int idClient, String nomSocieteClient, Groupe groupe) {
		this.idClient = idClient;
		this.nomSocieteClient = nomSocieteClient;
		this.listeAchatArticle = new ArrayList<>();
		this.groupe = groupe;
	}

	public int getIdClient() {
		return idClient;
	}

	public String getNomSocieteClient() {
		return nomSocieteClient;
	}
	
	public List<Article> getListeAchatArticle(){
		return this.listeAchatArticle;
	}
	
	public void addArticle(Article articleAchat) {
		this.listeAchatArticle.add(articleAchat);
	}
	
	public Groupe getGroupe() {
		return groupe;
	}
}
