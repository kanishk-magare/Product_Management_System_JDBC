package com.store.service;

import com.store.dao.ProductDao;
import com.store.dto.Product;

public class ProductService {
	ProductDao productDao = new ProductDao();
//save Product
	public Product saveProduct(Product product) {

		return productDao.saveProduct(product);
	}
//Delete product
	public boolean deleteProduct(int id) {
		return productDao.deleteProduct(id);
	}
//GetProduct By id
	public int getPoductByID(int id) {
		return productDao.getPoductByID(id);
	}
//update Product
	public boolean updateProduct(int id, int price) {
		return productDao.updateProduct(id, price);
	}
//getALL product
	public void getALLProduct() {
		 productDao.getALLProduct();
	}
}
