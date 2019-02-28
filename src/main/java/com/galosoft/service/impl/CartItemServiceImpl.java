package com.galosoft.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.galosoft.dao.CartItemDao;
import com.galosoft.entities.Cart;
import com.galosoft.entities.CartItem;
import com.galosoft.service.CartItemService;


@Service
public class CartItemServiceImpl implements CartItemService {
	
	@Autowired
	private CartItemDao cartItemDao;
	

	@Override
	public void addCartItem(CartItem cartItem) {
		cartItemDao.save(cartItem);
		
	}

	@Override
	public void removeCartItem(CartItem cartItem) {
		cartItemDao.delete(cartItem);
		
	}

	@Override
	public void removeAllCartItems(Cart cart) {
    List<CartItem> cartItems = cart.getCartItems();
		
		for(CartItem item: cartItems) {
			removeCartItem(item);
        }
	}

	@Override
	public CartItem getCartItemByProductId(int productId) {
		
		return cartItemDao.getCartItemByProductId(productId);
	}

}
