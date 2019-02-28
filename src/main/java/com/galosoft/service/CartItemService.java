package com.galosoft.service;

import com.galosoft.entities.Cart;
import com.galosoft.entities.CartItem;

public interface CartItemService {
	
	void addCartItem(CartItem cartItem);
	void removeCartItem(CartItem cartItem);
	void removeAllCartItems(Cart cart);
    CartItem getCartItemByProductId(int productId);

}
