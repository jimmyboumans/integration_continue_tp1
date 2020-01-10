package entity;

public class Client {

	private int idClient;
	private String nomSocieteClient;
	
	public Client(int idClient, String nomSocieteClient) {
		super();
		this.idClient = idClient;
		this.nomSocieteClient = nomSocieteClient;
	}

	public int getIdClient() {
		return idClient;
	}

	public String getNomSocieteClient() {
		return nomSocieteClient;
	}
}
