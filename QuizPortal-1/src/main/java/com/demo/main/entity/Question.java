package com.demo.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Question {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String question;
	private String OptionA; 
	private String OptionB; 
	private String OptionC; 
	private String OptionD;
	private int ans;
	private int chose;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptionA() {
		return OptionA;
	}
	public void setOptionA(String optionA) {
		OptionA = optionA;
	}
	public String getOptionB() {
		return OptionB;
	}
	public void setOptionB(String optionB) {
		OptionB = optionB;
	}
	public String getOptionC() {
		return OptionC;
	}
	public void setOptionC(String optionC) {
		OptionC = optionC;
	}
	public String getOptionD() {
		return OptionD;
	}
	public void setOptionD(String optionD) {
		OptionD = optionD;
	}
	public int getAns() {
		return ans;
	}
	public void setAns(int ans) {
		this.ans = ans;
	}
	public int getChose() {
		return chose;
	}
	public void setChose(int chose) {
		this.chose = chose;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", OptionA=" + OptionA + ", OptionB=" + OptionB
				+ ", OptionC=" + OptionC + ", OptionD=" + OptionD + ", ans=" + ans + ", chose=" + chose + "]";
	}
	public Question(int id, String question, String optionA, String optionB, String optionC, String optionD, int ans,
			int chose) {
		super();
		this.id = id;
		this.question = question;
		OptionA = optionA;
		OptionB = optionB;
		OptionC = optionC;
		OptionD = optionD;
		this.ans = ans;
		this.chose = chose;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
