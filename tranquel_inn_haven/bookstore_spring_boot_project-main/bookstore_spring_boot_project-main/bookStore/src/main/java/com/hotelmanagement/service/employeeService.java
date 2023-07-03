package com.hotelmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanagement.entity.employee;
import com.hotelmanagement.repository.employeeRepository;

@Service
public class employeeService {
	
	@Autowired
	private employeeRepository eRepo;
	
	public void save(employee e) {
		eRepo.save(e);
	}

	public List<employee> getAllemployees() {
		// TODO Auto-generated method stub
		return eRepo.findAll();
	}
	
	public void deleteByID(int id) {
		eRepo.deleteById(id);
	}
	
	public employee getEmployeeById(int id) {
		return eRepo.findById(id).get();
	}
}
