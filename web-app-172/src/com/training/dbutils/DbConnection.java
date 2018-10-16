package com.training.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	Connection connection;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bootcamp172";
			String user = "root";
			String password = "";
			connection = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
