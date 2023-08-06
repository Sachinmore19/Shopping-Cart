package com.shoppingcart.adminpanel.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.adminpanel.product.model.Product;
import com.shoppingcart.adminpanel.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(Integer id) {
		
		return productRepository.findById(id);
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
		
		
	}
	

}
