package com.hotelmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanagement.entity.room;
import com.hotelmanagement.repository.roomRepository;

@Service
public class roomService {
	@Autowired
	private roomRepository rRepo;
	
	public void save(room r) {
		rRepo.save(r);
	}
	
	public void deleteById(int id) {
		rRepo.deleteById(id);
	}

	public java.util.List<room> getAllrooms() {
		// TODO Auto-generated method stub
		return rRepo.findAll();
	}
	public room getroomById(int id) {
		return rRepo.findById(id).get();
	}
	
}
