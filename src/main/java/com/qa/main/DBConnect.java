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
		con = DriverManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
	}
	
	// CREATE

	// READ
	
	// UPDATE
	
	// DELETE
	
	// TEARDOWN
	public void tearDown() throws SQLException {
        con.close();
    }
	
}
