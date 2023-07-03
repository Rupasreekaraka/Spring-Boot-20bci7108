package com.hotelmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class checkout {
	
 @Id
 private String name;
 private int roomnumber;
 private String phoneno;
 private float deposit;
 private float pending;
public checkout(String name, int roomnumber, String phoneno, float deposit, float pending) {
	super();
	this.name = name;
	this.roomnumber = roomnumber;
	this.phoneno = phoneno;
	this.deposit = deposit;
	this.pending = pending;
}
public checkout() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoomnumber() {
	return roomnumber;
}
public void setRoomnumber(int roomnumber) {
	this.roomnumber = roomnumber;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public float getDeposit() {
	return deposit;
}
public void setDeposit(float deposit) {
	this.deposit = deposit;
}
public float getPending() {
	return pending;
}
public void setPending(float pending) {
	this.pending = pending;
}
 
}