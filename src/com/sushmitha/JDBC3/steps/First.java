package com.sushmitha.JDBC3.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class First {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//1.load driverss

	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	Connection con;
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC3?user=root&password=root");
		String query="select * from student where rollno=101";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		int rollno=rs.getInt("rollno");
		String name=rs.getString("name");
		String city=rs.getString("city");
		System.out.println(rollno+" "+name+" "+city);
		st.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
	

 
	}

}
