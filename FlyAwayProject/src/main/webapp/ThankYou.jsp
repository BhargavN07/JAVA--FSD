<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.Dao.Booking" %>
<%@ page import="com.Dao.Search" %>
<% Booking.name_on_card = request.getParameter("name_on_card");
   Booking.mobileno=request.getParameter("mobileno");
   
   if(Booking.name_on_card.equals("")||Booking.mobileno.equals("")){
	   out.println("<h1 style='color:red;'Please enter valid card details</h1>");
        RequestDispatcher rd = request.getRequestDispatcher("Booking.jsp");
       	rd.include(request, response);
   }

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
	h2{
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
<title>Thank You</title>
</head>
<body>
	<h1><b>Thank You For Booking With Us...!</b></h1>
		<h2><b>Your Flight Ticket Has Been Successfully Booked! </b></h2>
	<div class="one">
        <h3 style="text-decoration: underline;"><strong>Ticket Details</strong></h3>
        <h4>From <%=Search.source%> to <%=Search.destination%> | <%=Search.date%> (<%=Search.day%>)</h4>
        <h4><%=Booking.filght_id%> --<%=Booking.flight_name%> --(Travellers <%=Search.persons%>)</h4>
        <br>
        <h3 style="text-decoration: underline;"><strong>Passenger Summary</strong></h3>
        <h4>Booking Name --<%=Booking.passenger_name%> | Email --<%=Booking.passenger_email%> | Phone --<%=Booking.passenger_phone%></h4>
        <br>
        <h3 style="text-decoration: underline;"><strong>Payment Summary</strong></h3>
        <h4>Payment By --<%=Booking.name_on_card%> | Mobile No --<%=Booking.mobileno%></h4>
        <br>
        <h2><strong>Total Paid -- Rs.<%=Search.persons*Booking.ticket_price%></strong></h2>
        
        <h3><button class="second" onclick="window.print()" >Print Ticket</button></h3>
        <a style="border: 1px outset black; padding: 5px" href="index.html">LOGOUT</a>
		</div>
</body>
</html>