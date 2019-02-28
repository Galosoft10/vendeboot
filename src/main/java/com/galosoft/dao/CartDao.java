package com.galosoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.galosoft.entities.Cart;


public interface CartDao extends JpaRepository<Cart, Integer>{
	
	//@Query("from User where cartId=:cartId")
	//Cart getCartByCartId(@Param("cartId") int cartId);
	
	//void update(Cart cart);


}
