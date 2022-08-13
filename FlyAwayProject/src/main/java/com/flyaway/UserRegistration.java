package com.flyaway;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserRegistrationDao;



@SuppressWarnings("serial")
@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		RequestDispatcher rd;
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		UserRegistrationDao  NewUser=new UserRegistrationDao();
		if(name.equals("")||email.equals("")||pass.equals("")) {
			out.println("<h2 style='color:red;'>Please Enter The Data Correctly !</h1>");
		}else {
			if(NewUser.check(name, email, pass)) {
				
				//resp.sendRedirect("UserLogin.jsp");
				out.println("<h2 style='color:green;'>User Registered Successfully</h2>");
				rd =req.getRequestDispatcher("UserLogin.jsp");
				rd.include(req, resp);
			}else {
				out.println("<h2 style='color:red;'>User Already Exits !</h2>");
				rd =req.getRequestDispatcher("UserLogin.jsp");
				rd.include(req, resp);
			}
		}	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
