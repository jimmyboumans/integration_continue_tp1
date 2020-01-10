package entity;

import java.util.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class ContratCadre {
   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idContratCadre; 
	private double tauxContratCadre; 
	
	public void setIdContratCadre(int idContratCadre) {
		this.idContratCadre = idContratCadre;
	}

	public void setTauxContratCadre(double tauxContratCadre) {
		this.tauxContratCadre = tauxContratCadre;
	}

	public int getIdContratCadre() {
		return idContratCadre;
	}

	public double getTauxContratCadre() {
		return tauxContratCadre;
	}
}