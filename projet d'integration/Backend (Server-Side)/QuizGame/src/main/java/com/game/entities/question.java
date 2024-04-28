package com.game.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
public class question {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private int idQuestion; 
	private String Content; 
	private String CorrectAnswer;
	private int GoldAnswer;
	public question(String content, String correctAnswer, int goldAnswer) {
		super();
		Content = content;
		CorrectAnswer = correctAnswer;
		GoldAnswer = goldAnswer;
	}
	public question() {
		super();
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getCorrectAnswer() {
		return CorrectAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		CorrectAnswer = correctAnswer;
	}
	public int getGoldAnswer() {
		return GoldAnswer;
	}
	public void setGoldAnswer(int goldAnswer) {
		GoldAnswer = goldAnswer;
	}
	@Override
	public String toString() {
		return "question [idQuestion=" + idQuestion + ", Content=" + Content + ", CorrectAnswer=" + CorrectAnswer
				+ ", GoldAnswer=" + GoldAnswer + "]";
	}
	
	
}
