package com.hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelmanagement.entity.Driver;

@Repository
public interface driverRepository extends JpaRepository<Driver,Integer>{
  
}
