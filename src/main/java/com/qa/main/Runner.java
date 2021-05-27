package com.qa.main;

import java.sql.SQLException;
import java.util.Scanner;

public class Runner {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws SQLException {
		
		DBConnect db = new DBConnect();
		
		int userChoice = getChoice();
		
		try {
			do {
				
			}while(userChoice != 6);
		}catch(Error e) {
			e.getMessage();
		}finally {
			db.tearDown();
		}
	}
	private static int getChoice() {
	  String menu = "Customer Menu:\n"
	  		+ "\t- 1     - Create a new customer\n"
	  		+ "\t- 2     - Read all customers\n" 
			+ "\t- 3     - Read one customers\n"
	        + "\t- 4     - Update a customer\n" 
			+ "\t- 5     - Delete a customer\n\n" 
	        + "\t- 6     - Exit Application\n";
	  System.out.println(menu);
	  return Integer.parseInt(scan.nextLine().toLowerCase().trim());
	}
}


