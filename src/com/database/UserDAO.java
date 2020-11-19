package com.database;

import java.sql.*;

public class UserDAO {
	private Connection connection;
	
	public UserDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(User user) {
		String sql = "insert into users "+"(id,"
										+ "nome,"
										+ "sobrenome,"
										+ "rg,"
										+ "cpf,"
										+ "email,"
										+ "senha,"
										+ "telefone,"
										+ "endereço,"
										+ "complemento,"
										+ "numero,"
										+ "cidade,"
										+ "estado,"
										+ "datacriacao,"
										+ "dataalt,"
										+ "status)"+" values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			String[] a = user.getAll();
			for(int i = 0; i < user.getSize(); i++) {
				stmt.setString(i, a[i]);
			}
			
			stmt.execute();
			stmt.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public User busca(String id) {
		String sql = "select * from users where id = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(!rs.next()) {
				rs.close();
				stmt.close();
				return null;
			}
			User user = new User();
			user.setId(rs.getString("id"));
			return user;
		}catch(SQLException e) {
			
		}
		return null;
	}
}


//	stmt.setString(1, user.getId());
//stmt.setString(2, user.getNome());
//stmt.setString(3, user.getSobrenome());
//stmt.setString(4, user.getRg());
//stmt.setString(5, user.getCpf());
//stmt.setString(6, user.getEmail());
//stmt.setString(7, user.getSenha());
//stmt.setString(8, user.getTelefone());
//stmt.setString(9, user.getEndereço());
//stmt.setString(10, user.getComplemento());
//stmt.setString(11, Integer.toString(user.getNumero()));
//stmt.setString(12, user.getCidade());
//stmt.setString(13, user.getEstado());
//stmt.setString(14, user.getDatacriacao().toString());
//stmt.setString(15, user.getDatacriacao().toString());
//stmt.setString(16, String.valueOf(user.getStatus()));