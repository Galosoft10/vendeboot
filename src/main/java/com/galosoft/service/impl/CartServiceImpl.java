package com.galosoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.galosoft.dao.CartDao;
import com.galosoft.entities.Cart;
import com.galosoft.service.CartService;

@Service
@Transactional
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;

	@Override
	public Cart getCartById(int cartId) {
		
		return cartDao.getOne(cartId);
	}

	@Override
	public void update(Cart cart) {
		cartDao.save(cart);
		
    }

}
