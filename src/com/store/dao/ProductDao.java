package com.store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.store.configuration.HelperClass;
import com.store.dto.Product;

public class ProductDao {
	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	public Product saveProduct(Product product) {
		connection = helperClass.getConnection();
		String sql = "INSERT INTO product VALUES(?,?,?,?)";

		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setString(3, product.getBrand());
			preparedStatement.setInt(4, product.getPrice());

			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return product;

	}

	// to delete product
	public boolean deleteProduct(int id) {
		connection = helperClass.getConnection();
		String sql = "DELETE FROM product WHERE id=?";
		int i = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			i = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}

//get Product by id
	public int getPoductByID(int id) {

		connection = helperClass.getConnection();
		String sql = "SELECT * FROM product WHERE id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();
			{
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getString(3));
					System.out.println(resultSet.getInt(4));
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return id;

	}

//update product
	public boolean updateProduct(int id, int price) {
		connection = helperClass.getConnection();
		String sql = "UPDATE product SET price = ? WHERE ID = ?";
		int i = 0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, price);
			preparedStatement.setInt(2, id);

			i = preparedStatement.executeUpdate();
			if (i > 0) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;

	}

	// getAll Product by id
	public void getALLProduct() {

		connection = helperClass.getConnection();
		String sql = "SELECT * FROM product";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();
			{
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getString(3));
					System.out.println(resultSet.getInt(4));
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
