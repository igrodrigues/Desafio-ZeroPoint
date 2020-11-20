package com.database;

public class Teste {
	private void main(String args[]) {
		User user = new User();
		user.setId("abc");
		user.setNome("Igor");
		UserDAO dao = new UserDAO();
		dao.adiciona(user);
	}
}
