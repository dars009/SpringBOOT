package com.happychoise.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentrapide?useSSL=false", "root",
					"root");
		} catch (Exception e) {
			System.out.println("Error while connectiong DB");
		}
		return conn;
	}
}
