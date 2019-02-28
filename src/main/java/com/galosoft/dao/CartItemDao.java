package com.galosoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.galosoft.entities.Cart;
import com.galosoft.entities.CartItem;



public interface CartItemDao extends JpaRepository<CartItem, Integer> {
	
	@Query("from CartItem where productId=:productId")
	CartItem getCartItemByProductId(@Param("productId") int productId); 
	
	
}