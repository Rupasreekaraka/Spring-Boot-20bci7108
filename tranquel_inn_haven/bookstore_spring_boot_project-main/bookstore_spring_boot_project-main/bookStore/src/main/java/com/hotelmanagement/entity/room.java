package com.hotelmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class room {
	
    @Id 
    private int id;
	private String availability;
	private String cleaningstatus;
	private float price;
	private String bedtype;
	public room(int id, String availability, String cleaningstatus, float price, String bedtype) {
		super();
		this.id = id;
		this.availability = availability;
		this.cleaningstatus = cleaningstatus;
		this.price = price;
		this.bedtype = bedtype;
	}
	public room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getCleaningstatus() {
		return cleaningstatus;
	}
	public void setCleaningstatus(String cleaningstatus) {
		this.cleaningstatus = cleaningstatus;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBedtype() {
		return bedtype;
	}
	public void setBedtype(String bedtype) {
		this.bedtype = bedtype;
	}
	
		
}