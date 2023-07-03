package com.hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelmanagement.entity.checkout;


@Repository
public interface checkoutRepository extends JpaRepository<checkout,Integer>  {

}
