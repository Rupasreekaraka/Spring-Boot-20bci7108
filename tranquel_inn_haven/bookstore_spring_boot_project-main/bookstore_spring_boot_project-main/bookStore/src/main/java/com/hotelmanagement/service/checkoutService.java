package com.hotelmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanagement.entity.checkout;
import com.hotelmanagement.repository.checkoutRepository;


@Service
public class checkoutService {
	@Autowired
	private checkoutRepository chRepo;
	
	public void save(checkout ch) {
		chRepo.save(ch);
	}
	
	public void deleteById(int id) {
		chRepo.deleteById(id);
	}

	public java.util.List<checkout> getAllcheckouts() {
		// TODO Auto-generated method stub
		return chRepo.findAll();
	}

}
