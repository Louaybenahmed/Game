package com.game.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class possibleAnsewer {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private int idPossibleAnsewer; 
	private String possibleAnsewer;
	public possibleAnsewer(String possibleAnsewer) {
		super();
		this.possibleAnsewer = possibleAnsewer;
	}
	public possibleAnsewer() {
		super();
	}
	public int getIdPossibleAnsewer() {
		return idPossibleAnsewer;
	}
	public void setIdPossibleAnsewer(int idPossibleAnsewer) {
		this.idPossibleAnsewer = idPossibleAnsewer;
	}
	public String getPossibleAnsewer() {
		return possibleAnsewer;
	}
	public void setPossibleAnsewer(String possibleAnsewer) {
		this.possibleAnsewer = possibleAnsewer;
	}
	@Override
	public String toString() {
		return "possibleAnsewer [idPossibleAnsewer=" + idPossibleAnsewer + ", possibleAnsewer=" + possibleAnsewer + "]";
	} 

}
