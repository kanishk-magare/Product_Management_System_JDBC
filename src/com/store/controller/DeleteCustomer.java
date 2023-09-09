package com.store.controller;

import com.store.service.CustomerService;

public class DeleteCustomer {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		customerService.deleteCustomerById(1);
			
	}
}
