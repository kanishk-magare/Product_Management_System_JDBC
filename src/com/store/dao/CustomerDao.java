package com.store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.store.configuration.HelperClass;
import com.store.dto.Customer;

public class CustomerDao {
	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	public Customer saveCustomer(Customer customer) {
		connection = helperClass.getConnection();
		String sql = "INSERT INTO customer VALUE(?,?,?)";

		PreparedStatement preparedStatement;

		try {
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, customer.getId());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setString(3, customer.getEmail());

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
		return customer;
	}

// delete customer
	public int deleteCustomerById(int id) {
		connection = helperClass.getConnection();
		String sql = "DELETE FROM customer WHERE id=?";
		int i = 0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			i = preparedStatement.executeUpdate();
			if (i > 0) {
				System.out.println(true);
			} else {
				System.out.println(false);
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

	// GetAll custoomers
	public void getAllCustomers() {
		connection = helperClass.getConnection();
		String sql = "SELECT * FROM customer";

		try {
			PreparedStatement preparedStatement =

					connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
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

	// get customer
	public int getCustomerById(int id) {
		connection = helperClass.getConnection();
		String sql = "SELECT * FROM customer WHERE id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
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
		}return id;

	}
	
	//update customeer
	public boolean updateProductById(int id , String email) {
		connection = helperClass.getConnection();
		String sql = "UPDATE customer SET email = ? WHERE id = ? ";
		int i = 0;
		
		try {
			PreparedStatement preparedStatement =
			connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setInt(2, id);
			
		i =	preparedStatement.executeUpdate();
		if(i>0) {
			return true;
		}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}return false;
		
		
	}

}
