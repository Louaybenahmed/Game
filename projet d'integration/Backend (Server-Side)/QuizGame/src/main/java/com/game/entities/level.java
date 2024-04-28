package com.game.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 

public class level {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private int NumLevel; 
	private String Difficulty;
	private String Description;
	public level(String difficulty, String description) {
		super();
		Difficulty = difficulty;
		Description = description;
	}
	public level() {
		super();
	}
	public int getNumLevel() {
		return NumLevel;
	}
	public void setNumLevel(int numLevel) {
		NumLevel = numLevel;
	}
	public String getDifficulty() {
		return Difficulty;
	}
	public void setDifficulty(String difficulty) {
		Difficulty = difficulty;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "level [NumLevel=" + NumLevel + ", Difficulty=" + Difficulty + ", Description=" + Description + "]";
	}
	
}
