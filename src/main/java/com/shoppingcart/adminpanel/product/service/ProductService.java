package com.shoppingcart.adminpanel.product.service;

import com.shoppingcart.adminpanel.product.model.Product;

public interface ProductService {
	public Product saveProduct(Product product);
	
	public Product getProductById(Integer id);
	
	public void deleteProduct(Integer id);
	

}
