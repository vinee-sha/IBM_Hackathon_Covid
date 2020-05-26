package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.DbConnection;
import com.dto.User;

public class UserDAO {

	public User getUser(String emailId, String password) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		connection = DbConnection.getConnection();
		String SELECT = "select * from covid where emailid = ? and password = ?";

		try {
			preparedStatement = connection.prepareStatement(SELECT);
			preparedStatement.setString(1, emailId);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				User user = new User();

				
				user.setName(resultSet.getString(2));
				user.setEmailId(resultSet.getString(1));
				user.setPassword(resultSet.getString(3));

				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
	public int register(User user) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int result = 0;

		connection = DbConnection.getConnection();

		String INSERT = "insert into covid values(?, ?, ?)";

		try {
			preparedStatement = connection.prepareStatement(INSERT);
			
			preparedStatement.setString(1, user.getEmailId());
			preparedStatement.setString(2, user.getName());
			preparedStatement.setString(3, user.getPassword());

			result = preparedStatement.executeUpdate();
			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally{
			if(connection != null){
				try {
					preparedStatement.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	
	
	

}