package com.galosoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.galosoft.entities.Customer;


public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	@Query("from Customer where username=:username")
	Customer getCustomerByUsername(@Param("username") String username);
}
