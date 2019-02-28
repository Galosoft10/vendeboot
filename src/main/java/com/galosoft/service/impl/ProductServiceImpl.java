package com.galosoft.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.galosoft.dao.ProductDao;
import com.galosoft.entities.Product;
import com.galosoft.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getProductList() {
		return productDao.findAll();
	}

	@Override
	public Product getProductById(int id) {
		return productDao.getOne(id);
	}

	@Override
	public void addProduct(Product product) {
		productDao.save(product);
		
	}

	@Override
	public void editProduct(Product product) {
		productDao.save(product);
	}

	@Override
	public void deleteProduct(Product product) {
		productDao.delete(product);
		
    }
}
