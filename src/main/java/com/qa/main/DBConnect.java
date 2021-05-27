package com.qa.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.qa.util.DBConfig;

public class DBConnect {

	private PreparedStatement ps;
	private Connection con;
	private ResultSet rs;
	
	public DBConnect() throws SQLException{
//		System.out.println(DBConfig.url);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_customer", DBConfig.user, DBConfig.password);
	}
	
	// CREATE

	public void create(String name) throws SQLException {
		String sql = "INSERT INTO customer (name) VALUES (?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.execute();
	}
	// READ
	public void read() throws SQLException {
		String sql = "SELECT * FROM customer";
		ps = con.prepareStatement(sql);
		ps.executeQuery();
		if(!rs.next()) {
			System.out.println("Nothing here");
		}else {
			do {
				System.out.println(String.format("ID: %d, Name: %s", rs.getInt("id"), rs.getString("name")));
			}while(rs.next());
		}
	}
	
	// UPDATE
	
	// DELETE
	
	// TEARDOWN
	public void tearDown() throws SQLException {
        con.close();
    }
	
}
