package com.game.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="categorie")
public class categorie {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private int idCategorie; 
	private String CategorieName; 
	private String DescriptionCategorie;
	
	public categorie(String categorieName, String descriptionCategorie) {
		super();
		CategorieName = categorieName;
		DescriptionCategorie = descriptionCategorie;
	}

	public categorie() {
		super();
	}

	public String getCategorieName() {
		return CategorieName;
	}

	public void setCategorieName(String categorieName) {
		CategorieName = categorieName;
	}

	public String getDescriptionCategorie() {
		return DescriptionCategorie;
	}

	public void setDescriptionCategorie(String descriptionCategorie) {
		DescriptionCategorie = descriptionCategorie;
	}

	@Override
	public String toString() {
		return "categorie [CategorieName=" + CategorieName + ", DescriptionCategorie=" + DescriptionCategorie + "]";
	} 
	

}
