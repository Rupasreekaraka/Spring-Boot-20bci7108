package com.hotelmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {
	
    @Id
    private int id;
    private String name;
    private int age;
    private String gender;
    private String carcompany;
    private String carmodel;
    private String available;
	public Driver(int id, String name, int age, String gender, String carcompany, String carmodel, String available) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.carcompany = carcompany;
		this.carmodel = carmodel;
		this.available = available;
	}
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCarcompany() {
		return carcompany;
	}
	public void setCarcompany(String carcompany) {
		this.carcompany = carcompany;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	
    
}
