package com.store.controller;

import com.store.service.ProductService;

public class GetProductByID {

	public static void main(String[] args) {
		ProductService productService = new ProductService();
		 productService.getPoductByID(3);
			
		}
}
