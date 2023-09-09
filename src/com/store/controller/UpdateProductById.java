package com.store.controller;

import com.store.service.ProductService;

public class UpdateProductById {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
	boolean res = 	productService.updateProduct(3, 250000);
	System.out.println(res);
	}
}
