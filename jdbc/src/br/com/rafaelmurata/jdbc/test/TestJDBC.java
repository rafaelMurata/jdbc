package br.com.rafaelmurata.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.rafaelmurata.jdbc.ConnectionFactory;


public class TestJDBC {

	public static void main(String[] args) throws SQLException {

		Connection connection = new ConnectionFactory().getConnection();
		
		System.out.println("Connection is open!");
		
		connection.close();
	}

}
