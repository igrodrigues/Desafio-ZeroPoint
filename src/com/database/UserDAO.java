package com.database;

import java.sql.*;

public class UserDAO {
	private Connection connection;
	
	public UserDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(User user) {
		String sql = "insert into users "+"()"+" values()";
	}
}
