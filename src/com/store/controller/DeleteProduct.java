package com.store.controller;

import com.store.service.ProductService;

public class DeleteProduct {
	public static void main(String[] args) {
		ProductService productService =new ProductService();
	boolean res = productService.deleteProduct(2);
		System.out.println(res);
	}
}
