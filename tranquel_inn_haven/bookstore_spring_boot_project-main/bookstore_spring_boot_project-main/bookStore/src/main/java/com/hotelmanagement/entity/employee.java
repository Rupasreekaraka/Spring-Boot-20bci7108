package com.hotelmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String gender;
	private String job;
	private float salary;
	private long aadhar;
	private String email;
	private long phone;
	public employee(int id, String name, int age, String gender, String job, float salary, long aadhar, String email,
			long phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.job = job;
		this.salary = salary;
		this.aadhar = aadhar;
		this.email = email;
		this.phone = phone;
	}
	public employee() {
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
		
}