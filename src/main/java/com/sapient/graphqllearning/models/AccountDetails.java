package com.sapient.graphqllearning.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AccountDetails {

	public int id;
	public String name;
	public String email;
	public boolean active;
	
	
	
	public AccountDetails(int id, String name, String email, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.active = active;
	}
	
	
	
	public AccountDetails() {
		super();
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
