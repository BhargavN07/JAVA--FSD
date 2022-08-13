package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ChangePasswordDao {
	String url ="jdbc:mysql://localhost:3306/flyawaydb";
	String username="root";
	String password="N.Bhargav7";
	String sql = "Update AdminLogin set Password=? Where Email=?;";
	
	public boolean check(String pass){
		boolean flag =false;
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			PreparedStatement st = con.prepareStatement(sql);
			
			
			st.setString(1,pass);
			st.setString(2,"abc@gmail.com");
			
			
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
