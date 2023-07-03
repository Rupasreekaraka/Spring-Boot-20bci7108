package com.hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelmanagement.entity.employee;

@Repository
public interface employeeRepository extends JpaRepository<employee,Integer>  {

}
