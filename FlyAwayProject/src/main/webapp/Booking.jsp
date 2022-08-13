<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="com.Dao.Booking" %>
   
   <%
   Booking.filght_id = request.getParameter("flight_id");
   Booking.flight_name = request.getParameter("flight_name");
   Booking.ticket_price = Integer.parseInt(request.getParameter("ticket_price"));
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
<title>Booking Details</title>
</head>
<body>
	<h1><b>Booking Details</b></h1>
	<h3><b>Enter Passenger Details</b></h3>
	<div class="one">
	<form action="Payment.jsp" method="post"> 
	
	<label for="pname">Passenger Name : </label>
	<input type="text" name="pname" ><br><br>
	
	<label for="email">Email address :  </label>
	<input type="email" name="pemail" ><br><br>
	
	<label for="phone">Phone number :   </label>
	<input type="number" name="pphone"><br><br>
	
	<button class ="second" type="submit" value="Submit" >Submit</button>
	</form>	
	</div>
</body>
</html>