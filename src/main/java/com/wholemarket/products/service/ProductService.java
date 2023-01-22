package com.wholemarket.products.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wholemarket.products.entities.Product;

@Service
public class ProductService implements AbstractProduct {
	
	public List<Product> arrayList;
	
	public ProductService() {
		this.arrayList = new ArrayList<>();
		this.arrayList.add(new Product("1", "Milk", "Milk is rich in calcium", null, null, null, null, null, null, null, null, null, null, null, null));
		this.arrayList.add(new Product("2", "Potato", "Potato is rich in sodium", null, null, null, null, null, null, null, null, null, null, null, null));
	}

	@Override
	public List<Product> getProducts() {
		
		return this.arrayList;
		
	}

	@Override
	public Product getProductByProductId(String product_id) {
		int productIdToBeSearched = Integer.parseInt(product_id); 
		Product products = null;
		for(Product product: arrayList) {
			int productId = Integer.parseInt(product.getProduct_id());
			if(productId==productIdToBeSearched) {
				products = product;
				break;
			}
		}
		
		return products;
	}


}
