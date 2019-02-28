package com.galosoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.galosoft.dao.AuthoritiesDao;
import com.galosoft.dao.BillingAddressDao;
import com.galosoft.dao.CartDao;
import com.galosoft.dao.CustomerDao;
import com.galosoft.dao.ShippingAddressDao;
import com.galosoft.dao.UserDao;
import com.galosoft.entities.Authorities;
import com.galosoft.entities.BillingAddress;
import com.galosoft.entities.Cart;
import com.galosoft.entities.Customer;
import com.galosoft.entities.ShippingAddress;
import com.galosoft.entities.User;
import com.galosoft.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private BillingAddressDao billingAddressDao;
	
	@Autowired
	private ShippingAddressDao shippingAddressDao;
	
	@Autowired
	private AuthoritiesDao authoritiesDao;
	
	@Autowired
	private CartDao cartDao;
	

	@Override
	public void addCustomer(Customer customer) {
	
		billingAddressDao.save(customer.getBillingAddress());
		shippingAddressDao.save(customer.getShippingAddress());
		
		User newUser = new User();
		newUser.setUsername(customer.getUsername());
		newUser.setPassword(customer.getPassword());
		newUser.setEnabled(true);
		newUser.setCustomer(customer);
		
		userDao.save(newUser);
		
		Authorities newAuthority = new Authorities();
		newAuthority.setUsername(customer.getUsername());
		newAuthority.setAuthority("ROLE_USER");
		authoritiesDao.save(newAuthority);
		
		Cart newCart = new Cart();
		newCart.setCustomer(customer);
        cartDao.save(newCart);
		
		customer.setCart(newCart);
		customer.getBillingAddress().setCustomer(customer);
		customer.getShippingAddress().setCustomer(customer);
		customerDao.save(customer);
	}


	@Override
	public Customer getCustomerById(int customerId) {
		return customerDao.getOne(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.findAll();
	}

	@Override
	public Customer getCustomerByUsername(String username) {
		return customerDao.getCustomerByUsername(username);
}

}