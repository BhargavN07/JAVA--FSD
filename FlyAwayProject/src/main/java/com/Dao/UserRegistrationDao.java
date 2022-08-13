package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserRegistrationDao  {
	String url ="jdbc:mysql://localhost:3306/flyawaydb";
	String username="root";
	String password="N.Bhargav7";
	String sql = "INSERT INTO userlogin (Name,Email,Password) VALUES (?,?,?);";
	
	public boolean check(String name, String email, String pass){
		boolean flag =false;
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			PreparedStatement st = con.prepareStatement(sql);
			
			
			st.setString(1,name);
			st.setString(2,email);
			st.setString(3,pass);
			
			
			int rs = st.executeUpdate();
			
			if(rs == 1){
				flag =true;
				return flag;
			}
			
		
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		return flag;
		
		
		
		
		
	}
	
	
}
	
