<%@page import="com.Dao.Search"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="com.Dao.Booking" %>
<%@ page import="com.Dao.Search"%>
<% Booking.passenger_email=request.getParameter("pemail");
    Booking.passenger_name=request.getParameter("pname");
    Booking.passenger_phone=request.getParameter("pphone");
   
   if (Booking.passenger_name.equals("")
           || Booking.passenger_email.equals("")
           || Booking.passenger_phone.equals("")) {
       out.println("<h1 style='color:red;'Please enter valid passenger details</h1>");
   	   RequestDispatcher rd= request.getRequestDispatcher("Booking.jsp");
       rd.include(request, response);
   }
   else {
 %>
<!DOCTYPE html>
<html>
<head>
<style>
	h1{
	border: 1px outset black;
  	background-color: pink;
 	text-align: center;
 	padding: 20px;
	}
	h3{
	border: 1px dashed black;
	padding: 20px;
	text-align: center;
	text-transform: uppercase;
	}
	.one{
	border-radius: 5px;
 	background-color: #f2f2f2;
  	padding: 20px;
  	font: bold;
  	text-align: center;
	}

 	.second{
 	background-color: pink;
 	padding: 5px;
 	font: bold;
  	text-align: center;
 	}

</style>
<meta charset="ISO-8859-1">
<title>Payment Details</title>
</head>
<body>
	<h1><b>Payment Portal ! </b></h1>
		<h3><b>Enter Passenger Details</b></h3>
		<div class="one">
		<form action="ThankYou.jsp" method="post"> 
		
		<label for="card_details"> UPI ID : </label>
		<input type="text" name="name_on_card" placeholder="Enter UPI ID"><br><br>
		
		<label for="mobileno">Mobile Number :  </label>
		<input type="number" name="mobileno" placeholder="Enter Mobile Number">
		
		<p><span><strong>Total Amount For <%= Search.persons %> persons is Rs. <b style="color: red;"> <%=Booking.ticket_price *Search.persons%> </b></strong></span>
		<br><br>
		<button class ="second" type="submit" value="Submit" >Pay Through UPI</button>
		</form>	
		</div>

</body>
</html>
<%
    }
%>