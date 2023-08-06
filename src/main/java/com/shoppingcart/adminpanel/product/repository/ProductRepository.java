package com.shoppingcart.adminpanel.product.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingcart.adminpanel.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Serializable> {
	public Product findById(Integer id);

}
