package com.hotelmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
  
	@Id
	private int id;
	private String password;
	public Admin(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
