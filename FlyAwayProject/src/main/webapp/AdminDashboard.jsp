<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="com.flyaway.AdminLogin"%>
    
    
<%
    String driverName = "com.mysql.cj.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String dbName = "flyawaydb";
    String userId = "root";
    String password = "N.Bhargav7";
    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
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
  	font: bo
  	text-align: center;
	}

 	.second{
 	background-color: pink;
 	padding: 5px;
 	font: bold;
  	text-align: center;
 	}
 	.third{
 	margin-left: auto;
 	margin-right: auto;
 	}

</style>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>

	<%
    if (AdminLogin.isLoggedIn) {
	%>
	<h1 ><span><strong>Welcome Admin !</strong></span></h1>
	<h2><span><strong> Flight Table </strong></span></h2>
    <table class="third" border=1 cellpadding=10 cellspacing=0>
       <thead>
           <tr>
              <th scope="col">Flight_Id</th>
              <th scope="col">Flight_Name</th>
              <th scope="col">Source</th>
              <th scope="col">Destination</th>
              <th scope="col">Day</th>
              <th scope="col">Ticket_Price</th>
       	   </tr>
       </thead>
       <tbody>
           <%
             try{
                 connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                 statement=connection.createStatement();
                 String sql ="SELECT * FROM flightdetails";
                 resultSet = statement.executeQuery(sql);
                 while(resultSet.next()){
            %>
            <tr>
               <td><%=resultSet.getString("FlightId") %></td>
               <td><%=resultSet.getString("FlightName") %></td>
               <td><%=resultSet.getString("Source") %></td>
               <td><%=resultSet.getString("Destination") %></td>
               <td><%=resultSet.getString("Day") %></td>
               <td><%=resultSet.getString("TicketPrice") %></td>
            </tr>
                
                <%
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
    				}
           else {
                            out.print("You must Login first");
                        }
                    
                     
                %>
                </tbody>
            </table>	
            
            <div class="one">
            <form action="PasswordChange.jsp" method="post">
				<button class="second" type="submit">Change Password</button>
			</form>
			<br>
			<form action="index.html"method="post">
				<button class="second" type="submit">Logout</button>
			</form>
			</div>
	
</body>
</html>