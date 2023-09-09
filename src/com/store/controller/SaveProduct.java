package com.store.controller;

import com.store.dto.Product;
import com.store.service.ProductService;

public class SaveProduct {
	public static void main(String[] args) {
		Product product = new Product();
		product.setId(3);
		product.setName("Mobile");
		product.setBrand("Apple");
		product.setPrice(90000);
		
		ProductService productService = new ProductService();
		Product p =	productService.saveProduct(product);
		
		if(p != null) {
			System.out.println("Produt Saved...!");
		}
	}
}
