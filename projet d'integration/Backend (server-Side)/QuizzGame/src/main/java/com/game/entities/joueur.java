package com.game.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="player")
public class joueur {  
@Id 
@GeneratedValue (strategy = GenerationType.IDENTITY) 
private int idJoueur; 
private String userName; 
@Column(unique = true)
private String email; 
private String password; 
private int score; 
private int gold;
public joueur(String userName, String email, String password, int score, int gold) {
	super();
	this.userName = userName;
	this.email = email;
	this.password = password;
	this.score = score;
	this.gold = gold;
}
public joueur() {
	super();
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public int getGold() {
	return gold;
}
public void setGold(int gold) {
	this.gold = gold;
}
@Override
public String toString() {
	return "joueur [idJoueur=" + idJoueur + ", userName=" + userName + ", email=" + email + ", password=" + password
			+ ", score=" + score + ", gold=" + gold + "]";
} 

 } 