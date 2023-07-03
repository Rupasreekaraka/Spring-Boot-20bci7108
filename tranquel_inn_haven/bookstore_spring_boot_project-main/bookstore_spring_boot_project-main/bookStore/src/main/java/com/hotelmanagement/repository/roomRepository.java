package com.hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelmanagement.entity.room;

@Repository
public interface roomRepository extends JpaRepository<room,Integer>{
  
}
