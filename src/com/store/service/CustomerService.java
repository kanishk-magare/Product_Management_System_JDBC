package com.store.service;

import com.store.dao.CustomerDao;
import com.store.dto.Customer;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();

	// save customer
	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	// delete customer
	public int deleteCustomerById(int id) {
		return customerDao.deleteCustomerById(id);
	}

	// GetAll custoomers
	public void getAllCustomers() {
		customerDao.getAllCustomers();
	}

	// get Customer by id
	public int getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

	// update customer
	public boolean updateProductById(int id, String email) {
		return customerDao.updateProductById(id, email);
	}
}
