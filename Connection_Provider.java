package com.Student.Manage;

import java.sql.Connection;
import java.sql.DriverManager;




public class Connection_Provider {
	static Connection con;
	
	public static void createConnection() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user="dipali";
		String password="root@123";
		String url="jdbc:mysql://localhost:3306/student_manage";
		
		
		con=DriverManager.getConnection(url, user, password);
		System.out.println("Connection establish successfully");
		
		
     	}catch(Exception e){
     		e.printStackTrace();
     	}
	}

	public static void main(String[] args) {
		createConnection();

	}

}
