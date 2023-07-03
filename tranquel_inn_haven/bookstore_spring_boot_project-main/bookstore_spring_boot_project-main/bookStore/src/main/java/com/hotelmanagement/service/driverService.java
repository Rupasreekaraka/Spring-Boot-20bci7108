package com.hotelmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanagement.entity.Driver;
import com.hotelmanagement.repository.driverRepository;

@Service
public class driverService {
	
	@Autowired
	private driverRepository dRepo;
	
	public void save(Driver d) {
		dRepo.save(d);
	}

	public List<Driver> getAlldrivers() {
		// TODO Auto-generated method stub
		return dRepo.findAll();
	}
	
	public void deleteByID(int id) {
		dRepo.deleteById(id);
	}
	
	public Driver getEmployeeById(int id) {
		return dRepo.findById(id).get();
	}
}
