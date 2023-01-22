package com.wholemarket.products.service;

import java.util.List;

import com.wholemarket.products.entities.Product;

public interface AbstractProduct {
	
	public List<Product> getProducts();
	public Product getProductByProductId(String productId);

}
