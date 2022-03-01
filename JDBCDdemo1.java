package classAlma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JDBCDdemo1 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load the Driver or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish a connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alma","root","root");
			
			System.out.println(con);
			
			//Step 3 - Create a statement
			Statement stmt=con.createStatement();
			
			int n=stmt.executeUpdate("insert into users values (1,'mohan','secret',0)");
			
			System.out.println("No of Rows Updated...:"+n);
			
			n=stmt.executeUpdate("update users set flag=1");
			System.out.println("No of rows updated...:"+n);
			
			n=stmt.executeUpdate("delete from users");
			System.out.println("No of rows deleted..:"+n);
			
	}
}
