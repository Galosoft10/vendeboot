package com.galosoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galosoft.entities.BillingAddress;

public interface BillingAddressDao extends JpaRepository<BillingAddress, Integer> {

}
