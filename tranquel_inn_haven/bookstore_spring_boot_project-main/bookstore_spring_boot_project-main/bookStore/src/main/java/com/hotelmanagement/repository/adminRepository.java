package com.hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelmanagement.entity.Admin;

@Repository
public interface adminRepository extends JpaRepository<Admin,Integer>{
  
	
}
