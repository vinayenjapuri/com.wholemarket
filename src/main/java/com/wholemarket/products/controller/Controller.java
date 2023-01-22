package com.wholemarket.products.controller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wholemarket.products.entities.Product;
import com.wholemarket.products.service.ProductService;

@RestController
public class Controller {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product_services/products")
	public List<Product> getProducts() {
	
		return this.productService.getProducts();
	}
	
	@GetMapping("/product_services/products/product_id={product_id}")
	public Product getProductWithProductId(@PathVariable String product_id) {
		return this.productService.getProductByProductId(product_id);
	}
	
	

}
