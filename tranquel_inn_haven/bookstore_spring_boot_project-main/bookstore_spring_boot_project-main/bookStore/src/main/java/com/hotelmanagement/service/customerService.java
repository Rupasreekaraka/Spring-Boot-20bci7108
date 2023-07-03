package com.hotelmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotelmanagement.entity.customer;
import com.hotelmanagement.repository.customerRepository;


@Service
public class customerService {
	@Autowired
	private customerRepository cRepo;
	
	public void save(customer c) {
		cRepo.save(c);
	}
	
	public void deleteById(int id) {
		cRepo.deleteById(id);
	}

	public java.util.List<customer> getAllcustomers() {
		// TODO Auto-generated method stub
		return cRepo.findAll();
	}
	public customer getcustomerById(int id) {
		return cRepo.findById(id).get();
	}

}
