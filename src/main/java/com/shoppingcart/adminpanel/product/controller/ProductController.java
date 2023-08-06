package com.shoppingcart.adminpanel.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.Delimiter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.adminpanel.product.model.Product;
import com.shoppingcart.adminpanel.product.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	//save the product in database
	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveproduct(@RequestBody Product product){
		Product prod=productService.saveProduct(product);
		return ResponseEntity.ok(prod);
	}
	
	//fetch the data using id
	@GetMapping("/getProduct/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id){
		Product prod=productService.getProductById(id);
		return ResponseEntity.ok().body(prod);
		
	}
	
	//delete the product by id
	@DeleteMapping("deleteProduct/{id}")
	public void deleteProductById(@PathVariable("id") Integer id) {
		productService.deleteProduct(id);
	}
	
}
