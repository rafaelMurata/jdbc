package br.com.rafaelmurata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		System.out.println("Connecting to database");

		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/javaweb", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
