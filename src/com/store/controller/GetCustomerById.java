package com.store.controller;

import com.store.service.CustomerService;

public class GetCustomerById {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		customerService.getCustomerById(3);
	}
}
