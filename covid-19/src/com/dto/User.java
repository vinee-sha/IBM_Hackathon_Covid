package com.dto;

public class User {
	private String emailId;
	private String name;
	private String password;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", name=" + name + ", password=" + password + "]";
	}


	public User(String emailId, String name, String password) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.password = password;
		}

	public User() {
		// TODO Auto-generated constructor stub
	}
	
}
