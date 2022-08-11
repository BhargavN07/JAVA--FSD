<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Product Details</title>
</head>
<body>
<% String name = request.getParameter("pname");
   String price = request.getParameter("pprice");
   String quantity = request.getParameter("pquantity");
   if (name == null || name.equals("") || price == null || price.equals("")) {%>
   <jsp:forward page="index.html"></jsp:forward>
   <%} else{
	   out.println("<h2>Product Detalis</h2><br>");
	   out.println("Name of the product is "+name+"<br><br>");
	   out.println("Cost of the product is Rs. "+price+"<br><br>");
	   out.println("Quantity Avaiable : "+quantity+"<br><br>");
   }
	   %>
   <a href="logout.jsp">Logout</a>





</body>
</html>