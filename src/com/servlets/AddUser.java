package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.*;
import java.util.Date;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/addUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		User user = new User();
		user.setId(request.getParameter("id"));
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
		
		UserDAO dao = new UserDAO();
		dao.adiciona(user);
		
//		out.println("<html>");
//        out.println("<body>");
//        out.println("Contato " + user.getNome() +
//                " adicionado com sucesso");       
//        out.println("</body>");
//        out.println("</html>");
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
