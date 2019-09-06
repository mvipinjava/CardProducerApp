package com.app.util;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DbConnUtil {

	private static Connection con=null;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/card", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConn() {
		return con;
	}
	
	
	
	
}


