package com.store.controller;

import com.store.service.CustomerService;

public class UpdateCustomerbyId {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
	boolean res =	customerService.updateProductById(1,"Manaya055@gmail.com");
	System.out.println(res);
	}
}
