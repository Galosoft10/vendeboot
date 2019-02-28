package com.galosoft.controllers.admin;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.galosoft.entities.Cart;
import com.galosoft.entities.CartItem;
import com.galosoft.entities.Customer;
import com.galosoft.entities.Product;
import com.galosoft.service.CartItemService;
import com.galosoft.service.CartService;
import com.galosoft.service.CustomerService;
import com.galosoft.service.ProductService;

@Controller
@RequestMapping("/rest/cart")
public class CartResourcesController {
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private CartItemService cartItemService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/{cartId}")
	public @ResponseBody Cart getCartById(@PathVariable(value = "cartId") int cartId){
		return cartService.getCartById(cartId);
	}
	
	
	
	@RequestMapping(value="/add/{productId}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void addItem(@PathVariable(value="productId") int productId) {	
		//Customer customer = customerService.getCustomerByUsername(activeUser.getUsername());
		
		Customer customer = customerService.getCustomerByUsername("pepe");
		Cart cart = customer.getCart();
		Product product = productService.getProductById(productId);
		List<CartItem> cartItems = cart.getCartItems();
		
		for(int i = 0; i < cartItems.size(); i++) {
			if(product.getProductId()==cartItems.get(i).getProduct().getProductId()) {
				CartItem cartItem = cartItems.get(i);
				cartItem.setQuantity(cartItem.getQuantity()+1);
				cartItem.setTotalPrice(product.getProductPrice() * cartItem.getQuantity());
				System.out.println(cartItem);
				cartItemService.addCartItem(cartItem);
				return;
			}
		}
		
		CartItem cartItem  = new CartItem();
		cartItem.setProduct(product);
		cartItem.setQuantity(1);
		cartItem.setTotalPrice(product.getProductPrice() * cartItem.getQuantity());
		cartItem.setCart(cart);
		System.out.println(cartItem.toString());
		cartItemService.addCartItem(cartItem);
	}
	
	
	
	@RequestMapping(value="/remove/{productId}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable(value="productId") int productId) {
		CartItem cartItem = cartItemService.getCartItemByProductId(productId);
		cartItemService.removeCartItem(cartItem);
	}
	
	
	
	
	
	@RequestMapping(value="/{cartId}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void clearCart(@PathVariable(value="cartId") int cartId) {
		Cart cart = cartService.getCartById(cartId);
		cartItemService.removeAllCartItems(cart);
	}
	
	
	
	
	
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, please verify your playload")
	public void handleClientErrors(Exception e) {}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "iNTERNAL sERVER eRROR")
	public void handleServerErrors(Exception e) {}
}
