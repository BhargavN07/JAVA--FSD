<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>    
<%@ page import="com.Dao.Search" %>
<%
    String driverName = "com.mysql.cj.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String dbName = "flyawaydb";
    String userId = "root";
    String password = "N.Bhargav7";
    String query = Search.getQuery();
    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	border-radius: 5px;
 	background-color: #f2f2f2;
  	padding: 20px;
  	text-align: center;
	}
	h3{
	border: 1px dashed black;
	padding: 20px;
	text-align: center;
	text-shadow: aqua;
	}
	b{
	color: blue;
	text-decoration: blink;	
	}


</style>
<meta charset="ISO-8859-1">
<title>FlyAway Airlines Welcomes you..</title>
</head>
<body>



    <h1 ><span><strong>FlyAway Airlines Welcomes you..</strong></span></h1>
    <h2><span><strong>
        You Searched flights from <b> <%= Search.source%> </b>  to <b><%=Search.destination%></b> <br>
        Date of travel : <b><%=Search.date%> (<%=Search.day%>)</b>  <br>
        No of travelers :  <b><%=Search.persons%> </b> <br>
   </strong></span></h2>
   
    <h3> AVAILABLE FLIGHTS</h3>
    <table border=1 cellpadding=10 cellspacing=0 >
        <thead>
        <tr bgcolor="lightblue">
            <th scope="col">Flight</th>
            <th scope="col">Source</th>
            <th scope="col">Destination</th>
            <th scope="col">Date</th>
            <th scope="col">Ticket Price(Rs)</th>
            <th scope="col">Select</th>
        </tr>
        </thead>
        <tbody>
        
        <%
            try{
                connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                statement=connection.createStatement();
                resultSet = statement.executeQuery(query);
                while(resultSet.next()){
        %>
        <tr bgcolor="#F5F5F5">
            <td><%=resultSet.getString("FlightName") %></td>
            <td><%=resultSet.getString("Source") %></td>
            <td><%=resultSet.getString("Destination") %></td>
            <td><%=Search.date%></td>
            <td><%=resultSet.getString("TicketPrice") %></td>
            <td>
                <form action="Booking.jsp" method="post">
                    <input type="hidden" id="name" name="flight_name" value="<%=resultSet.getString("FlightName")%>">
                    <input type="hidden" id="ticket_price" name="ticket_price" value="<%=resultSet.getString("TicketPrice")%>">
                    <input type="hidden" id="flight_id" name="flight_id" value="<%=resultSet.getString("FlightId")%>">
                    <input type="submit" class="btn btn-success" value="Book This Flight">
                </form>
            </td>
        </tr>
        <%
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
        </tbody>
    </table>


</body>
</html>