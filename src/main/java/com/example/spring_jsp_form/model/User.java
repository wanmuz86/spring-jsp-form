package com.example.spring_jsp_form.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {
	
	@NotEmpty(message="Name is required")
	@Size(min=3, max=20, message="Name must be between 3 and 20")
	private String name;
	
	@NotEmpty(message="Email is required")
	@Email(message="Enter a valid email")
	private String email;
	
	
	public User() {
		super();
	}


	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
