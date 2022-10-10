package com.chris.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApp {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_database?" +
				                                   "user=ChrisG260&password=0GvAVjHXYl!8");
			
			Statement statment = conn.createStatement();
			
			//Display current table values
			displayTable(statment);
			
			//insert employees_tbl (id, name, dept, salary) values(800, 'Juliet', 'Sales', 5500);
			//Returns rows affected as integer
			statment.executeUpdate("insert employees_tbl (id, name, dept, salary) values(910, 'Joe', 'Sales', 500);");
			System.out.println("\nAfter Update");
			displayTable(statment);
			
			//Delete data
			statment.executeUpdate("delete from employees_tbl where id=910");
			System.out.println("\nAfter Deleting");
			displayTable(statment);
			
			//Update data 
			statment.executeUpdate("update employees_tbl set salary=6 where id=700");
			System.out.println("\nAfter Updateing");
			displayTable(statment);
		
			
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		

	}
	
	public static void displayTable(Statement statment) throws SQLException
	{
		ResultSet resultSet = statment.executeQuery("select * from employees_tbl");
		
		//processRecord
		while(resultSet.next())	{
			System.out.println(resultSet.getString("id") + " " +
					resultSet.getString("name") + " " +
					resultSet.getString("dept") + " " +
					resultSet.getString("salary") + " " );
		}
		
	}

}
