// Java Program to Establish Connection in JDBC

// Importing database
import java.sql.*;
// Importing required classes
import java.util.*;

import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
// Main class
class PV_03_JDBC {

	// Main driver method
	public static void main(String a[])
	{

		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String url = "jdbc:mysql://localhost/collegenew1";

		// Usernamer and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "";

		// Entering the data
		Scanner k = new Scanner(System.in);

		System.out.println("enter name");
		String name = k.next();

		System.out.println("enter roll no");
		int roll = k.nextInt();

		System.out.println("enter class");
		String cls = k.next();

		// Inserting data using SQL query
		String sql = "insert into student values('" + name
					+ "'," + roll + ",'" + cls + "')";

		// Connection class object
		Connection con = null;

		// Try block to check for exceptions
		try {

			// Registering drivers
			Class.forName("com.mysql.jdbc.Driver");

			// Reference to connection interface
			con = DriverManager.getConnection(url, user,pass);

			// Creating a statement
			Statement st = con.createStatement();

			// Executing query
			int m = st.executeUpdate(sql);
			if (m == 1)
				System.out.println(
					"inserted successfully : " + sql);
			else
				System.out.println("insertion failed");

			// Closing the connections
			con.close();
		}

		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
		}
	}
}