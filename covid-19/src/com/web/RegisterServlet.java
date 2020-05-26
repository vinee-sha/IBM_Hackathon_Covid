package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDAO;
import com.dto.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String emailId = request.getParameter("emailId");
		String name  = request.getParameter("name");
		String password = request.getParameter("password");

		User user = new User(emailId, name, password);
		
		UserDAO userDAO = new UserDAO();
		int result = userDAO.register(user);                
		
		if(result > 0){
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("covid2.jsp");
			requestDispatcher.include(request, response); 

		}else{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Register.html");
			out.println("<html><h2>Registration Failed</h2></html>");
			requestDispatcher.include(request, response); 
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
