package com.database;

import java.sql.*;

public class ConnectionFactory {
	private String url = "jdbc:postgresql://localhost/users";
	private String user = "postgres";
	private String password = "2438416";
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(url, user, password);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
