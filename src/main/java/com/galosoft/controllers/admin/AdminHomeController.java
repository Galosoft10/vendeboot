package com.galosoft.controllers.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.galosoft.entities.Customer;
import com.galosoft.entities.Product;
import com.galosoft.service.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminHomeController {
	
	@Autowired
	private ProductService productService;
	
	//@Autowired
	//private CustomerService customerService;
	
	@RequestMapping
	public String adminPage() {
		return "admin";
	}
	
	@RequestMapping("/productInventory")
	public String productInventory(Model model) {
		List<Product> products = productService.getProductList();
		model.addAttribute("products", products);
		return "productInventory";
	}
	
	/*@RequestMapping("/customer")
	public String customerManager(Model model) {
		List<Customer> customerList = customerService.getAllCustomers();
		model.addAttribute("customerList", customerList);
		return "customerManagement";
	}*/

}
