package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.ChangePasswordDao;


@SuppressWarnings("serial")
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			   PrintWriter out = response.getWriter();
			   response.setContentType("text/html");
			   
		       ChangePasswordDao newPass = new ChangePasswordDao();
		       String pass = request.getParameter("newPassword");
		       
		       
		       if (!AdminLogin.isLoggedIn){
		            out.println("You must login first");
		        }
		        else if (pass.equals("")){
		            out.println("Password can't be empty");
		        }
		        else if (AdminLogin.isLoggedIn && !pass.equals("")){
		             if(newPass.check(pass)){
		            	 out.println("<h2>Password changed.</h2><br> New Password is "+"<b>"+ pass +"</br>");
		            	 out.println("<br><br>");
		            	 out.println("<a href=\"AdminLogin.jsp\">Admin Login</a>");
		             }
		            
		        }
		        else {
		            out.println("Sorry, Something went wrong");
		        }
		
		
		
	}

}