package entity;

import java.util.*;


public class ContratCadre {
   
	private int idContratCadre; 
	private double tauxContratCadre;
	
	public ContratCadre(int idContratCadre, double tauxContratCadre) {
		super();
		this.idContratCadre = idContratCadre;
		this.tauxContratCadre = tauxContratCadre;
	}
	public int getIdContratCadre() {
		return idContratCadre;
	}
	public void setIdContratCadre(int idContratCadre) {
		this.idContratCadre = idContratCadre;
	}
	public double getTauxContratCadre() {
		return tauxContratCadre;
	}
	public void setTauxContratCadre(double tauxContratCadre) {
		this.tauxContratCadre = tauxContratCadre;
	}
	

   
   

}