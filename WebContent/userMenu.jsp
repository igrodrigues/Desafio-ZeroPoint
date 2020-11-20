<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
		<title>Lista de Usuários</title>
		<link rel="stylesheet" type="text/css" href="/ZeroPointContatos/style.css">
	</head>
	<body>
		<%@ page import="com.database.*" import="java.util.*"%>
		${msg}<br>
		 <%
		  UserDAO dao = new UserDAO();
		  List<User> users = dao.getLista();
		
		  for (User user : users) {
		  %>
		    <li><%=user.getNome()%>, <%=user.getSobrenome()%>:<%=user.getEndereco()%></li>
			
		  <%
		  }
		  %>
		<button id="myBtn">Adicionar Usuário</button>
		<div id="AddModal" class="modal">
		  <div class="modal-content">
		    <div class="modal-body">
			    <span class="close">&times;</span>
			      <form action="addUser" method="POST">
					Id: <input type="text" name="id"><br> 
					Nome: <input type="text" name="nome"><br>
					Sobrenome: <input type="text" name="sobrenome"><br> 
					E-mail: <input type="text" name="email"><br>
					RG: <input type="text" name="rg"><br>
					CPF: <input type="text" name="cpf"><br>
					Senha: <input type="text" name="senha"><br>
					Telefone: <input type="text" name="telefone"><br>
					Endereço: <input type="text" name="endereco"><br>
					Complemento: <input type="text" name="complemento"><br>
					Número: <input type="text" name="numero"><br>
					Cidade: <input type="text" name="cidade"><br>
					Estado: <input type="text" name="estado"><br>
				    <input type="submit" value="Salvar" />
			    </form>
			</div>
		  </div>
		</div>
		<script type="text/javascript" src="/ZeroPointContatos/script.js"></script>
	</body>
</html>