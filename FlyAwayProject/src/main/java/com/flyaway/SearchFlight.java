package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.Search;

@SuppressWarnings("serial")
@WebServlet("/SearchFlight")
public class SearchFlight extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		Search.date = req.getParameter("date");
        Search.source = req.getParameter("source");
        Search.destination = req.getParameter("destination");
        Search.persons = Integer.parseInt(req.getParameter("persons"));
		
		if(Search.date.equals("")) {
			out.println("Please enter a valid date");
			
		}else {
			//out.println(date);
			Search.day = getDay(Search.date);
			//out.println(day);
			resp.sendRedirect("SearchResult.jsp");
		}
	}
	public String getDay(String dateInp) {
		LocalDate dt = LocalDate.parse(dateInp);
		return dt.getDayOfWeek().toString();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
