package com.game.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 

public class partie {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private int idPartie; 
	private int level;
	private int heartsRemainings;
	public partie() {
		super();
		this.level = 0;
		this.heartsRemainings = 3;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHeartsRemainings() {
		return heartsRemainings;
	}
	public void setHeartsRemainings(int heartsRemainings) {
		this.heartsRemainings = heartsRemainings;
	}
	@Override
	public String toString() {
		return "partie [idPartie=" + idPartie + ", level=" + level + ", heartsRemainings=" + heartsRemainings + "]";
	}
	

	

}
