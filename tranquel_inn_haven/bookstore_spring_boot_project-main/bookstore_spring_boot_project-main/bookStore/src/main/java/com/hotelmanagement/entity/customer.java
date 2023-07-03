package com.hotelmanagement.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class customer {
	
 @Id
 private int id;
 private String name;
 private int age;
 private String gender;
 private String address;
 private String idproof;
 private String idnumber;
 private String country;
 private int roomnumber;
 private String phoneno;
 private String days;
 private float deposit;
 private String bedtype;
 
 
public customer(int id, String name, int age, String gender, String address, String idproof, String idnumber,
		String country, int roomnumber, String phoneno, String days, float deposit) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.address = address;
	this.idproof = idproof;
	this.idnumber = idnumber;
	this.country = country;
	this.roomnumber = roomnumber;
	this.phoneno = phoneno;
	this.days = days;
	this.deposit = deposit;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getIdproof() {
	return idproof;
}
public void setIdproof(String idproof) {
	this.idproof = idproof;
}
public String getIdnumber() {
	return idnumber;
}
public void setIdnumber(String idnumber) {
	this.idnumber = idnumber;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
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
public String getDays() {
	return days;
}
public void setDays(String days) {
	this.days = days;
}
public float getDeposit() {
	return deposit;
}
public void setDeposit(float deposit) {
	this.deposit = deposit;
}
public String getBedtype() {
	return bedtype;
}
public void setBedtype(String bedtype) {
	this.bedtype = bedtype;
}
public customer(String bedtype) {
	super();
	this.bedtype = bedtype;
}
public customer() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
}
