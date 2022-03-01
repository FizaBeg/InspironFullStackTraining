package classAlma;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo1 {
	public static void main(String[] args) throws Exception {
		//Step1 - Load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("driver loaded");
				
				// Step 2 - Establish a connection
				Connection con =
						DriverManager.getConnection("jdbc:mysql://localhost/alma","root", "root");
				System.out.println("connection successful...: " + con);
			
	}

}
