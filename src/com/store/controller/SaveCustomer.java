package com.store.controller;

import com.store.dto.Customer;
import com.store.service.CustomerService;

public class SaveCustomer {
	public static void main(String[] args) {
		Customer customer =new Customer();
		customer.setId(3);
		customer.setName("manya");
		customer.setEmail("manya@gmail.com");
		
		
		CustomerService customerService = new CustomerService();
		Customer c = customerService.saveCustomer(customer);
		if(c != null) {
			System.out.println("Saved.!!!");
		}else {
			System.out.println("Not Saved..!");
		}
		
	}
}
