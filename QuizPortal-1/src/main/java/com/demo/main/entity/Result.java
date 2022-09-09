package com.demo.main.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "results")
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String email;
	private int totalCorrect = 0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTotalCorrect() {
		return totalCorrect;
	}
	public void setTotalCorrect(int totalCorrect) {
		this.totalCorrect = totalCorrect;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(int id, String username, String email, int totalCorrect) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.totalCorrect = totalCorrect;
	}

	

}