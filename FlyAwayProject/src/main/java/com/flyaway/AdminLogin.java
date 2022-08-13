package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.AdminLoginDao;

@SuppressWarnings("serial")
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet{
	
	public static boolean isLoggedIn = false;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		AdminLoginDao admin= new AdminLoginDao();
		if(admin.check(email, pass)) {
			isLoggedIn=true;
			//out.println("User Logged In Successfully");
			resp.sendRedirect("AdminDashboard.jsp");
		}else {
			out.println("<h2 style='color:red;'>Login Failed : Incorrect email or Password</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.jsp");
			rd.include(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}