package com.hotelmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanagement.entity.Admin;
import com.hotelmanagement.repository.adminRepository;
import java.util.*;

@Service
public class adminService {
	@Autowired
	private adminRepository aRepo;
	
	

	public Admin validate(int id,String pwd)
	{
		Optional<Admin> o = aRepo.findById(id);
		if(o.isPresent() && o.get().getPassword().equals(pwd))
			return o.get();
		else
			return null;
	}
	
}
