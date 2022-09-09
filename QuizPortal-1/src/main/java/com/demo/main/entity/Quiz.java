package com.demo.main.entity;

import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class Quiz {
	private List<Question> questions;
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}
