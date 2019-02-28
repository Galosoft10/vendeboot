package com.galosoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galosoft.entities.ShippingAddress;

public interface ShippingAddressDao extends JpaRepository<ShippingAddress, Integer> {

}
