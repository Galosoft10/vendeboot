package com.galosoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galosoft.entities.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
