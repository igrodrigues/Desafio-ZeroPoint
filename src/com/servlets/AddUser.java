package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.database.*;
import java.util.Date;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/addUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{
		UserDAO dao = new UserDAO();
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		if(!dao.busca(id)) {
			User user = new User();
			
			user.setId(id);
			user.setNome(request.getParameter("nome"));
			user.setSobrenome(request.getParameter("sobrenome"));
			user.setRg(request.getParameter("rg"));
			user.setCpf(request.getParameter("cpf"));
			user.setEmail(request.getParameter("email"));
			user.setSenha(request.getParameter("senha"));
			user.setTelefone(request.getParameter("telefone"));
			user.setEndereco(request.getParameter("endereco"));
			user.setComplemento(request.getParameter("complemento"));
			user.setNumero(request.getParameter("numero"));
			user.setCidade(request.getParameter("cidade"));
			user.setEstado(request.getParameter("estado"));
			Date date = new Date();
			user.setDatacriacao(date.toGMTString());
			user.setDataalt(date.toGMTString());
			user.setStatus("L");
			
			dao.adiciona(user);
	        request.setAttribute("msg", "O usuário foi adicionado com sucesso!");
		}
		else {
			request.setAttribute("msg", "Usuário já existe");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/userMenu.jsp");
		rd.forward(request,response);
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
