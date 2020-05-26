package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.dto.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		session.setAttribute("emailId", emailId);
		session.setAttribute("password", password);
		
		out.println("<html>");

			UserDAO userDAO = new UserDAO();
			User user = userDAO.getUser(emailId, password);

			if(user != null){
				session.setAttribute("user", user);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("covid2.jsp");
				requestDispatcher.include(request, response); 
			}
			else{
				
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("Register.html");
				out.println("<html><h2>Invalid credentials</h2></html>");
				requestDispatcher.include(request, response);
			}	
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
