<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
 .Header{
  border: 1px outset black;
  background-color: pink;
  text-align: center;
}
 .One{
	border-radius: 5px;
 	background-color: #f2f2f2;
  	padding: 20px;
}
 .second{
 
 background-color: pink;
 padding: 5px;
 }
</style>
<meta charset="ISO-8859-1">
<title>Search Flight</title>
</head>
<body>
	<div class="Header">
		<h1>FlyAway Airlines Welcomes you..</h1>
		<h2 >Certified as the Best Airlines</h2><br>
	</div>
	
	<div class="One">
	<h2>Ticket Booking</h2>
	<form action="SearchFlight" method="post">
	<b><label for="date">Date : </label></b>
	<input type="date"   id="date" name="date" placeholder="yyyy-mm-dd"><br><br>
	
	<b><label for="source">Source : </label></b>
		<select  id="source" name="source">
			<option value="India">India</option>
            <option value="China">China</option>
            <option value="Australia">Australia</option>
            <option value="Dubai">Dubai</option>
            <option value="Russia">Russia</option>
            <option value="Thailand">Thialand</option>
            <option value="Singapore">Singapore</option>
            <option value="Ukraine">Ukraine</option>
            <option value="Iran">Iran</option>
            <option value="Israel">Israel</option>
            <option value="USA">USA</option>
            <option value="UK">UK</option>
        </select>
        
     <b> <label for="destination">Destination : </label></b>
          	<select  id="destination" name="destination">
               <option value="USA">USA</option>
               <option value="UK">UK</option>
               <option value="India">India</option>
               <option value="Iran">Iran</option>
               <option value="Pakistan">Pakistan</option>
               <option value="Australia">Australia</option>
               <option value="Dubai">Dubai</option>
               <option value="Ukraine">Ukraine</option>
               <option value="Singapore">Singapore</option>
               <option value="Israel">Israel</option>
             </select>  <br><br>
	
		<b><label for="persons">No of Persons : </label></b>
              <select id="persons" name="persons">
                 <option value="1">1</option>
                 <option value="2">2</option>
                 <option value="3">3</option>
                 <option value="4">4</option>
                 <option value="5">5</option>
              </select>
              
        
        <h3><button class="second" type="submit"  value="Submit"><b>Search Flights</b></button></h3> 
	  </form>
	</div>

</body>
</html>